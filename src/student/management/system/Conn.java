package student.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    public Object s;


    Statement S;
    Connection c;
    public Conn(){




        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///studentmanagementsystem","root","151204");
            S=c.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
