package modulus;

import javax.swing.*;
import java.util.Scanner;

public class Kassasystem {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hur mycket handlar du för");
        int pris=input.nextInt();

       String betalningString= JOptionPane.showInputDialog("hur mycket betalar du");
       int betalning=Integer.parseInt(betalningString);

       int växel=   betalning-pris;

         int tusen  =växel/1000;
         växel   =växel%1000;
        System.out.println(tusen+" "+växel);




    }


    // hur mycket handlar du för
    // ta i mot pengar



    //  1000 500 200 100 50 20 10 5 2 1

    // beräkna hur mycket tillbaka

    //   123kr        123/1000 =0   123/500=0  123/200=0 123/100=1  123%100=23


}
