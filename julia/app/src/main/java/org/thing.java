package org;

public class thing {

    public static void main(String[] args) {
        int[] array = new int[50];
        array[0]=1;
        int aaaaaaaaa = 1;
        System.out.println(array[0]);

        for(int i = 1; i<=49; i++){
            array[i] = ((array[i-1]*-5)+4);
            aaaaaaaaa+=array[i];
            System.out.println(array[i]);
        }

        int avg = (aaaaaaaaa)/50;
        System.out.println("avg = "+avg);

        for (int x = 0; x<49; x++){
            System.out.println(array[x]-avg);
        }
        
    }

}
