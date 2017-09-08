package com.example.controller;


import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.example.domain.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Component
@Path("/products")
public class ProductController {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getProduct() {
        Product product = new Product();
        product.setName("iPad 3");
        product.setQty(999);
        return Response.ok(Arrays.asList(product), MediaType.APPLICATION_JSON).build();

    }

    @POST
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response createProduct(Product product) {

        String result = "Product created : " + product;
        return Response.status(201).entity(result).build();

    }

}