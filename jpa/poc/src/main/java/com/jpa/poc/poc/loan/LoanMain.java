package com.jpa.poc.poc.loan;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class LoanMain {


    public static void main ( String[] args ) throws IOException {
        List<Job> jobs = new ArrayList <> (  );
        Job job1 = new Job ("Software engg","10,000");
        Job job2 = new Job ( "Youtuber","1,000" );
        jobs.add ( job1 );
        jobs.add ( job2 );

        String result = jobs.stream ()
                .map ( e -> String.format (" \"jobName \" : \" %s \"   ", e.jobName) )
                .collect( Collectors.joining ( ",\n", "[","]" ));

        System.out.println (result );


        System.out.println ("---------------" );
        ObjectMapper mapper = new ObjectMapper (  );
        ObjectWriter objectWriter = mapper.writerWithDefaultPrettyPrinter ();
        //objectWriter.writeValue ( System.out , jobs);
        String jsonString = objectWriter.writeValueAsString ( jobs );
        System.out.println (jsonString );
    }

}
