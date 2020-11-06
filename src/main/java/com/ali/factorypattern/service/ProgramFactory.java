
package com.ali.factorypattern.service;

import com.ali.factorypattern.IConstants;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 6, 2020
 */
public class ProgramFactory {
	
	
	/**
	* Returns an Program object based on the required criteria. 
	*
	* @param  String prgm
	* @return Program
	*/
	public static Program getProgram(String prgm) {
		Program program= null;
		switch(prgm) {
		case IConstants.PROGRAM_CS:
			program = new ComputerScience();
			break;
		case IConstants.PROGRAM_CE:
			program = new CivilEngineering();
			break;
		}
		return program;
	}

}
