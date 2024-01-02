package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField t1;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 675);
        add(l3);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("$ 50");
        b2 = new JButton("$ 100");
        b3 = new JButton("$ 150");
        b4 = new JButton("$ 200");
        b5 = new JButton("$ 250");
        b6 = new JButton("$ 500");
        b7 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(235, 200, 700, 35);
        l3.add(l1);

        b1.setBounds(170, 295, 150, 35);
        l3.add(b1);

        b2.setBounds(390, 295, 150, 35);
        l3.add(b2);

        b3.setBounds(170, 340, 150, 35);
        l3.add(b3);

        b4.setBounds(390, 340, 150, 35);
        l3.add(b4);

        b5.setBounds(170, 385, 150, 35);
        l3.add(b5);

        b6.setBounds(390, 385, 150, 35);
        l3.add(b6);

        b7.setBounds(390, 430, 150, 35);
        l3.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(960, 675);
        setLocation(150, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount="";
            if (ae.getSource() == b1){
                amount = "50";
            }
            else if (ae.getSource() == b2){
                amount = "100";
            }
            else if (ae.getSource() == b3){
                amount = "150";
            }
            else if (ae.getSource() == b4){
                amount = "200";
            }
            else if (ae.getSource() == b5){
                amount = "250";
            }
            else if (ae.getSource() == b1){
                amount = "500";
            }
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;
            while (rs.next()) {
                    balance += Integer.parseInt(rs.getString("amount"));
            }
            if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == b7) {
                this.setVisible(false);
                new Transactions(pin).setVisible(true);
            }else{
                Date date = new Date();
                int newbal = balance - Integer.parseInt(amount);
                c.s.executeUpdate("update bank set date='"+date+"',Lastoperation='Withdrawl',amount='"+newbal+"' where pin = '"+pin+"' ");
                c.s.executeUpdate("insert into operation(pin,mode,date,amount) values('"+pin+"', 'Withdrawl', '"+date+"', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "$ "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}
