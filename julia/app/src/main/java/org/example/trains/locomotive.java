package org.example.trains;
import java.util.Random;
public class locomotive extends rollingstock {
    Random rnd = new Random();
    int topspeed;
    int amountofcoal;
    int coalpermileratio;
    int loadcapacityweight;
    public locomotive(){
        this.ispowered=true;
        this.loadcapacityweight =rnd.nextInt(800000); 
    }
}
