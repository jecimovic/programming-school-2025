package org.example;

public class name {
    static int fn(int x){
        x=x+10;
        System.out.println(x);
        return(x);
    }

    static void fn2(int[] x){
        x[0]=x[0]+1;
       }
    public static void main(String[] args) {
        
        int x =7;
        System.out.println(x);
        x=fn(x);
        System.out.println(x);

        int[] a = new int[1];
        a[0]=7;
        fn2(a);
        System.out.println(a[0]);
    }
}
