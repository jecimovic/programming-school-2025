package org.example.trains;

import java.util.Random;

public class tracks {
    public static void main(String[] args) {

        Random rnd = new Random();
        
        train train0 = new train();
        int x=rnd.nextInt(1-10)+1;
        train0.attatchedrollingstock = new passengercar[x];
        for(int i=0; i<x; i++){
            if (i != 0){
                passengercar car = new passengercar();
            }

        }
    }
}
