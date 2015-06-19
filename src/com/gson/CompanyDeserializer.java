package com.gson;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.Iterator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * Created by jefferson on 18/06/15.
 */
public class CompanyDeserializer implements JsonDeserializer<Company> {

	private Gson gson;
	
	{
		GsonBuilder g = new GsonBuilder();
		g.registerTypeAdapter(Department.class, new DepartmentInstanceCreator());
		g.registerTypeAdapter(Date.class, new DateDeserializer());
		gson = g.setPrettyPrinting().create();
	}

    public Company deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
    	JsonArray jsonArray = jsonElement.getAsJsonArray();
    	Iterator<JsonElement> i = jsonArray.iterator();
    	Company company = new Company();
    	while(i.hasNext()){
    		JsonElement je = i.next();
    		JsonObject jo = je.getAsJsonObject();
    		JsonElement s = jo.get("employee");
    		Employee e = gson.fromJson(s, Employee.class);
    		company.getCompany().add(e);
    	}
    	return company;
    }
}
