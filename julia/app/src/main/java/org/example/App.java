/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        return "goodbye cruel World!";
    }

    public String getsadGreeting() {
        return " ;(";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getsadGreeting());
        
        for (int x = 0; x<=100;x++){
            System.out.println (x);
        }

        int series=0;

        for (int i = 0; i<=100;i++){
            series+=i;
        }

        System.out.println(series);
    }
}
