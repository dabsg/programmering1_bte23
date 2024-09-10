package start;

public class Rik {

    public static void main (String[] arg){

        double cash=0;
        int dagar=0;
        double lön=1;

        while(cash<1000000){

            cash=cash+lön;
            dagar=dagar+1;
            lön=lön*2;
            System.out.println(dagar+" "+cash);
        }

        System.out.println(dagar+" "+cash);

    }

    //variabel cash =0;
    // räknare för dagar

    // loop så länge som cash mindre än 1000000


        // dubbla lön
        // spara lön på konto cash




}
