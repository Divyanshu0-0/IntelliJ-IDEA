//  Lectures :-
//   69 (Multithreading In Java) &
//   70 (Creating a Thread using Thread Class).

package com.company;

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("Cooking");
            System.out.println("Thr");
            i++;
        }
    }
}
class MyThread1 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println(" running");
            System.out.println("running");
            i++;
        }
    }
}
public class MultithreadingInJava_69 {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();    // (.start) start method is important for run Thread(program).
        t2.start();    // (.start) start method is important for run Thread(program).
    }
}
