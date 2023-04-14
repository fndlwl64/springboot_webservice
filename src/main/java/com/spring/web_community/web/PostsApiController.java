package com.spring.web_community.web;

import com.spring.web_community.service.PostsService;
import com.spring.web_community.web.dto.PostsResponseDto;
import com.spring.web_community.web.dto.PostsSaveRequestDto;
import com.spring.web_community.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDTO) {
        return postsService.update(id, requestDTO);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long deleteById(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
