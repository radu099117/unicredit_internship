/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicredit.rest.ticketDetails;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
@Path("/ticket_details")
public class TicketDetails {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getTickets(){
        String details = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Nu se incarca driverul Stapane!");
        }
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/com.unicredit.rest","root","");
            Statement s = conn.createStatement();
            String query = "SELECT * FROM Tickets";
            ResultSet rs  = s.executeQuery(query);
            details = "<html style='"
                    + "background: #200122; "
                    + "background: -webkit-linear-gradient(to right, #200122, #6f0000);"
                    + "background: linear-gradient(to right, #200122, #6f0000);'><body>";
            details = details + "<div style='width:100%;height:100%'><table border=1 style='text-align:center;width:600px;height:300px;color:white' align='center'>";
            details = details + "<tr><td><Strong>Id of Ticket </Strong></td>" +
                                    "<td><Strong>Owner of Ticket </Strong></td>" + 
                                    "<td><Strong>Id of Event </Strong></td></tr>";
            while (rs.next()) 
            {
                details = details + "<tr><td>" + rs.getInt("id") + "</td>" +
                                        "<td>" + rs.getString("owner") + "</td>"+
                                        "<td>" + rs.getInt("event") + "</td></tr>";
            }
            details += "</table></body></html>";
        } catch (SQLException ex) {
            Logger.getLogger(TicketDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }
}
