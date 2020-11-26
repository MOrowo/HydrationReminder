package com.morowo.mormod.util;

import com.morowo.mormod.command.HydrationCommand;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Interval {

    public static void doTask() {
        ScheduledExecutorService executor =
                Executors.newSingleThreadScheduledExecutor();

        Runnable periodicTask = new Runnable() {
            public void run() {
                HydrationCommand.sendMessage();
            }
        };

        executor.scheduleAtFixedRate(periodicTask, 0, 1, TimeUnit.HOURS);
    }

}

