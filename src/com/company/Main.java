package com.company;

public class Main {

    public static void main(String[] args) {
        String a = "asd";
        String b = "zxc";

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                synchronized (a){
                    System.out.println("Thread 1 " + a);

                    synchronized (b) {
                        System.out.println("Thread 1 " + b);
                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                synchronized (b){
                    System.out.println("Thread 2 " + b);

                    synchronized (a) {
                        System.out.println("Thread 2 " + a);
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
	// write your code here
    }
}
