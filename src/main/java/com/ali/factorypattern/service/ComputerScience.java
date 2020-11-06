
package com.ali.factorypattern.service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 6, 2020
 */
public class ComputerScience extends Program {

	@Override
	public String enrollProgram(String stuName) {
		return stuName+", You are successfully enrolled in Computer Science program";
	}

	@Override
	public List<String> getCourses() {
		String[] courses = {"Object Oriented Programming","Data Structures","Algorithms","Artificial Intelligence"};
		return Arrays.asList(courses);
	}

}
