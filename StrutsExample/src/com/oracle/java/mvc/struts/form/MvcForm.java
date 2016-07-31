package com.oracle.java.mvc.struts.form;

import org.apache.struts.action.ActionForm;

public class MvcForm extends ActionForm{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
 
}
