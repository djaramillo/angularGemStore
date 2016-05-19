package com.quartz.angularstore.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StoreController {
	 private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/resttest")
	    public Product greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Product(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
}
