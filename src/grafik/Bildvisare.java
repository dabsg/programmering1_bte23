package grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Bildvisare {

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

            label.setIcon(new ImageIcon("bild2.jpg"));

        });


    }

    public static void main(String[] args) {
        new Bildvisare();
    }
}
