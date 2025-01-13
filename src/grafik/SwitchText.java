package grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchText extends JFrame implements ActionListener {

    JButton switchText=new JButton("Switch Text");
    JLabel switchTextLabel=new JLabel("Switch Text");

    public SwitchText() {

        this.setLayout(new FlowLayout());
        this.add(switchText);
        this.add(switchTextLabel);
        this.setVisible(true);
        this.setSize(400,400);
        switchText.addActionListener(this);
    }

    public static void main(String[] args) {

        new SwitchText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==switchText) {

            switchTextLabel.setText("hej");

        }


    }
}
