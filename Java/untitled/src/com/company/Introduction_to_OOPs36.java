package com.company;

class Employee{

int id;
String name;
float salary;
public void printDetails(){
    System.out.println("My ID is " + id);
    System.out.println("and my name is "+ name);
}

    public float getSalary() {
        return salary;
    }
}
public class Introduction_to_OOPs36 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee dev = new Employee();
        Employee deva = new Employee();

        // Setting Attributes for dev

        dev.salary = 28;
        dev.id = 12;
        dev.name = "Coding_Dev";

        // Setting Attributes for deva

        deva.salary = 29;
        deva.id = 987;
        deva.name = "Coding_Deva h";

        dev.printDetails();
        deva.printDetails();
        float salary = deva.getSalary();
        System.out.println(salary);

    }
}






