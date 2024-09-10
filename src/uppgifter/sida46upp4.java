package uppgifter;

import javax.swing.*;

public class sida46upp4 {
    public static void main(String[] args) {

        double r;
        double area;
        double volym;

        String rString = JOptionPane.showInputDialog("ange radie");

                r=Double.parseDouble(rString);

               // area= 4*3.14*r*r;
                area=4*Math.PI*Math.pow(r,2);
                volym=4*Math.PI*Math.pow(r,3)/3;

       JOptionPane.showMessageDialog(null,"area:  "+area+"  volym:  " +volym );



    }
}
