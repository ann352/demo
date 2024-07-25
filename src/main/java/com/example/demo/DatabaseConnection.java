package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //annotation for bean that must be created by Spring
public class DatabaseConnection {
    @Value("localhost")
    public String host;

    @Value(("Ania"))
    public String name;

    @Value("TopSecretPassword") //normally we put that information i application.properties file not here, giving here the name of property
    public String password;

    public void addUserToDatabase(String name){
        System.out.println("Added user to database");
    }
}
