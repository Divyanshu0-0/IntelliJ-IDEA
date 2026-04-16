//   71 (Creating a java thread using runnable Interfaces)
//   72 Java Thread Life Cycle

package com.company;

class MyThreadRunnable implements Runnable{
    public void run() {
//        System.out.println("I am a Thread not Threat");
//        for (int i = 0; i < 10000 ; i++) {
//            System.out.println("000");
//        }
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
        System.out.println("000");
    }
}
class MyThreadRunnable1 implements Runnable{
    public void run() {
//        System.out.println("I am a Thread1 not Threat");
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("111");
//        }
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
    }
}
public class Runnable_Interfaces_71 {
    public static void main(String[] args) {
        MyThreadRunnable t = new MyThreadRunnable();
        Thread gu = new Thread(t);
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread gu1 = new Thread(t1);
//        t.run();
        gu.start();
        gu1.start();
    }}
