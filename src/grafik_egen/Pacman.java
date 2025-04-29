package grafik_egen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman extends JComponent implements KeyListener {


    private int pacx=200;

    private int pacy=200;

    int[] x={200,200,200+50};
    int[] y = new int[3];


    public Pacman(){
        y[0]=200+50+20;
        y[1]=200+50-20;
        y[2]=200+50;
        this.setPreferredSize(new Dimension(500, 500));


    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(pacx,pacy,100,100);
        g.setColor(this.getBackground());
        g.fillPolygon(x,y,3);
        g.setColor(Color.BLACK);
        g.drawString("hej",200,400);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Pacman");

        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
       Pacman p = new Pacman();
        frame.add(p);
        frame.pack();
        frame.addKeyListener(p);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            pacx = pacx - 100;
            this.repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
