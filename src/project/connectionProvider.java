/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author Bisak Sampath
 */
public class connectionProvider {
    public static Connection getCon()
    {
        try
        {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_manage_sys","root","");
         return con;
        } 
        catch (Exception e)
        {
            return null;
        }
    
    }
}
