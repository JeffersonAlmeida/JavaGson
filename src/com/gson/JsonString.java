package com.gson;

/**
 * Created by jefferson on 18/06/15.
 */
public class JsonString {
    public static String jsonString(){
        //return "[{ 'id':1,'firstName':'Lokesh', 'due_date': '2015-04-20', 'lastName':'Gupta','roles':['ADMIN','MANAGER'],'department':{'deptName':'Finance'}}, { 'id':1,'firstName':'Lokesh', 'due_date': '2015-04-20', 'lastName':'Gupta','roles':['ADMIN','MANAGER'],'department':{'deptName':'Finance'}}]";
    	//return "[{ 'employee':{ 'id':1,'firstName':'Lokesh', 'due_date': '2015-04-20', 'lastName':'Gupta','roles':['ADMIN','MANAGER'],'department':{'deptName':'Finance'}}}]";
    	return "[{ 'employee':{ 'id':2,'firstName':'Lokesh', 'due_date': '2015-04-20', 'lastName':'Gupta','roles':['ADMIN','MANAGER'],'department':{'deptName':'Finance'}}}, { 'employee':{ 'id':1,'firstName':'Lokesh', 'due_date': '2015-04-20', 'lastName':'Gupta','roles':['ADMIN','MANAGER'],'department':{'deptName':'Finance'}}}]";
    }
}
