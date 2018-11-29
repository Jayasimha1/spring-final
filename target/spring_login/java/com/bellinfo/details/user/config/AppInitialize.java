package com.bellinfo.details.user.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitialize implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {


            AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
            context.register(ApplicationConfig.class);

            servletContext.addListener(new ContextLoaderListener(context));

            ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
            servlet.addMapping("/");
            servlet.setLoadOnStartup(1);

        }

    }
