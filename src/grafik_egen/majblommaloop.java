package grafik_egen;

import javax.swing.*;
import java.awt.*;

public class majblommaloop extends JComponent {

    public majblommaloop(){

        this.setPreferredSize(new Dimension(400,400));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillOval(100,100 ,100,100);


        for (int i=0; i<10; i+=1) {

          if(i %2 ==0) {
              g.setColor(Color.yellow);
          }else{
              g.setColor(Color.green);
          }

            g.fillOval((int)(Math.cos(degToRad(i*360/10))*50+100), (int)(Math.sin(degToRad(i*36))*50+100), 70, 70);
        }

    }

    public double degToRad(double deg){

        return deg*Math.PI/180;

    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Majblomma");
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(new majblommaloop());
        frame.pack();

    }

}
