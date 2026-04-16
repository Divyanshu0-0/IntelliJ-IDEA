
package com.company;

// Access Modifiers getters & setters in java
class MyEmployee{

//    int id;
//    String name;

    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
public class AccessModifiers_40 {
    public static void main(String[] args) {
        MyEmployee Dev = new MyEmployee();
//        Dev.id = 73;
//        Dev.name = "CodeWithDev"; ---> Throws on error due to private access modifier

        Dev.setName("Hello Dev");
        System.out.println(Dev.getName());
        Dev.setId(8879);
        System.out.println("your ID is :- " + Dev.getId());


//        System.out.println(Dev.id);
//        System.out.println(Dev.name);
    }
}
