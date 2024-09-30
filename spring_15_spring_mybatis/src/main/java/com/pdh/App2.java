package com.pdh;

import com.pdh.config.SpringConfig;
import com.pdh.domain.Account;
import com.pdh.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac =accountService.findById(2);
        System.out.println(ac);
    }
}
