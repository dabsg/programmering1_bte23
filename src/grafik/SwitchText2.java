package grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchText2 extends JFrame {

    JButton switchText=new JButton("Switch Text");
    JLabel switchTextLabel=new JLabel("Switch Text");


    public SwitchText2() {
        this.setLayout(new FlowLayout());
        this.add(switchText);
        this.add(switchTextLabel);
        this.setVisible(true);
        this.setSize(400,400);
        switchText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchTextLabel.setText("Switch Text");
            }
        });
    }

    public static void main(String[] args) {
        new SwitchText2();
    }
}
