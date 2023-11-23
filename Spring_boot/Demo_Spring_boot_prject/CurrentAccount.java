package com.example.demo_project_spring_boot.Account;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CurrentAccount implements Account{
    public CurrentAccount() {
        System.out.println("current");
    }

    @Override
    public String display() {

        return "This is Current Account";
    }

}
