package grafik_egen;

import javax.swing.*;
import java.awt.*;

public class figurtest extends JComponent {

    public figurtest() {
        this.setPreferredSize(new Dimension(500, 500));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(12,10,100 ));
        g.fillRect(200,200,200,200);

    }

    public static void main(String[] args) {

       JFrame  f = new JFrame();
       f.setVisible(true);
       f.setLayout(new FlowLayout());
       f.setContentPane(new figurtest());
       f.pack();

    }


}
