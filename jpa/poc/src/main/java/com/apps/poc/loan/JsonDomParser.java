package com.apps.poc.loan;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonDomParser {

    public static void main ( String[] args ) throws IOException {
        //"./job.json"
        File file = new File ( JsonDomParser.class
                                .getClassLoader()
                                .getResource ( "job.json" )
                                .getFile ()
        );
        if(file.exists ()){
            System.out.println ("file exists" );
        }

        ObjectMapper objectMapper = new ObjectMapper (  );

        JsonNode jsonNode = objectMapper.readTree ( file );
        System.out.println (jsonNode );

    }
}
