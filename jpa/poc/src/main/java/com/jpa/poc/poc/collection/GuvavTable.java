package com.jpa.poc.poc.collection;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class GuvavTable {

    public static void main ( String[] args ) {
        Table<String,String,Integer> firstCutOff = HashBasedTable.create ();
        firstCutOff.put ( "Science","Physics",50 );
        firstCutOff.put ( "Science","IT",72 );
        firstCutOff.put ( "Science","CS",71 );

        System.out.println (firstCutOff.contains ( "Science","IT" ) );

    }

}
