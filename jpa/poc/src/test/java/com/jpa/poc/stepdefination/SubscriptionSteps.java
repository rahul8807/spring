package com.jpa.poc.stepdefination;

import com.jpa.poc.poc.model.Subscription;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

public class SubscriptionSteps {


    @Given("I have a Subscription id")
    public Subscription createAnNewSubscription(){
        Subscription subscription = new Subscription (  );
        subscription.setSubscriptionId ( 3 );
        subscription.setSubscriptionDate ( ZonedDateTime.now () );
        return subscription;
    }

    @When ( "I add the subscription" )
    public void addingANewSubscription(){
        System.out.println ("Added Successfully" );
    }

    @Then ( "Subscription should be added" )
    public void isSubscriptionAddedSuccessfully(){
        System.out.println ("Subscription Added Successfully" );
    }



}
