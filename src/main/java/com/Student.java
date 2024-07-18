package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
@Autowired
private HelloWorld helloWorld;

public HelloWorld getHelloWorld() {
	return helloWorld;
}

public void setHelloWorld(HelloWorld helloWorld) {
	this.helloWorld = helloWorld;
}

}
