/*  Copyright (C) Aaron Echols 2012
 * 
 *  This file is part of MC Block Field Converter.
 *
 *  MC Block Field Converter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MC Block Field Converter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with MC Block Field Converter.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.morerunes.mcblockfieldconverter;

import java.util.Arrays;
import java.util.List;

public class BlockField {

	// Required Fields from file
	private int layers;
	private int width;
	private int length;

	// Optional Fields from file
	private String name;
	private char emptyBlockChar;

	// Other info
	private List<BlockType> blockTypes;
	private char[][][] blockField;
	
	public BlockField(int layers, int width, int length, String name) {
		this.layers = layers;
		this.width = width;
		this.length = length;
		this.name = name;
	}

	public BlockField(int layers, int width, int length, String name,
			char emptyBlockChar) {
		this.layers = layers;
		this.width = width;
		this.length = length;
		this.name = name;
		this.emptyBlockChar = emptyBlockChar;
	}

	public int getLayers() {
		return layers;
	}

	public void setLayers(int layers) {
		this.layers = layers;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getEmptyBlockChar() {
		return emptyBlockChar;
	}

	public void setEmptyBlockChar(char emptyBlockChar) {
		this.emptyBlockChar = emptyBlockChar;
	}

	public List<BlockType> getBlockTypes() {
		return blockTypes;
	}

	public void setBlockTypes(List<BlockType> blockTypes) {
		this.blockTypes = blockTypes;
	}

	public char[][][] getBlockField() {
		return blockField;
	}

	public void setBlockField(char[][][] blockField) {
		this.blockField = blockField;
	}

	@Override
	public String toString() {
		return "BlockField [layers=" + layers + ", width=" + width
				+ ", length=" + length + ", name=" + name + ", emptyBlockChar="
				+ emptyBlockChar + ", blockTypes=" + blockTypes
				+ ", blockField=" + Arrays.toString(blockField) + "]";
	}

}
