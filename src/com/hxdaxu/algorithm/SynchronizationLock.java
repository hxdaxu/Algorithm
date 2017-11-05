package com.hxdaxu.algorithm;

import java.util.Timer;
import java.util.TimerTask;

public class SynchronizationLock {

    static Timer scanTimer = null;

    public static void main(String[] args) {
        // scanTimer = new Timer();
        // scanTimer.cancel();
        // 1
        new Thread(new Runnable() {

            @Override
            public void run() {
                startScanTimer();
            }
        }).start();
        // 2
        new Thread(new Runnable() {

            @Override
            public void run() {
                cancelScanTimer();
            }
        }).start();

    }

    static Object o = new Object();

    // 子线程执行
    private synchronized static void startScanTimer() {
        // cancelScanTimer();
        // synchronized (o) {
        scanTimer = new Timer();
        System.out.println("new Timer");

        System.out.println("sleep 1000ms");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        scanTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                handleScanFailed();
            }
        }, 30000);
        System.out.println("schedule");
        // }
    }

    private synchronized static void cancelScanTimer() {
        // if (scanTimer != null) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out
                .println("cancelScanTimer scanTimer == null : " + scanTimer == null);
        // synchronized (o) {
        if (scanTimer != null) {
            System.out.println("cancel");
            scanTimer.cancel();
        }
        // }

        // scanTimer.purge();
        // scanTimer = null;
        // }
    }

    private static void handleScanFailed() {
        int i = 100;
        while (true) {
            System.out.println(i--);
            if (i == 0) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
