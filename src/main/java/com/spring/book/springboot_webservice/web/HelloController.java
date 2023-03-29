package com.spring.book.springboot_webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*단위 테스트용 코드*/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!";
    }
}
