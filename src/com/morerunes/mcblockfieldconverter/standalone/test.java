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
