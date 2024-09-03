package start;

import javax.swing.*;

public class Triangel {
    public static void main(String[] args) {

        //1 läsin höjd  2 läs in bas 3 omvandla till double  4 beräkningar 5 skriv ut resultat

       String stringHeight= JOptionPane.showInputDialog("ange höjd");

       double height =Double.parseDouble(stringHeight);

        String stringBase= JOptionPane.showInputDialog("ange bas");

        double base =Double.parseDouble(stringHeight);

       double answer=(base * height)/2;
     JOptionPane.showMessageDialog(null,answer);

    }
}
