package com.mycompany.msaapp2.service;

import beans.garmentbean;
import entities.Category;
import entities.Garments;
import entities.TblOrder;
import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {
    
    @Inject garmentbean gb;
    
    @GET
    public String getHello() {
        return "Hello, world!";
    }
    
    @GET
    @RolesAllowed("customer")
    @Path("/getCategories")
    @Produces(MediaType.APPLICATION_JSON)
     public Collection<Category> getCategory(){
         return gb.getCategory();
     }
     
    @GET
    @RolesAllowed("customer")
    @Path("/getGarmentsByCatId/{catid}")
    @Produces(MediaType.APPLICATION_JSON)
     public Collection<Garments> getGarmentsByCatId(@PathParam("catid") Integer catid){
         return gb.getGarmentsByCatId(catid);
     }
     
    @GET
    @RolesAllowed("customer")
    @Path("/getOrders")
    @Produces(MediaType.APPLICATION_JSON)
     public Collection<TblOrder> getOrders(){
         return gb.getOrders();
     }
}
