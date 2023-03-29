package com.spring.book.springboot_webservice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor/*선언된 final 필드가 포함된 get 메소드를 생성*/
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
