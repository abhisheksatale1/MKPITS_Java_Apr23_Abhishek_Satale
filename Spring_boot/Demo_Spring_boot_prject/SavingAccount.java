package com.example.demo_project_spring_boot.Account;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SavingAccount implements Account{
    public SavingAccount() {
        System.out.println("saving");
    }

    @Override
    public String display() {


        return "this is saving Account";
    }


}
