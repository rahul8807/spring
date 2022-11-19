package com.myapps.scheduler.service;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Service
public class CalculateService {

    String value = "";

    @PostConstruct
    public void setValue(){
        value = UUID.randomUUID ().toString ();
    }

    @Scheduled(fixedRate = 6000)
    @SchedulerLock(name = "mySchedulerLock")
    public void calculateService(){
        System.out.println ( "Calculate "+Thread.currentThread ().getName () +"  "+ value );
    }

}
