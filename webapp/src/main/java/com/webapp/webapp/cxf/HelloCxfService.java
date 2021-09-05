package com.webapp.webapp.cxf;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path ( "/hello" )
@Service
public class HelloCxfService {

    @GET
    @Path ( "/greet" )
    @Produces(MediaType.TEXT_PLAIN)
    public String helloGreeting(){
        return "Hello World";
    }

}
