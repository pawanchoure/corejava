package com.pawan.choure.thread;

/**
 * Created by Pawan on 6/9/2016.
 */
public class ThreadState extends Thread {

    public void run(){
        System.out.println("Starting the thread " + getName());
    }

    public static void main(String[] args){
        ThreadState s1= new ThreadState();
        s1.start();
        s1.run();
    }
}
