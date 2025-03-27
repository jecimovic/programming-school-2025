package org;

import java.util.Random;

public class thing {
    
    static void printarray(int[] array){
        for(int geeeyat = 0; geeeyat<array.length; geeeyat++){
            System.out.println(array[geeeyat]);
        }
    }

    public static void main(String[] args) {

        

        Random rnd = new Random();


        int[] array = new int[50];
        array[0]=1;
        int aaaaaaaaa = 1;
        int[] araray = new int[10];
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

        int[] arrarray = new int[10];

        for (int e = 0; e<10; e++){
            araray[e]= rnd.nextInt(20);
        }
        
        printarray(araray);

        System.out.println("el blocker mi amigos yayaya");
        
        int geyat = 0;

        for (int sigma = 9; sigma>-1; sigma--){
            arrarray[sigma] = araray[geyat];
            geyat ++;
        }

        printarray(arrarray);
        
        

    }

}
