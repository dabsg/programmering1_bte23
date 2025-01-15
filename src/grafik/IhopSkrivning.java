package grafik;

import javax.swing.*;
import java.awt.*;

public class IhopSkrivning extends JFrame{

    JTextField t1=new JTextField(23);
    JTextField t2=new JTextField(23);
    JLabel l1=new JLabel("dfdsfdsfdsfd");
    JButton b1=new JButton("slå samman");

   public IhopSkrivning(){

       this.setLayout(new FlowLayout());
       setVisible(true);
       setSize(400,400);
       this.add(t1);
       this.add(t2);
       this.add(l1);
       this.add(b1);

       b1.addActionListener(e->{

        l1.setText(t1.getText()+t2.getText());

       });


   }



    public static void main(String[] args) {

       new IhopSkrivning();
    }
}
