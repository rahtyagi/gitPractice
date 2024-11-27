package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	@GetMapping("/checkavailablity")
public String isAvailable(){
	return "Address service available";
}
}
