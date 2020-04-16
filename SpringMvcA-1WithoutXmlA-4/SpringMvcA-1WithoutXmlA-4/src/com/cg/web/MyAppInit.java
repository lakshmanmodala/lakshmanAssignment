package com.cg.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyAppInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	//used by contextLoaderListener
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {};
	}

	//is used by DispatcherServlet
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {WebConfig.class};
	}

	//used by dispatcher servlet
	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
