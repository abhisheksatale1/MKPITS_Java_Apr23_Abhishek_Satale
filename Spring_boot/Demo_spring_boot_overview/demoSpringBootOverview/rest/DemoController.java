package com.example.demoSpringBootOverview.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Account account1;
    private Account account2;
//    @Autowired
//    public DemoController(@Qualifier("savingAccount")Account account1, @Qualifier("savingAccount") Account account2){
//
//        this.account1=account1;
//        this.account2=account2;
//    }
//    @GetMapping("/")
//    public String displaydetailsSetter(){
//        return account1.display();
//    }
//
//
//    @GetMapping("/check")
//    public String Checkbean(){
//        return "return"+" "+(account1==account2);
//    }

    private Account account;
    @Autowired
    public DemoController(@Qualifier("loanAccount")Account account){
        this.account=account;
    }

    @GetMapping("/")
    public String displaydetails(){
        return account.display();
    }



}
