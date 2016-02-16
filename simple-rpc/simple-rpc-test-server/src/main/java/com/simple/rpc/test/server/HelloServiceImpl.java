package com.simple.rpc.test.server;

import com.simple.rpc.test.api.HelloService;
import com.simple.rpc.test.api.Person;
import com.simple.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello! " + name;
    }

    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
