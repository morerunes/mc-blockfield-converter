/*  Copyright (C) Aaron Echols 2012
 * 
 *  This file is part of MC Block Field Converter.
 *
 *  MC Block Field Converter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MC Block Field Converter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser Public License
 *  along with MC Block Field Converter.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.morerunes.mcblockfieldconverter.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.morerunes.mcblockfieldconverter.BlockField;
import com.morerunes.mcblockfieldconverter.BlockType;

public class BlockFieldConverter {

	BlockField field;

	public BlockFieldConverter(String inputFileName)
			throws FileNotFoundException {
		this(new File(inputFileName));
	}

	public BlockFieldConverter(File inputFile) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new FileInputStream(inputFile));

		// Read field information
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();

			if (line.startsWith("#")) {
				// This line was a comment, skip it
				continue;
			} else if (!line.equals(":fieldinfo:")) {
				// this line isn't important right now
			} else {
				// this line starts our field info
				int layers = 0;
				int width = 0;
				int length = 0;
				String name = inputFile.getName().split("\\.")[0];
				char emptyBlockChar = '.';

				line = fileScanner.nextLine();
				while (!line.equals(":endfieldinfo:")) {
					if (!line.startsWith("#")) {
						String[] split = line.split("=");
						if (split[0].equals("layers")) {
							layers = Integer.parseInt(split[1]);
						} else if (split[0].equals("width")) {
							width = Integer.parseInt(split[1]);
						} else if (split[0].equals("length")) {
							length = Integer.parseInt(split[1]);
						} else if (split[0].equals("name")) {
							name = split[1];
						} else if (split[0].equals("emptyBlockChar")) {
							emptyBlockChar = split[1].charAt(0);
						}
					}
					line = fileScanner.nextLine();
				}

				// Now that we read our fields, make sure we have the required
				// fields
				if (layers <= 0 || width <= 0 || length <= 0) {
					fileScanner.close();
					throw new RuntimeException(
							"You must specify positive width, length, and height values!");
				}

				field = new BlockField(layers, width, length, name,
						emptyBlockChar);
				break;
			}
		}

		// Reset the file
		fileScanner.close();
		fileScanner = new Scanner(new FileInputStream(inputFile));

		// Read block type info
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();

			if (line.startsWith("#")) {
				// This line was a comment, skip it
				continue;
			} else if (!line.equals(":blocktypes:")) {
				// this line isn't important right now
			} else {
				// this line starts our block types info
				List<BlockType> blockTypes = new ArrayList<BlockType>();
				line = fileScanner.nextLine();

				while (!line.equals(":endblocktypes:")) {
					if (!line.startsWith("#")) {
						String[] split = line.split("\\s+");
						blockTypes.add(new BlockType(Character.valueOf(split[0]
								.charAt(0)), split[1], Integer
								.valueOf(split[2])));
					}
					line = fileScanner.nextLine();
				}

				// Make sure you defined at least one block type
				if (blockTypes.size() == 0) {
					fileScanner.close();
					throw new RuntimeException(
							"You must define at least one block type!");
				}

				field.setBlockTypes(blockTypes);

				break;
			}
		}

		// Reset the file
		fileScanner.close();
		fileScanner = new Scanner(new FileInputStream(inputFile));

		// Read the fields
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();

			if (line.startsWith("#")) {
				// This line was a comment, skip it
				continue;
			} else if (!line.equals(":fields:")) {
				// this line isn't important right now
			} else {
				// this line starts our fields
				char[][][] blockFields = new char[field.getLayers()][field
						.getLength()][field.getWidth()];
				
				for (int i = 0; i < field.getLayers(); i++) {
					StringBuilder fieldArray = new StringBuilder();
					
					// Create a string containing every value in the layer
					for (int j = 0; j < field.getLength(); j++) {
						fieldArray.append(fileScanner.nextLine());
					}
					
					// Convert our string to a char[] for easy access
					char[] currentLayer = fieldArray.toString().toCharArray();
					int index = 0;
					
					for (int j = 0; j < field.getLength(); j++) {
						for (int k = 0; k < field.getWidth(); k++) {
							blockFields[i][j][k] = currentLayer[index];
							index++;
						}
					}
					
					// Skip the blank line
					if (fileScanner.hasNextLine())
						fileScanner.nextLine();
				}
				
				// Pass our newly created blockFields to field
				field.setBlockField(blockFields);

				break;
			}
		}

		fileScanner.close();
	}
	
	public BlockField getBlockField() {
		return field;
	}

	public String toString() {
		return field.toString();
	}

}
