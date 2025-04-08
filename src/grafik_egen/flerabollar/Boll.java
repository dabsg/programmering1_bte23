package grafik_egen.flerabollar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Boll extends JComponent {

    public int r;
    public int x;
    public int y;
    public Color c;


    public Color getColor(){


            return Color.BLACK;



    }


    public Boll(int r, int x, int y, Color c) {
        this.setPreferredSize(new Dimension(500,500));

        this.r=r;
        this.x=x;
        this.y=y;
        this.c=c;


    }

    public void updateBoll(){

        x=x+1;
        System.out.println(x);

    }


}
