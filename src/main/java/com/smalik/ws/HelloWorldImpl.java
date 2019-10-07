package com.smalik.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.smalik.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String getHelloWorldAsString() {
		return "Hello World JAX-WS";
	}
}