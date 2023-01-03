package exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static exam.Checkout.checkout1;



public class Item extends Main{
    public static void item1() {

        ImageIcon image3 =new ImageIcon("wholesale1.png");
        ImageIcon image5 =new ImageIcon("wholesale4.png");
        ImageIcon image6 =new ImageIcon("ring1.png");
        ImageIcon image7 =new ImageIcon("necklace.png");


        JLabel label = new JLabel();
        label.setText("1.Package 1 $28,450");
        label.setIcon(image3);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.ITALIC, 15));

        JLabel label2 = new JLabel();
        label2.setText("2.Package 2 $8,190");
        label2.setIcon(image5);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("MV Boli", Font.ITALIC, 15));


        JLabel label3 = new JLabel();
        label3.setText("4.Diamond Necklace  $1,600 ");
        label3.setIcon(image7);
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.TOP);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("MV Boli", Font.ITALIC, 15));

        JLabel label4 = new JLabel();
        label4.setText("3.Diamond Ring $3,115");
        label4.setIcon(image6);
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setVerticalTextPosition(JLabel.TOP);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("MV Boli", Font.ITALIC, 15));



        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.gray);
        panel1.setBounds(0,0,250,300);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.gray);
        panel2.setBounds(250,0,250,300);


        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.gray);
        panel3.setBounds(250,300,250,300);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.gray);
        panel4.setBounds(0,300,250,300);


        JButton button = new JButton("Choose An Item");
        button.setBounds(180,620,150,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                checkout1();

            }
        });







        JFrame frame = new JFrame();
        frame.setTitle("Forever Gems");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(515, 750);
        frame.setLayout(null);
        frame.setVisible(true);
        ImageIcon image;
        panel1.add(label);
        frame.add(panel1);
        panel2.add(label2);
        frame.add(panel2);
        panel3.add(label3);
        frame.add(panel3);
        panel4.add(label4);
        frame.add(panel4);
        frame.add(button);




        image = new ImageIcon("images.png");
        frame.setIconImage(image.getImage());








    }


}
