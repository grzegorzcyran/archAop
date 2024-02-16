package edu.grcy.archaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//required to enable AspectJ
@EnableAspectJAutoProxy(proxyTargetClass = true)
//we need to scan for components in both packages as aspects are in one and beans in the other
@ComponentScan(basePackages={"edu.grcy.aspect", "edu.grcy.archaop"})
public class ArchAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchAopApplication.class, args);

    }

}
