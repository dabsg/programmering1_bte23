package grafik;

import javax.swing.*;
import java.awt.*;

public class Moms {

    JLabel svar= new JLabel("");
    JTextField pris= new JTextField(20);
    JButton calc= new JButton("Calculate");
    JFrame frame= new JFrame();

    public Moms(){

        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.add(svar);
        frame.add(pris);
        frame.add(calc);

        calc.addActionListener(e ->{

            String ps=pris.getText();
           double  prisDouble= Double.parseDouble(ps);


            if(prisDouble<=0){

                svar.setText("felaktig inmatning");
            }else {
                double prisMomsMat = prisDouble * 1.12;
                double prisMomsPress = prisDouble * 1.06;
                double prisMomsÖvrigt = prisDouble * 1.25;
                svar.setText("mat: " + prisMomsMat + " press" + prisMomsPress + " övrigt" + prisMomsÖvrigt);
            }
        });




    }






    public static void main(String[] args) {

        new Moms();

    }



}
