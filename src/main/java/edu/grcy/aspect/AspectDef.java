package edu.grcy.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDef {

    @Before("execution(public void accountInfo())")
    public void beforeAccountInfoAdvice() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!! @Before accountInfo() !!!!!!!!!!!!!!!!!!!!!!");
    }

    @After("execution(* edu.grcy.archaop.account..*(..))")
    public void afterAccountInfoAdvice() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!! @After anytnihg in account package !!!!!!!!!!!!!!!!!!!!!!");
    }

}
