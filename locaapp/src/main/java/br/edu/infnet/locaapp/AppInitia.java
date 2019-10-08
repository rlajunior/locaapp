package br.edu.infnet.locaapp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitia 
//implements WebApplicationInitializer
{
	
	public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext ctx
          = new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        ctx.setServletContext(container);
 
        ServletRegistration.Dynamic servlet = container.addServlet(
          "dispatcherExample", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
        
        	
        
     }

}


