package grafik_egen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Boll extends JComponent {

    private int r=40;
    private int x=200;
    private int y=200;


    public Boll(){
        this.setPreferredSize(new Dimension(500,500));
        System.out.println("boll:"+this.getWidth());

        Timer t = new Timer(100,e->{

          updateBoll();
        });
        t.start();
    }

    public void updateBoll(){

        x=x+1;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillOval(x,y,r*2,r*2);
        //System.out.println("målar");

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());
        frame.setContentPane(new Boll());
        frame.pack();
        System.out.println("frame:"+frame.getWidth());
    }

}
