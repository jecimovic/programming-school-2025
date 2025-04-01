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
        int[] darray = new int[10];
        System.out.println(array[0]);

        for(int i = 1; i<=49; i++){
            array[i] = ((array[i-1]*-5)+4);
            aaaaaaaaa+=array[i];
            System.out.println(array[i]);
        }

        for (int qwe = 0; qwe > 10; qwe++){
            darray[qwe] = -1;
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

        //for (int qazwax = 0; qazwax<10; qazwax++){
          //  if (arrarray[qazwax]%2==0){
            //    if (qazwax<=5){
              //      darray[qazwax] = arrarray[qazwax];
                //}else{
                  //  if (darray[qazwax-5] == -1){
                    //    darray[qazwax-5] = arrarray[qazwax];
                    //}
              //  }
           // }
        //}

        System.out.println("BLOCKER BLOCKER YAYAYA!");


        int evn = 0;
        int odd = 9;
        for (int g = 0; g<10; g++){
            if (arrarray[g]%2==0){
                darray[evn] = arrarray[g];
                evn++;
            }else{
                darray[odd] = arrarray[g];
                odd--;
            }
        }

        printarray(darray);

        System.out.println("blocker blocker yayaya");

        int placeholder = 0;
        int e = 9;

        for  (int q = 0; q<=9;q++){
            if(arrarray[q]%2==0){

            }else{
                placeholder=arrarray[q];
                while(e>q && arrarray[e]%2!=0){
                    e--;
                }
                arrarray[q]=arrarray[e];
                arrarray[e] = placeholder;
            }
        }

        printarray(arrarray);
        
        

    }

}
