/*  Copyright (C) Aaron Echols 2012
 * 
 *  This file is part of MC Block Field Converter.
 *
 *  MC Block Field Converter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MC Block Field Converter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MC Block Field Converter.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.morerunes.mcblockfieldconverter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlockFieldConverter {
	
	BlockField field;

	public BlockFieldConverter(String inputFileName)
			throws FileNotFoundException {
		this(new File(inputFileName));
	}

	public BlockFieldConverter(File inputFile) throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream(inputFile);
		Scanner fileScanner = new Scanner(inputStream);

		// Read field information
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();

			if (line.startsWith("#")) {
				// This line was a comment, skip it
				continue;
			} else if (!line.contains(":fieldinfo:")) {
				// this line isn't important right now
			} else {
				// this line starts our field info
				int layers = 0;
				int width = 0;
				int length = 0;
				String name = inputFile.getName().split("\\.")[0];
				char emptyBlockChar = '.';

				line = fileScanner.nextLine();
				while (!line.contains(":endfieldinfo:")) {
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
					line = fileScanner.nextLine();
				}

				// Now that we read our fields, make sure we have the required
				// fields
				if (layers <= 0 || width <= 0 || length <= 0) {
					throw new RuntimeException(
							"You must specify positive width, length, and height values!");
				}

				field = new BlockField(layers, width, length, name,
						emptyBlockChar);
				break;
			}
		}

		fileScanner.close();
	}
	
	public String toString() {
		return field.toString();
	}

}
