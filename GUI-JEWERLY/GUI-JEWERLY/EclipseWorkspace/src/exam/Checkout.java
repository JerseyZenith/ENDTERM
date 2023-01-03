package exam;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkout extends Item {
    public static int ItemNum = 0;
    public static int totalQuan = 0;

    public static void checkout1() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(450, 200);
        frame.setTitle("Forever Gems");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        ImageIcon image;

        panel.setLayout(null);

        JLabel label = new JLabel("Select a Number Of An Item");
        label.setBounds(60, 20, 160, 25);
        panel.add(label);


        JTextField item = new JTextField(20);
        item.setBounds(220, 20, 165, 25);
        panel.add(item);

        JLabel Quantity = new JLabel("Quantity");
        Quantity.setBounds(100, 50, 90, 25);
        panel.add(Quantity);

        JTextField Quantity1 = new JTextField();
        Quantity1.setBounds(220, 50, 165, 25);
        panel.add(Quantity1);

        JButton button = new JButton("Check Out");
        button.setBounds(220, 80, 150, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ItemNum = Integer.parseInt(item.getText());
                totalQuan = Integer.parseInt(Quantity1.getText());
                calculator();


            }
        });
        panel.add(button);

        frame.setVisible(true);


        image = new ImageIcon("images.png");
        frame.setIconImage(image.getImage());

    }

    public static void calculator() {
        int price = 0;
        if(ItemNum == 1) {
            price = 28450;
        }else if (ItemNum == 2) {
            price = 8190;
        } else if(ItemNum == 3) {
            price = 3115;

        } else if(ItemNum == 4) {
            price = 1600;

        }
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Total: " + (price * totalQuan));
        frame.setSize(350, 200);
        frame.setTitle("Forever Gems");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image;

        image = new ImageIcon("images.png");
        frame.setIconImage(image.getImage());
        frame.add(label);
        frame.setVisible(true);



    }


}


