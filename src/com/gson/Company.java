package com.gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jefferson on 18/06/15.
 */
public class Company {


    private List<Employee> company;

    public Company(List<Employee> company) {
        this.company = company;
    }

    public Company() {
    	this.company = new ArrayList<Employee>();
    }


    public List<Employee> getCompany() {
        return company;
    }

    public void setCompany(List<Employee> company) {
        this.company = company;
    }

	@Override
	public String toString() {
		String s = "";
		for (Employee e: this.company){
			s+=e.toString()+ "\n";
		}
		return s;
	}
    
    
}
