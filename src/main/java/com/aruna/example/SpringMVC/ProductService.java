package com.aruna.example.SpringMVC;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import com.aruna.example.SpringMVC.domain.Product;

@RestController
@Component
@Path(value="/json/product")
public class ProductService {

	@GET
	@Path(value="/get")
	@Produces("application/json")
	public Product getProductInJSON() {

		Product product = new Product();
		product.setName("iPad 3");
		product.setQty(999);
		return product; 

	}

	@POST
	@Path(value="/post")
	@Consumes("application/json")
	public Response createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();
		
	}
	
}