package br.com.pomin.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @GetMapping("hello")
    public String hello() {
        return "Opaaaa tamo ai";
    }

}
