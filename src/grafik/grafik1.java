package grafik;

import javax.swing.*;
import java.awt.*;

public class grafik1  {

    JFrame f = new JFrame();    // skapar fönster , skapar objekt av jframe klassen
    JLabel l = new JLabel("Hej");  // skapar textruta,med ordet hej i skapar objekt av jlabel
    JButton b=new JButton("click");   //skapar knapp , skapar objekt av jbutton
    boolean text=true;                  // skapar boolean sätter till true , koll på vilken text som visas
    public grafik1(){           //skpar konstruktor

      f.setVisible(true);   //  synliggör fönster
      f.setSize(300,300);   // sätter storlek på jframe
      f.setLayout(new FlowLayout());    // bestämmer layout
      f.add(l);    // lägger in objektet l i jframen
      f.add(b);   // lägger in objektet b i jframen
      b.addActionListener(e->{


          if (text==true  ){

              l.setText("Hej då");
              text=false;
          }
         else if ( text==false ) {
                  l.setText("Hej");
                  text=true;
              }



      });
    }
    public static void main(String[] args) {

        new grafik1();

    }
}
