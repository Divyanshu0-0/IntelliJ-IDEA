//        JavaInterfacesExample&DefaultMethods (V-57)

package com.company;

interface MyCamera {
    void takeSnap();
    void recordVideos();
    private void greet(){
        System.out.println("Greeting");
    }
    default void Record4KVideos(){
        greet();
        System.out.println("Recording 4k videos");
    }
}

interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);

    public interface MyCamera {
    }
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }}

class MySmartPhone extends MyCellPhone implements MyWifi. MyCamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
//    public void Record4KVideos(){
//        System.out.println("Recording 4K video");
//    }
    public String[] getNetwork(){
        System.out.println("Getting list of Network :- ");
        String[] networkList = {"One", "Two", "Three"};
        return networkList;
    }
}
public class JavaInterfaces_57 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
//        ms.recordVideo();
        String[] arr = ms.getNetwork();
        for (String item: arr){
            System.out.println(item);
        }
    }
}
