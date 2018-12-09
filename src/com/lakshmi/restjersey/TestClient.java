package com.lakshmi.restjersey;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClient {
    public static void main(String[] args) {

        Client client = Client.create();

        WebResource resources1 = client.resource("http://localhost:8030/rest/helloService/sayHello?name1=kv&age=3");

        String res = resources1.get(String.class);
        System.out.println(res);

}
}
