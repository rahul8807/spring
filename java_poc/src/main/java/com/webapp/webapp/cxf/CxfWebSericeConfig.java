package com.webapp.webapp.cxf;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfWebSericeConfig {

    @Autowired
    Bus bus;

    @Autowired
    HelloCxfService helloCxfService;

    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl ( bus, new HelloCxfService() );
        endpoint.publish ( "/hello" );
        return endpoint;
    }

}
