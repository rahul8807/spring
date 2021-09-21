package com.webapp.webapp.greetings;

import org.apache.coyote.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Hello {

    @GetMapping(value = "/greet",produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok ().build ();
    }
}
