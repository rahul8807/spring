package com.apps.poc.datepoc;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimePOC {

    public static void main ( String[] args ) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println ( zonedDateTime);

        System.out.println (formatter.format ( zonedDateTime ) );
    }

}
