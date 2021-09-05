package com.apps.poc.datepoc;

import java.time.LocalDate;

public class DateCalculation {

    public static void main ( String[] args ) {
        LocalDate localDate = LocalDate.now ();
        System.out.println (localDate );
        System.out.println (localDate.minusDays ( 10 ) );
        System.out.println (localDate.plusDays ( 10 ) );
    }
}
