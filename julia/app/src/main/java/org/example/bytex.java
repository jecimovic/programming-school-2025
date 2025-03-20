package org.example;

public class bytex {


    public static void main(String[] args) {

        for (int x = 0; x<=1000; x+=1){
            System.out.println(x);
        }

        System.out.println("🫃");

        int a = 7;
        int b = 11;
        int aa = 4;
        int bb = 5;
        int cc = 10;
        byte x = 50;
        byte y = 10;
        byte z = 25;
        byte temp = (byte)(x*y);
        int xx = 127;
        int aaa = 10;
        int bbb = 5;

        System.out.println(a*b);
        System.out.println(b/a+" remainder: "+b%a);
        System.out.println(aa/cc*bb);
        System.out.println(bb*aa/cc);
        System.out.println(x*y/z);
        System.out.println(temp);
        System.out.println(temp/z);
        System.out.println(xx);
        System.out.println(~xx);
        System.out.println(aaa|bbb);
        System.out.println(aaa&bbb);
    }
}