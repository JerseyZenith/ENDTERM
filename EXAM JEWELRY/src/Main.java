package exam;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static exam.Item.item1;

public class Main {

    static void start(){
        JFrame frame = new JFrame();
        frame.setTitle("Forever Gems");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon image;


        image = new ImageIcon("images.png");
        frame.setIconImage(image.getImage());

        ImageIcon image2 = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.red, 3);

        JLabel label = new JLabel();
        label.setText("Welcome To Forever Gems!");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIcon(image2);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.ITALIC, 20));
        label.setBorder(border);
        label.setBackground(Color.black);
        label.setIconTextGap(4);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 485, 350);
        frame.add(label);

        JButton button = new JButton();
        Border border2 = BorderFactory.createLineBorder(Color.red, 3);
        button.setSize(100, 50);
        button.setText("Click Here To Log In!");
        button.setBounds(120, 355, 250, 50);
        button.setBackground(Color.white);
        button.setFont(new Font("MV Boli", Font.BOLD, 14));
        button.setBorder(border2);
        frame.add(button);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Shop1();

                frame.dispose();


            }
        });



    }
    static void Shop1() {


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("Forever Gems");
        frame.setSize(350, 200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        ImageIcon diamond;
        diamond = new ImageIcon("images.png");
        frame.setIconImage(diamond.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        panel.setLayout(null);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton button = new JButton("login");
        button.setBounds(100,80,80,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = String.valueOf(passwordText.getPassword());
                System.out.print(user + "," + password);
                if(user.equals("EJ") && password.equals("123")) {


                    item1();


                }else {
                    JOptionPane.showMessageDialog(null,"Wrong UserName or Password");
                }
                frame.dispose();
            }
        });
        panel.add(button);


        frame.setVisible(true);


    }

}