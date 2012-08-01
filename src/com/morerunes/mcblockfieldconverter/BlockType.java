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

package com.morerunes.mcblockfieldconverter;

public class BlockType {
	
	char label;
	String blockType;
	int metadata;
	
	public BlockType(char label, String blockType, int metadata) {
		this.label = label;
		this.blockType = blockType;
		this.metadata = metadata;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public String getBlockType() {
		return blockType;
	}

	public void setBlockType(String blockType) {
		this.blockType = blockType;
	}

	public int getMetadata() {
		return metadata;
	}

	public void setMetadata(int metadata) {
		this.metadata = metadata;
	}

	@Override
	public String toString() {
		return "BlockType [label=" + label + ", blockType=" + blockType
				+ ", metadata=" + metadata + "]";
	}

}
