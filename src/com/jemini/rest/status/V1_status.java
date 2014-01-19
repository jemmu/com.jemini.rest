package com.jemini.rest.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/*")
public class V1_status {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getValue()
	{
		return "<p> My First RESTFUL SERVICE from Class </p>";
	}

}
