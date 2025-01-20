package grafik;

import javax.swing.*;
import java.awt.*;

public class Radio {

    private JRadioButton barn = new JRadioButton("Barn");
    private JRadioButton vuxen = new JRadioButton("vuxen");
    private JRadioButton pensionär = new JRadioButton("pensionär");

    private JButton send= new JButton("Send");
    public Radio() {

        JFrame frame = new JFrame("Radio");

        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(barn);
        frame.add(vuxen);
        frame.add(pensionär);
        frame.add(send);

        ButtonGroup group = new ButtonGroup();
        group.add(barn);
        group.add(vuxen);
        group.add(pensionär);

        send.addActionListener(e->{

            if(barn.isSelected()){
                send.setText("barn");
            }if(vuxen.isSelected()){
                send.setText("vuxen");
            }

        });

    }


    public static void main(String[] args) {
        new Radio();
    }
}
