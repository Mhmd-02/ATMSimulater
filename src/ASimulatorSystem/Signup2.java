
package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.text.AbstractDocument;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l9,l10,l11,l12,l13;
    //JLabel Formnum;
    JButton b;
    JRadioButton r1,r2,r3,r4,r5,r6;
    JTextField t1,t2;
    JComboBox c1,c2,c3,c4,c5;
    String formno;
    private javax.swing.ButtonGroup grp1,grp2,grp3;
    //Signup su = new Signup(2);
    //String x = su.getFnum();
    
    Signup2(String formno){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: Additonal Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l2 = new JLabel("Nationality:");
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l3 = new JLabel("Other Nationality:");
        l3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l7 = new JLabel("NID Number:");
        l7.setFont(new Font("Raleway", Font.BOLD, 16));
        
        
        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 16));
        
        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        
       // Formnum = new JLabel(" "+x);
        //Formnum.setFont(new Font("Raleway",Font.BOLD,13));
        
        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        ((AbstractDocument) t1.getDocument()).setDocumentFilter(new Filter());
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        grp3 = new javax.swing.ButtonGroup();
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        grp3.add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        grp3.add(r2);
        grp2 = new javax.swing.ButtonGroup();
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        grp2.add(r3);
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        grp2.add(r4);
        grp1 = new javax.swing.ButtonGroup();
        r5 = new JRadioButton("Yes");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        grp1.add(r5);
        
        
        r6 = new JRadioButton("No");
        r6.setFont(new Font("Raleway", Font.BOLD, 14));
        r6.setBackground(Color.WHITE);
        grp1.add(r6);
        
        String nationality[] = {"Lebanese","Syrian","Palestanian","Other"};
        c1 = new JComboBox(nationality);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        /*String othrNat[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(othrNat);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));*/
        
        String income[] = {"Null","<$1,500","<$2,500","<$5000","Upto $10000","Above $10000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
       
        
        setLayout(null);
        
        //The location and sizes of the elements
        
        l12.setBounds(700,10,60,30);
        add(l12);
        //Formnum.setBounds(770,10,60,30);
        
        l13.setBounds(760,10,60,30);
        add(l13);
        
        l1.setBounds(280,30,600,40);
        add(l1);
        
        l2.setBounds(100,100,100,30);
        add(l2);
        
        c1.setBounds(350,100,320,30);
        add(c1);
        
        l3.setBounds(100,150,100,45);
        add(l3);
        
        /*c2.setBounds(350,150,320,30);
        add(c2);*/
        
        r5.setBounds(350,150,100,30);
        add(r5);
        r6.setBounds(460,150,100,30);
        add(r6);
        
        
        l4.setBounds(100,200,100,30);
        add(l4);
        
        c3.setBounds(350,200,320,30);
        add(c3);
        
        l5.setBounds(100,245,150,30);
        add(l5);
        
        c4.setBounds(350,257,320,30);
        add(c4);
        
        l11.setBounds(100,265,150,30);
        add(l11);
        
        l6.setBounds(100,320,150,30);
        add(l6);
        
        c5.setBounds(350,320,320,30);
        add(c5);
        
        l7.setBounds(100,370,150,30);
        add(l7);
        
        t1.setBounds(350,370,320,30);
        add(t1);
        
        l9.setBounds(100,420,150,30);
        add(l9);
        
        r1.setBounds(350,420,100,30);
        add(r1);
        
        r2.setBounds(460,420,100,30);
        add(r2);
        
        l10.setBounds(100,470,180,30);
        add(l10);
        
        r3.setBounds(350,470,100,30);
        add(r3);
        
        r4.setBounds(460,470,100,30);
        add(r4);
        
        b.setBounds(380,530,100,30);
        add(b);
        
        b.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(830,750);
        setLocation(250,30);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String Nationality = (String)c1.getSelectedItem(); 
        String OtherNat="";
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String Nid = t1.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        if(r5.isSelected()){ 
            OtherNat = "Yes";
            
        }else if(r6.isSelected()){ 
            OtherNat = "No";
        }
        
        try{
            if(t1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup2(ID,Nationality,OthNat,Income,Edu,occup,National_ID,SCitizen,Existing) values('"+formno+"','"+Nationality+"','"+OtherNat+"','"+income+"','"+education+"','"+occupation+"','"+Nid+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
             JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
               
    }
    
    
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}
