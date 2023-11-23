package com.example.demo_project_spring_boot.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//   @Autowired
    private Account account;
   @Autowired
   public DemoController(@Qualifier ("savingAccount")Account account){

       this.account=account;
   }
//    public DemoController(Account account){   // constructor injection through
//        this.account=account;
//    }
//    @Autowired
//    public void setAccount(Account account) { //setter injection
//        this.account = account;
//    }
    //    @GetMapping("/")
//    public String displaydetails(){
//        return account.display();
//    }


    @GetMapping("/")
    public String displaydetailsSetter(){
        return account.display();
    }

//    @Autowired
//    public void SetAccount(Account account){
//       this.account=account;
//    }
//    @GetMapping("/other")
//    public String diplayotherclass(){
//       return account.display();
//    }

}
