package com.spring.book.springboot_webservice.web.domain.posts;

import com.spring.book.springboot_webservice.web.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity/*테이블에 매핑할 객체*/
@Getter
@Table(name = "book_posts")
public class Posts extends BaseTimeEntity {
    @Id/*PK 지정*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*기본키 생성 전략 : table,sequence,identity */
    private Long id;

    @Column(length = 500 , nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
