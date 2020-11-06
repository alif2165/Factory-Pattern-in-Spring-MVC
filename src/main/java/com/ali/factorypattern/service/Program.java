
package com.ali.factorypattern.service;

import java.util.List;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 6, 2020
 */
public abstract class Program {

	public abstract String enrollProgram(String stuName);
	public abstract List<String> getCourses();
}
