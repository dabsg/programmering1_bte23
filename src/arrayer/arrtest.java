package arrayer;

import javax.swing.*;
import java.util.Arrays;

public class arrtest {

    public static void main(String[] args) {

        int [] i=new int [5];
        for(int j=0;j<5;j++){
            i[j]=Integer.parseInt(JOptionPane.showInputDialog("ange ett tal"));
        }
        System.out.println(Arrays.toString(i));
    }
}
