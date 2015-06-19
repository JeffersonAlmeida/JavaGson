package com.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().registerTypeAdapter(Company.class, new CompanyDeserializer()).create();
        
        Company c = gson.fromJson(JsonString.jsonString(), Company.class);
        System.out.println(c.toString());
        
	}

}
