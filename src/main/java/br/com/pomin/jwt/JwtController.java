package br.com.pomin.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @GetMapping("hello")
    public String hello(@RequestHeader String jwt) {
        System.out.println(jwt);
        return "Opaaaa tamo ai: " + jwt;
    }

    @PostMapping("hello")
    public String hellop(@RequestHeader String jwt) {
        return "Opaaaa tamo ai";
    }

}
