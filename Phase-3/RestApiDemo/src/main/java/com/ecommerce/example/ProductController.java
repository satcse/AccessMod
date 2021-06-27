package com.ecommerce.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapi") // Start of the URI of the REST Web Service
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/allproduct") // end of the URI
	public List<ProductEntity> getAllProducts()
	{
		return productService.getAllProduct();
	}
	
	@RequestMapping("/product/{id}")
	public ProductEntity getProduct(@PathVariable int id)
	{
		return productService.getProduct(id);
	}
	
	//http://localhost:8080/webapi/product
	@RequestMapping(method=RequestMethod.POST, value="/product")
	public void addProduct(@RequestBody ProductEntity pe) //Mapping from POST Body is done to pe java object
	{
		productService.addProduct(pe);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/product/{id}")
	public void updateProduct(@PathVariable int id, @RequestBody ProductEntity prodEntity)
	{
		productService.updateProduct(id, prodEntity);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		productService.deleteProduct(id);
	}

}
