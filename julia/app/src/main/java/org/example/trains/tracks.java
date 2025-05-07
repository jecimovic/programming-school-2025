package org.example.trains;

import java.util.Random;

public class tracks {
    public static void main(String[] args) {

        Random rnd = new Random();
        int weight = 0;
        train train0 = new train();
        int x=rnd.nextInt(10)+1;
        train0.attatchedrollingstock = new passengercar[x];
        passengercar passengercar1= new passengercar();
        passengercar passengercar2= new passengercar();
        passengercar passengercar3= new passengercar();
        passengercar passengercar4= new passengercar();
        passengercar passengercar5= new passengercar();
        passengercar passengercar6= new passengercar();
        passengercar passengercar7= new passengercar();
        passengercar passengercar8= new passengercar();
        passengercar passengercar9= new passengercar();
        passengercar passengercar10= new passengercar();
        train0.attatchedrollingstock[1]=passengercar1;
        train0.attatchedrollingstock[2]=passengercar2;
        train0.attatchedrollingstock[3]=passengercar3;
        train0.attatchedrollingstock[4]=passengercar4;
        train0.attatchedrollingstock[5]=passengercar5;
        train0.attatchedrollingstock[6]=passengercar6;
        train0.attatchedrollingstock[7]=passengercar7;
        train0.attatchedrollingstock[8]=passengercar8;
        train0.attatchedrollingstock[9]=passengercar9;
        train0.attatchedrollingstock[10]=passengercar10;
        locomotive locomotive1 = new locomotive();
        for(int i=0; i<x; i++){
            weight += train0.attatchedrollingstock[i].weight;
      //      if (i != 0){
      //          passengercar car = new passengercar();
      //      }

        }
        if (weight>locomotive1.loadcapacityweight){
            System.out.println("DIS DONT RUN");
        } else{
            System.out.println("DIS DO RUN with "+weight+"kgs");
        }
       

    }
}
