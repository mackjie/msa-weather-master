package com.weather.spring.cloud.initializrstart.dao.threadtest;

/**
 * @program: msa-weather-master
 * @description: This is a test for thread dead lock demo
 * @author: W.HL
 * @create: 2019-03-19 09:34
 **/

public class ThreadLockDemoTest
{
    private static final String A = "A";
    private static final String B = "B";

    public static void main(String[] args) throws InterruptedException
    {
        new ThreadLockDemoTest().deadLock();
    }

    private void deadLock() throws InterruptedException
    {
        Thread th1 = new Thread(() -> {
            synchronized (A){
                try
                {
                    System.out.println("come in A");
                    Thread.currentThread().sleep(10000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("come in A-->B");
                synchronized (B){
                    System.out.println("B");
                }
            }
        });

        Thread th2 = new Thread(()->{
            synchronized (B){
                System.out.println("come in B");
                synchronized (A){
                    System.out.println("A");
                }
            }

        });

        th1.start();
        th2.start();
    }
}
