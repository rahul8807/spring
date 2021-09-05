package com.apps.poc;

import com.apps.poc.model.Subscription;
import com.apps.poc.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class CMDRunner implements CommandLineRunner {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public void run ( String... args ) throws Exception {

        ZonedDateTime zonedDateTime = ZonedDateTime.now ();
        Subscription subscription = new Subscription ( 3, zonedDateTime );
        subscriptionRepository.save ( subscription );
        System.out.println (zonedDateTime.getZone () );
        System.out.println (subscription );

    }
}
