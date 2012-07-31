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
	private List<Object> blockTypes;
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

	public List<Object> getBlockTypes() {
		return blockTypes;
	}

	public void setBlockTypes(List<Object> blockTypes) {
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
