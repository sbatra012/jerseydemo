package com.demo.jerseydemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("demo")
public class EmployeeResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee() {
		
		Employee e = new Employee();
		e.setName("Shubham Batra");
		e.setId(1);
		
		return e;
	}

}
