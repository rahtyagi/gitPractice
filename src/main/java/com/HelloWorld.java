package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

@Value("${property.messages}")
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}
