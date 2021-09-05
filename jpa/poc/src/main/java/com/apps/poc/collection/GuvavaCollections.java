package com.apps.poc.collection;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class GuvavaCollections {

    public static void main ( String[] args ) {
        Multiset<String> fruits = HashMultiset.create ();
        fruits.add ( "Apple" );
        fruits.add ( "Apple" );
        fruits.add ( "Apple" );
        fruits.add ( "Apple" );

        fruits.remove ( "Apple", 2 );

        System.out.println (fruits.count ( "Apple" ) );
        System.out.println (fruits.contains ( "Guava" ) );
        System.out.println ( fruits.contains ( "Apple" ) );

        //ConcurrentHashMultiset

    }
}
