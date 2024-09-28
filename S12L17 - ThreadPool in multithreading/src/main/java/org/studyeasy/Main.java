package org.studyeasy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
    private String name;
    public SomeThread(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Started thread: "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended thread: "+name);
    }
}
public class Main {
    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(6);

        SomeThread thread01 = new SomeThread("Thread01");
        SomeThread thread02 = new SomeThread("Thread02");
        SomeThread thread03 = new SomeThread("Thread03");
        SomeThread thread04 = new SomeThread("Thread04");
        SomeThread thread05 = new SomeThread("Thread05");
        SomeThread thread06 = new SomeThread("Thread06");
        SomeThread thread07 = new SomeThread("Thread07");
        SomeThread thread08 = new SomeThread("Thread08");
        SomeThread thread09 = new SomeThread("Thread09");
        SomeThread thread10 = new SomeThread("Thread10");
        SomeThread thread11 = new SomeThread("Thread11");
        SomeThread thread12 = new SomeThread("Thread12");

        executorService.execute(thread01);
        executorService.execute(thread02);
        executorService.execute(thread03);
        executorService.execute(thread04);
        executorService.execute(thread05);
        executorService.execute(thread06);
        executorService.execute(thread07);
        executorService.execute(thread08);
        executorService.execute(thread09);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);

        executorService.shutdown();
    }
}
