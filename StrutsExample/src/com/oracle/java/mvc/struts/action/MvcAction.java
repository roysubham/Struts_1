package com.oracle.java.mvc.struts.action;

import javax.servlet.http.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.oracle.java.mvc.struts.form.MvcForm;
import com.oracle.java.mvc.struts.service.MvcService;

public class MvcAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response)
        throws Exception {
		
		MvcForm itWorks = (MvcForm) form;
		MvcService service=new MvcService();
		itWorks.setMessage(service.getMessage());
		return mapping.findForward("success");
	}
	
}

