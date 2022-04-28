package com.myProject;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	// 6)

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { MyConfig.class };
	}

	// 6)

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
