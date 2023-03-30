package com.spring.book.springboot_webservice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor/*선언된 final 필드의 값을 할당하는 인자를 받는 생성자 생성*/
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
