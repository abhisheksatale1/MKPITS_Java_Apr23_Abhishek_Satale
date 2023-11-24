package com.example.demoSpringBootOverview.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CurrentAccount implements Account{

    public CurrentAccount(){
        System.out.println("Current");
    }

    @Override
    public String display() {
        return "Current Account";
    }
@PostConstruct
    public void Startupwork(){
        System.out.println("start"+getClass().getSimpleName());
    }
@PreDestroy

public void Endwork(){
    System.out.println("End this method"+getClass().getSimpleName());
}
}
