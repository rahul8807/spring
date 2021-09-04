package com.jpa.poc;

import com.jpa.poc.poc.PocApplication;
import com.jpa.poc.stepdefination.SubscriptionSteps;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = PocApplication.class)
public class SpringIntegrationTest {
}
