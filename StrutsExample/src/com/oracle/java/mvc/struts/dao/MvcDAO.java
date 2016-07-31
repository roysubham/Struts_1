package com.oracle.java.mvc.struts.dao;

import org.json.JSONException;
import org.json.JSONObject;


public interface MvcDAO {

	// In this class we can write the code to interact with Database Layer using, JDBC or Hibernate
	public String getMessage();
	public JSONObject getJsonMessage();
}
