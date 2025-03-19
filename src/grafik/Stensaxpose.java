package grafik;

import javax.swing.*;
import java.awt.*;

public class Stensaxpose {

    JFrame frame=new JFrame("game");
    JButton b1=new JButton("Sten");
    JButton b2=new JButton("Sax");
    JButton b3=new JButton("Påse");
    JLabel l1=new JLabel("computer:");
    public Stensaxpose(){
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(l1);

        b1.addActionListener(e->{

            int dator=(int)(Math.random() *3)+1;

            if(dator==1  &&  (1==1 || 1==0)   <   >   ==   1!=0  ){
                System.out.println("datorn vann");
            } if(){
                System.out.println("du vann");
            }else{
                System.out.println("lika");
            }
        });


    }

    public static void main(String[] args) {

        new Stensaxpose();

    }
}
