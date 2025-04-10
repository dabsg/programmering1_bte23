package grafik_egen;

import javax.swing.*;
import java.awt.*;

public class Majblomma extends JComponent {

    public Majblomma(){

        this.setPreferredSize(new Dimension(400,400));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillOval(100,100 ,100,100);
        g.setColor(Color.yellow);
        g.fillOval(180,100 ,100,100);
        g.setColor(Color.white);
        g.fillOval(165,160 ,100,100);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Majblomma");
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(new Majblomma());
        frame.pack();

    }

}
