package com;

import java.util.*;

public class MatchPara {



    public static void main ( String[] args ) {
        Map<String,String> map = new HashMap <> (  );
        map.put ( "(",")" );
        map.put ( "[","]" );
        map.put ( "{","}" );


        Map<String,String> expected = new HashMap <> (  );
        expected.put ( ")","(" );
        expected.put ( "]","[" );
        expected.put ( "}","{" );



        Stack<String> stack = new Stack <>  (  );

        String exp = "[()]{}{[()()]()(}";

        stack.push ( ""+exp.charAt ( 0 ) );

        System.out.println (map );

        for(int i=1; i<exp.length (); i++) {
            if(map.containsKey ( ""+exp.charAt ( i ) )){
                stack.push ( ""+exp.charAt ( i )  );
            }else{
                String value = expected.get ( new String ( ""+exp.charAt ( i  )) );
String pop = stack.pop ();
                System.out.println (value+" ---   "+value );

                if( !value.equals ( pop)){
                    //print the value
                    while (stack.size ()>0){
                        System.out.println (stack.pop () );
                    }
                    System.out.println ("Error" );
                    break;
                }
                // Sikp

            }
        }

    }

}
