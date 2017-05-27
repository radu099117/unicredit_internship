/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicredit.rest.test;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *
 * @author soiganradu
 */
@Path("/test")
public class Test {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String test(){
        return "<p>Hello from Class</p>";
    }
}
