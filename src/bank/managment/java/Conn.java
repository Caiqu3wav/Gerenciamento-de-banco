package bank.managment.java;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///bankmanegement","root","password");
            s =c.createStatement();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
