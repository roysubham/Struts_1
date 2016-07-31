package com.oracle.java.mvc.struts.service;

import org.json.JSONObject;

import com.oracle.java.mvc.struts.dao.MvcDAOImpl;

public class MvcService {
	MvcDAOImpl dao=new MvcDAOImpl();
	public String getMessage(){
		
		return dao.getMessage();
	}
	public JSONObject getJsonMessage(){
		return dao.getJsonMessage();
	}
}
