package org.example;

import java.util.Random;
import java.util.Stack;

public class reverseyay {
    
    static void printarray(int[] array){
            for(int geeeyat = 0; geeeyat<array.length; geeeyat++){
                System.out.println(array[geeeyat]);
            }
        }

    public static void main(String[] args) {

        Random rnd = new Random(9);

        int[] array = new int[10];

        int temp;

        for (int x = 0; x < 10; x++) {
            array[x] = rnd.nextInt(9);
        }

        printarray(array);

        Stack<Integer> stac = new Stack<Integer>();

        for (int i = 0; i<10;i++){
            temp = array[i];
            stac.push(temp);
        }

        for(int e = 0;e<10;e++){
            temp = stac.pop();
            array[e] = temp;
        }

        System.out.println("BLOCKER BLOCKER YAYAYA");

        printarray(array);

    }
}
