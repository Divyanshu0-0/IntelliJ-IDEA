class MyEmployee{
    private int id;
    private String name;

public MyEmployee(){
    id = 62;
    name = "Tyson";
}
    public MyEmployee(String myName , int myId){
    id = myId;
    name = myName;
}

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
public class Constructor_in_JAVA_42 {
    public static void main(String[] args) {

//        MyEmployee Dev = new MyEmployee("CodeWithDev", 14);
          MyEmployee Dev = new MyEmployee();

//        Dev.setName("Dev Sharma");
//        Dev.setId(123);

        System.out.println(Dev.getId());
        System.out.println(Dev.getName());
    }
}

