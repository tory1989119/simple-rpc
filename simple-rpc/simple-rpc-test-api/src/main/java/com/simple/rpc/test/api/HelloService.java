package com.simple.rpc.test.api;

public interface HelloService {

    String hello(String name);

    String hello(Person person);
}
