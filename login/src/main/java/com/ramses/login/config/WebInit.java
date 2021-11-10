package com.ramses.login.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.h2.server.web.WebServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.scan("com.ramses.login");
		servletContext.addListener(new ContextLoaderListener(context));
		context.setServletContext(servletContext);

		ServletRegistration.Dynamic appServlet = servletContext.addServlet("dispatcher",
				new DispatcherServlet(context));

		ServletRegistration.Dynamic servlet = servletContext.addServlet("h2-console",
				new WebServlet());
		servlet.setLoadOnStartup(2);
		servlet.addMapping("/console/*");
		
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");

	}

}
