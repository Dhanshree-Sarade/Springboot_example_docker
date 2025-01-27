package com.ezio.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping
	public Object test() {
		Map<String, String> object = new HashMap<>();
		object.put("Name", "Ezio Infotech Pvt Ltd");
		object.put("Email", "ezioinfotech@gmail.com");
		return object;
	}

}
