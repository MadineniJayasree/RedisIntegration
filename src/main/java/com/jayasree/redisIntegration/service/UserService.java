package com.jayasree.redisIntegration.service;

import com.jayasree.redisIntegration.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Cacheable(value = "users",key="#id")
    public User getUserById(int id){
        simulateSlowService();
        return new User(id,"User"+id,"User"+id+"@gmail.com");
    }
    private void simulateSlowService(){
        try{
            System.out.println("Fetch data from database...");
            Thread.sleep(3000);

        }
        catch(InterruptedException e){

        }
    }
}
