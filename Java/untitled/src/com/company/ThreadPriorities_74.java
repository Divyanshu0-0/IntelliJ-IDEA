//   74. ( THREAD PRIORITIES IN JAVA ).

package com.company;

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Hi " + this.getName());
        for (int i = 0; i <= 99; i++) {
//        while (true) {
            System.out.println("Hello " + this.getName());
        }
    }
}
public class ThreadPriorities_74 {
   public static void main(String[] args) {
//        Ready Queue : T1, T2, T3, T4, T5.
       MyThr1 t1  = new MyThr1("one");
       MyThr1 t2  = new MyThr1("two");
       MyThr1 t3  = new MyThr1("three");
       MyThr1 t4  = new MyThr1("four");
       MyThr1 t5  = new MyThr1("five");
       t5.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);
       t1.start();
//       t2.start();
//       t3.start();
//       t4.start();
       t5.start();
    }
}