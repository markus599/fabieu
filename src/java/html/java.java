/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

import javax.faces.bean.ManagedBean;
import java.sql.*;

@ManagedBean
public class java {
public void buildConnection(){ 
        String var1 = "10";
        String var2 = "2";
        String var3 = "3";
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\m006u036\\Documents\\Database12.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into Tabelle1 values ('"+var1+"','"+var2+"','"+var3+"')");
        } catch (SQLException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
    private String name = "test";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}