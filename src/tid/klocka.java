package tid;

import javax.swing.*;
import java.awt.*;
import java.time.*;

public class klocka {

    JFrame frame=new JFrame();
    JLabel clockText=new JLabel("hej");
    Tidpunkt t=new Tidpunkt(12,34,56);


    public klocka(){

       Timer timeCounter= new Timer(1000, e->{

         t.addSec();
         clockText.setText(t.getTime());

       });
        timeCounter.start();


        Clock datorTid = Clock.systemDefaultZone();

        String s= datorTid.instant().toString();

        int timmar=Integer.parseInt(s.substring(11,13))+2;
        int minuter=Integer.parseInt(s.substring(14,16));
        int sekunder=Integer.parseInt(s.substring(17,19));

        t.setTime(timmar,minuter,sekunder);

        //System.out.println(timmar  +":"+minuter +":"+sekunder);

        String tid = t.getTime();
        clockText.setFont(new Font("robotica",Font.PLAIN,100));
        clockText.setText(tid);

        frame.setVisible(true);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(new FlowLayout());
        frame.add(clockText);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new klocka();
    }


}
