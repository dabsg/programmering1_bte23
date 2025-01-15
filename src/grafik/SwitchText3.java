package grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchText3 extends JFrame {

    JButton switchText=new JButton("Switch Text");
    JLabel switchTextLabel=new JLabel("Switch Text");


    public SwitchText3() {
        this.setLayout(new FlowLayout());
        this.add(switchText);
        this.add(switchTextLabel);
        this.setVisible(true);
        this.setSize(400,400);
        switchText.addActionListener(e->{
            switchTextLabel.setText("hej");
        });
    }

    public static void main(String[] args) {
        new SwitchText3();
    }
}
