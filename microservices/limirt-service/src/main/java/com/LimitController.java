package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	@Autowired
	private LimitServiceProp limitServiceProp;

	@GetMapping("/limitConf")
	private LimitConfiguration printConfiguration() {
		return new LimitConfiguration(limitServiceProp.getFirstName(), limitServiceProp.getLastName());
	}
}
