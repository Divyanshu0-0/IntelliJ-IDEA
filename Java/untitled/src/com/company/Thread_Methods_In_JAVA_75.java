package com.company;

class MyThre extends Thread {
    public void run() {
//        System.out.println("Hi");
//        for (int i = 0; i <= 9; i++) {
        int i = 0;
        while (i<9) {
            System.out.println("Hello ");
            try {
                Thread.sleep(4565);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyThre1 extends Thread {
    public void run() {
//        System.out.println("Hi");
        for (int i = 0; i <= 9; i++) {
//        int i = 0;
//        while (true) {
            System.out.println("Helloooo ");
        }
    }
}
public class Thread_Methods_In_JAVA_75 {
    public static void main(String[] args) {
        MyThre t = new MyThre();
        MyThre1 t1 = new MyThre1();
        t.start();
        try {
            t.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t1.start();
    }
}
