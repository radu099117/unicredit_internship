/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicredit.rest.cancelTicket;

import com.unicredit.rest.listEvents.ListEvents;
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
@Path("/cancel_ticket")
public class CancelTicket {
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    public String cancelTicket(@FormParam("id") String id){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Nu se incarca driverul Stapane!");
        }
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/com.unicredit.rest","root","");
            Statement s = conn.createStatement();
            String query = "DELETE FROM Tickets WHERE id="+id;
            s.executeUpdate(query);
        }catch(SQLException ex){
             Logger.getLogger(CancelTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Biletul a fost anulat Stapane!";
    }
}
