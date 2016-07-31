package com.oracle.java.mvc.struts.dao;

import org.json.JSONException;
import org.json.JSONObject;

public class MvcDAOImpl implements MvcDAO{
	public String getMessage(){
		return "It! Works";
	}
	public JSONObject getJsonMessage(){
		JSONObject returnObject =new JSONObject();
	 	try {
			returnObject.put("value", "it works!");
		} catch (JSONException e) {
			e.printStackTrace();
		}
        
		return 	returnObject;
	}
}
