package com.example.demoSpringBootOverview.rest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SavingAccount implements Account{

    @Override
    public String display() {
        return "Saving Account";
    }
}
