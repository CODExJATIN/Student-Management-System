package student.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login,cancel;
    JTextField tfusername;
    JPasswordField tfpassword;

    Login(){
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);

        JLabel lbusername = new JLabel("Username");
        lbusername.setFont(new Font("Tahoma",Font.BOLD,15));
        lbusername.setBounds(40,20,100,20);
        add(lbusername);

        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,20);
        add(tfusername);

        JLabel lbpassword = new JLabel("Password");
        lbpassword.setFont(new Font("Tahoma",Font.BOLD,15));
        lbpassword.setBounds(40,70,100,20);
        add(lbpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150,70,150,20);
        add(tfpassword);

        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Tahoma",Font.BOLD,15));
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(170,140,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,200,200);
        add(image);



        setSize(600,300);
        setLocation(400,250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            String username = tfusername.getText();
            String password = tfpassword.getText();

            String query ="select * from id_pas where username = '"+username+"' and password = '"+password+"'";

            try{
                Conn c = new Conn();
                ResultSet r = c.S.executeQuery(query);
                if(r.next()){
                    setVisible(false);
                    new Project();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                    setVisible(false);
                }

                c.S.close();

            } catch (Exception e1){
                e1.printStackTrace();
            }
        } else if(e.getSource()==cancel){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
