package com.morerunes.mcblockfieldconverter.standalone;

import java.io.FileNotFoundException;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.morerunes.mcblockfieldconverter.library.BlockFieldConverter;

public class test {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		BlockFieldConverter converter = new BlockFieldConverter("example.bf");
		STGroup templates = new STGroupFile("template.stg");
		
		
	}
}
