package com.stefanini.projeto;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import com.stefanini.projeto.filter.CorsFilter;



@ApplicationPath("api")
public class ProjetoApplicat extends ResourceConfig{
	
	public void ProjetoApplication() {
		packages("com.stefanini.projeto.rest");
		register(new CorsFilter());
	}
}
