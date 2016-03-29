package bean;

import com.sun.rowset.JdbcRowSetImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.sql.rowset.JdbcRowSet;

public class Modal implements java.io.Serializable{
    private String name;
    private String email;
    private String contact;
    private String pass;
    private String cpass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    
    
    Connection con;
    PreparedStatement ps;
    JdbcRowSet jr;
    String conURL;
    public Modal(){
        conURL="jdbc:oracle:thin:@localhost:1521:xe";
    System.out.println("HELLO WORLD");
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection(conURL, "SYSTEM", "sunflower");
        jr=new JdbcRowSetImpl();
        jr.setUrl(conURL);
        jr.setUsername("SYSTEM");
        jr.setPassword("sunflower");
        
    }catch(Exception e){}
    
    }
    public Modal(Modal m){
   // save1();
    }
        
    public Modal(String name, String pass, String cpass, String email, String contact) throws ServletException
    {
            
        System.out.println(name+" myname ");
       
        this.name=name;
        this.email=email;
        this.pass=pass;
        this.contact=contact;
        this.cpass=cpass;
    }
    
    public void save1() 
    {
        try
        {   //System.out.println("HELLO WORLD 2");
           ps=con.prepareStatement("insert into users values(?,?,?,?,?)");
           System.out.println(email+" is my email");
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4, contact);
            ps.setString(5, cpass);
            ps.executeUpdate();
      }
        catch(Exception e)
        {
           e.printStackTrace();
        }
        
    }
    
    public java.util.ArrayList fetch1()
    {
        ArrayList al=new ArrayList<String>();
        try
        {
            jr.setCommand("Select * from users");
            jr.execute();
            
            Modal m=new Modal();
           while(jr.next())
            {   
               //Modal m=new Modal(jr.getString(1),jr.getString(2),jr.getString(3),jr.getString(4),jr.getString(5));
                //System.out.println(jr.getString(1));
               
                al.add(jr.getString(1));
                al.add(jr.getString(2));
                al.add(jr.getString(3));
                al.add(jr.getString(4));
                al.add(jr.getString(5));
                al.add(m);      
                
            }
          
        }
        catch(Exception eee)
        {
             eee.printStackTrace();
        }
        
        return al;
    }    
}
