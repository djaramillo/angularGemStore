package com.quartz.angularstore.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StoreController {
	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/resttest")
	    public List<Product> greeting(@RequestParam(value="name", defaultValue="World") String name) {
	    	List<Product> products=new ArrayList<Product>();
	    	List<String> imagenes=new ArrayList<String>();
	    	imagenes.add("images/gem-02.gif");
	    	imagenes.add("images/gem-05.gif");
	    	imagenes.add("images/gem-09.gif");
	    	products.add(new Product("Azurite1","Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.",8,110.50,7,"#CCC",14,imagenes,new ArrayList<String>()));
	    	imagenes=new ArrayList<String>();
	    	imagenes.add("images/gem-02.gif");
	    	imagenes.add("images/gem-05.gif");
	    	imagenes.add("images/gem-09.gif");
	    	products.add(new Product("Azurite2","Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.",8,110.50,7,"#CCC",14,imagenes,new ArrayList<String>()));
	    	imagenes=new ArrayList<String>();
	    	imagenes.add("images/gem-02.gif");
	    	imagenes.add("images/gem-05.gif");
	    	imagenes.add("images/gem-09.gif");
	    	products.add(new Product("Azurite3","Some gems have hidden qualities beyond their luster, beyond their shine... Azurite is one of those gems.",8,110.50,7,"#CCC",14,imagenes,new ArrayList<String>()));
	        return products;
	    }
}
