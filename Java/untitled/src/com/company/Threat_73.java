//   73. ( Constructor from threat class in java ).

package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i <= 99; i++) {
        System.out.println(i);
//        while (true){
//            System.out.println("Hello");
        }
    }
}
public class Threat_73 {
    public static void main(String[] args) {
//static void main() {
    MyThr th = new MyThr("Dev");
    MyThr th1 = new MyThr("Guts");
    th.start();
    th1.start();
    System.out.println("The name of thread is " + th.getName());
    System.out.println("The id of thread is " + th.getId());
    System.out.println("The name of thread is " + th1.getName());
    System.out.println("The id of thread is " + th1.getId());
}
}
