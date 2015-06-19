package com.gson;

import java.lang.reflect.Type;

import com.google.gson.InstanceCreator;

/**
 * Created by jefferson on 18/06/15.
 */
public class EmployeeInstanceCreator implements InstanceCreator<Employee> {

	public Employee createInstance(Type arg0) {
		return new Employee();
	}
}
