package com.smalik.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace="http://ws.smalik.com/", name="HelloWorld")
public interface HelloWorld {
	
	@WebMethod String getHelloWorldAsString();

}