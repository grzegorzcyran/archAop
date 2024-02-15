package edu.grcy.archaop.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

    @GetMapping("/accountInfo")
    public void accountInfo() {
        System.out.println(getClass().getName() + " user: Account info");
        new Account().accountInfo();
    }
}
