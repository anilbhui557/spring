package com.kuebiko.hello.controller.service;

public class HelloService {

    public String save(String data){

        String temp = reverse(data);
        return temp;
    }

    public String reverse(String data){
        String reverseString = new StringBuilder(data).reverse().toString();
        return reverseString;
    }


}
