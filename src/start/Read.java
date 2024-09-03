package start;

import javax.swing.*;

public class Read {
    public static void main(String[] args){

        String namn=JOptionPane.showInputDialog("ange ditt namn");

        System.out.println(namn);

        JOptionPane.showMessageDialog(null,namn);

    }
}
