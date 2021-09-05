package com.apps.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.*;

@DisplayName ( "This is the Junit1 Test class" )
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit1 {

    @BeforeAll      //The method annotated with @BeforeAll ① is executed once: before all tests. This method needs to be static unless the entire test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
    public static void  beforeAll() {
        System.out.println("Invoked only once");
    }

    @BeforeEach    //The method annotated with @BeforeEach ③ is executed before each test. In our case, it will be executed twice.
    public void beforeEach(){
        System.out.println ("Before each" );
    }

    @org.junit.jupiter.api.Test
    @Order ( 2 )
    @DisplayName("😱")
    public void testHowTheCounterBehaves(){
        System.out.println (this );
        System.out.println ("Order 1" );
    }


    @Test
    @Order ( 1 )
    public void testHowTheCounterBehaves2(){
        System.out.println (this );
        System.out.println ("Order 2" );
    }

    @Test
    @Disabled("Feature is still under construction")
    public void disableTest(){

    }

    @Test
    @Tag("IntegrationTest")
    public void testAddEmployeeUsingSimpelJdbcInsert() {
    }

    @Test
    @Tag("UnitTest")
    public void givenNumberOfEmployeeWhenCountEmployeeThenCountMatch() {
    }

    @Test
    @DisplayName ( "Assert Examples POC" )
    public void assertExamples(){
        Assert.assertEquals ( 1,1 );
       // MatcherAssert.assertThat (  ); //assertThat has been removed and instead use Hamcrest MatcherAssert
    }

}
