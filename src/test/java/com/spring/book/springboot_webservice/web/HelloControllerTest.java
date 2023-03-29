package com.spring.book.springboot_webservice.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)/*Junit 에 내장된 실행자 외에 다른 실행자 실행*/
@WebMvcTest/*웹 테스트 용 , @Service , @Component , @Repository 등 사용 불가*/
public class HelloControllerTest {
    @Autowired/*스프링이 관리하는 빈을 주입*/
    private MockMvc mvc;/*MVC 테스트의 시작점*/

    @Test
    public void hello_test() throws Exception {
        String hello = "Hello!!";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDTO_test() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));

    }
}
