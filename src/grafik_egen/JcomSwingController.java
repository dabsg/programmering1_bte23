package grafik_egen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JcomSwingController {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("move up");
        JPanel panel = new JPanel();
        JcompSwing comp = new JcompSwing();
        JcompSwing comp1 = new JcompSwing();

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        panel.add(button);
        panel.add(comp);
        panel.add(comp1);
        frame.add(panel);
        frame.pack();

        button.addActionListener(e -> {

            comp.moveUp(20);
            comp1.moveUp(-20);

        });

    }

}
