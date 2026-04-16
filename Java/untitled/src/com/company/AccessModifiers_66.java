package com.company;

class  C1{
    public int x = 1;
    protected int y = 876;
    int z = 78;
    private int a = 76;
    public void meth1(){
        int b = x+y+z+a;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
//        System.out.println(b);
    }
}
public class AccessModifiers_66 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
//        System.out.println(c.x);
//        System.out.println(c.y);
//        System.out.println(c.z);
    }
}