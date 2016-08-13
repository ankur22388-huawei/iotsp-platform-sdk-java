//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.helper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {
	
	private static ObjectMapper mapper = new ObjectMapper();	//can reuse, share globally
	public static Map<String, Object> convertJsonStringToMap(String jsonString) {
		Map<String, Object> map = new HashMap<String, Object>();

		try {

			// convert JSON string to Map
			map = mapper.readValue(jsonString, new TypeReference<HashMap<String, Object>>(){});

			System.out.println(map);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	//Read JSON from a file, and return a Map<String, Object>
	public static Map<String, Object> convertJsonFileToMap(String jsonFilePath) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			//ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
			map = mapper.readValue(new File(jsonFilePath), new TypeReference<HashMap<String, Object>>(){});
			return map;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	 
		return map;
	}
	
	public static String convertPojoToJsonString(Object obj) {
		try {
			//ObjectMapper mapper = new ObjectMapper();

        	//Object to JSON in String
			String jsonStr = mapper.writeValueAsString(obj);
			return jsonStr;
			
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	//Return Json string
	public static String loadFileToString(String jsonFilePath) throws IOException{
		return new String(Files.readAllBytes(Paths.get(jsonFilePath)));
	}

	public static Map<String, Object>  convertPojoToMap(Object obj) {
		
		return JsonHelper.convertJsonStringToMap(JsonHelper.convertPojoToJsonString(obj));
	}
	
	public static List<Object> convertPojoToList(Object obj) {
		String json = JsonHelper.convertPojoToJsonString(obj);
		try {
			List<Object> objList = mapper.readValue(json, new TypeReference<List<Object>>(){});
			return objList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
