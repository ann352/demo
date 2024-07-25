package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//application context is aplace where Spring create Beans
@Service
public class UserService {

    public DatabaseConnection databaseConnection;

    @Autowired //here we autowire DatabaseConnection bean - we should autowire bean in constructor like here
    public UserService(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String name){
        databaseConnection.addUserToDatabase(name);
    }
}
