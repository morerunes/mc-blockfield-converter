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
