/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicredit.rest.cancelTicket;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author soiganradu
 */
@Path("/cancel")
public class CancelTicket {
    
    @GET 
    @Produces(MediaType.TEXT_HTML)
    public String cancelTicket(){
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Nu merge conexiunea Stapane!");
        }
        try {
            Connection conn = DriverManager.getConnection("mysql:jdbc://localhost/com.unicredit.rest", "root","");
            Statement s = conn.createStatement();
            String query = "DELETE u FROM Tickets WHERE u.id="+id;
            s.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(CancelTicket.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        return "<p>Tichetul a fost anulat Stapane!</p>";
    }
}
