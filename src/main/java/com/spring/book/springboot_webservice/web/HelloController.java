package com.spring.book.springboot_webservice.web;

import com.spring.book.springboot_webservice.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*단위 테스트용 코드*/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDTO(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
