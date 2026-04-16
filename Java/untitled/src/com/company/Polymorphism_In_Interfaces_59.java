package com.company;

//  Interface for Camera functionality
interface MyCamera2 {
    void takeSnap();
    void recordVideos();

    private void greet() {
        System.out.println("Greeting");
    }

    default void Record4KVideos() {
        greet();
        System.out.println("Recording 4k videos");
    }
}

//  Interface for MyWiFi functionality
interface MyWifi2 {
    String[] getNetwork();
    void connectToNetwork(String network);
}

//  Base class for basic phone features
class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting");
    }
}

//  SmartPhone class implementing both interfaces
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideos() {
        System.out.println("Recording video");
    }

    public String[] getNetwork() {
        System.out.println("Getting list of Network :- ");
        String[] networkList = {"One", "Two", "Three"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

//  Main class to demonstrate polymorphism
public class Polymorphism_In_Interfaces_59 {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2(); // Polymorphic reference  (This is a SmartPhone but, use it as a Camera)
//        cam1.getNetwork();  --> Not Allowed

        cam1.Record4KVideos(); // Calls default method from interface

        MySmartPhone2 s = new MySmartPhone2();
        s.callNumber(8);
        s.getNetwork();
    }
}