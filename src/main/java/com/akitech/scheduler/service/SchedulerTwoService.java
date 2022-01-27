package com.akitech.scheduler.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTwoService {

    @Scheduled(cron = "0 49 12 * * ?")
    public void taskA() throws InterruptedException {
        System.out.println("Scheduler 2 Task A started");
        Thread.sleep(3000);
        System.out.println("Scheduler 2 Task A completed");
    }

    @Scheduled(cron = "0 49 12 * * ?")
    public void taskB() throws InterruptedException {
        System.out.println("Scheduler 2 Task B started");
        Thread.sleep(300);
        System.out.println("Scheduler 2 Task B completed");
    }
}
