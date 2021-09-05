package com.apps.poc;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = PocApplication.class)
public class SpringIntegrationTest {
}
