package com.smalik.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.smalik.ws.HelloWorld;

public class HelloWorldClient{
	
	public static void main(String[] args) throws Exception {
	   
		URL url = new URL("http://localhost:8080/hello");
        QName qname = new QName("http://ws.smalik.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString());
       
    }

}
