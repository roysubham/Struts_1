package com.oracle.java.mvc.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.oracle.java.mvc.struts.service.MvcService;

public class MvcJsonAction extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
	 
			MvcService service=new MvcService();
			request.getSession().setAttribute("jsonMessage", service.getJsonMessage());
			return mapping.findForward("success");
		}

}
