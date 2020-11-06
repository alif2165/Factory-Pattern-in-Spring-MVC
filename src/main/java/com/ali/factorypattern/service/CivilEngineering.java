
package com.ali.factorypattern.service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 6, 2020
 */
public class CivilEngineering extends Program  {

	@Override
	public String enrollProgram(String stuName) {
		return stuName+", You are successfully enrolled in Civil Engineering program";
	}

	@Override
	public List<String> getCourses() {
		String[] courses = {"Construction Project Management","Competency in Sewage","Engineering Mechanics I","Systems Engineering"};
		return Arrays.asList(courses);
	}

}
