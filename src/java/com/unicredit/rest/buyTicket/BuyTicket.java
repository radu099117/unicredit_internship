/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicredit.rest.buyTicket;

import com.unicredit.rest.cancelTicket.CancelTicket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author soiganradu
 */
@Path("/buy_ticket")
public class BuyTicket {
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    public String cancelTicket(@FormParam("name") String name,@FormParam("id") String id){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Nu se incarca driverul Stapane!");
        }
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/com.unicredit.rest","root","");
            Statement s = conn.createStatement();
            String query = "INSERT INTO `Tickets`(`id`,`owner`,`event`) VALUES(0,"+"'"+name+"',"+id+")";
            s.execute(query);
        }catch(SQLException ex){
             Logger.getLogger(CancelTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Ti-ai luat bilet Stapane!";
    }
}
