package com.example.demoSpringBootOverview.config;

import com.example.demoSpringBootOverview.rest.Account;
import com.example.demoSpringBootOverview.rest.LoanAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


    @Configuration
    public class BankConfig{
        @Bean
        public Account loanAccount (){
            return new LoanAccount();
        }
    }

