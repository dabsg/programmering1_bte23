package grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Bildvisare {

    int bildNu=1;

    JFrame frame = new JFrame();
    JButton button = new JButton("Bildvisar");
    JLabel label = new JLabel("bild1",new ImageIcon("bild1.jpg"),JLabel.CENTER);

    public Bildvisare(){

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(button);

        button.addActionListener(e->{

            if( bildNu==1){

                label.setIcon(new ImageIcon("bild2.jpg"));
                bildNu=2;
            }else if(bildNu==2){
                label.setIcon(new ImageIcon("bild1.jpg"));
                bildNu=1;
            }

        });


    }

    public static void main(String[] args) {
        new Bildvisare();
    }
}
