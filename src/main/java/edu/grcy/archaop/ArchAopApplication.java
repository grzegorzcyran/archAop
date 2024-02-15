package edu.grcy.archaop;

import edu.grcy.archaop.account.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages={"edu.grcy.aspect", "edu.grcy.archaop"})
public class ArchAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchAopApplication.class, args);

    }

}
