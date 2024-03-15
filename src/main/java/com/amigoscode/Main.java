package com.amigoscode;


import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //usage of javafaker lesson 267
        Faker faker=new Faker();
        System.out.println(faker.name().name());
        System.out.println(faker.address().city());

    }
}