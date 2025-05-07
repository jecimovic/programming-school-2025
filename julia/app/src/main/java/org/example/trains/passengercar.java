package org.example.trains;
import java.util.Random;
public class passengercar extends rollingstock {
    Random rnd = new Random(80000);
    int maxpeople;
    public passengercar(){
       this.weight =rnd.nextInt(80000); 
    }
}
