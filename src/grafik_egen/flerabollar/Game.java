package grafik_egen.flerabollar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Game extends JComponent {

    Boll b;

    Boll []bollar  = new Boll[4];


    public Game(){
        this.setPreferredSize(new Dimension(600,600));

        for (Boll index : bollar) {

           index=new Boll(100,200,200,Color.BLUE);

        }




        Timer t=new Timer(20,e->{

            b.updateBoll();
            repaint();
        });
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(b.getColor());
        g.fillOval(b.x,b.y,b.r*2,b.r*2);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());
        frame.setContentPane(new Game());
        frame.pack();
        System.out.println("frame:"+frame.getWidth());
    }
}
