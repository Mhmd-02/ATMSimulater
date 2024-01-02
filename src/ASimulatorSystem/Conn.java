package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    String SUrl,SUser,SPass;
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            SUrl="jdbc:MySQL://localhost:3306/bank_db";
            SUser="root";
            SPass="";
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection(SUrl,SUser,SPass);    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
