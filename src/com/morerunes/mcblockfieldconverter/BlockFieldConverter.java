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
