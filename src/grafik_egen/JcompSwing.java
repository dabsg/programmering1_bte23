package grafik_egen;

import javax.swing.*;
import java.awt.*;

public class JcompSwing extends JComponent {

    private int x=100;
    private int y=100;


  public JcompSwing() {

      setPreferredSize(new Dimension(500, 500));
      System.out.println("konstruktorn är körd");
  }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(x,y,30,90);

    }

    public void moveUp(int steps){

      y-=steps;
      repaint();
    }



}
