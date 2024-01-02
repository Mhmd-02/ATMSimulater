
package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Deposit extends JFrame implements ActionListener{
    
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 675);
        add(l3);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        ((AbstractDocument) t1.getDocument()).setDocumentFilter(new Filter());
        
        
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("BACK");
        
        setLayout(null);
        
        l1.setBounds(190,200,400,35);
        l3.add(l1);
        
        t1.setBounds(190,240,320,25);
        l3.add(t1);
        
        b1.setBounds(190,295,150,35);
        l3.add(b1);
        
        b2.setBounds(370,295,150,35);
        l3.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(960,675);
        setUndecorated(true);
        setLocation(150,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pin+"'");
                    int balance=0;
                    while(rs.next()){
                    balance += Integer.parseInt(rs.getString("amount"));}
                    if(balance!=0){
                    int rbal=balance + Integer.parseInt(amount);
                    c1.s.executeUpdate("update bank set amount= '"+rbal+"',Lastoperation ='Deposite' where pin = '"+pin+"' ");
                    c1.s.executeUpdate("insert into operation(pin,mode,date,amount) values('"+pin+"', 'Deposit','"+date+"', '"+amount+"')");
                    }else{
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    c1.s.executeUpdate("insert into operation(pin,mode,date,amount) values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");}
                    JOptionPane.showMessageDialog(null, "$ "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    public static void main(String[] args){
        new Deposit("").setVisible(true);
    }
}
