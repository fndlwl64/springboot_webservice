# WEB_COMMUNITY

- 개인 프로젝트
- 간단한 커뮤니티 게시판
- aws ec2에 무중단 배포 중

# Tech

`JAVA SDK 11` `SpringBoot 2.7.1` `Mustache` `JPA` `H2` `MariaDB` `AWS EC2` `AWS RDS` `Travis CI` `Nginx`

# Tree
```
  src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─spring
    │  │          └─web_community
    │  │              ├─config
    │  │              │  └─auth
    │  │              │      └─dto
    │  │              ├─service
    │  │              └─web
    │  │                  ├─domain
    │  │                  │  ├─posts
    │  │                  │  └─user
    │  │                  └─dto
    │  └─resources
    │      ├─static
    │      │  └─js
    │      │      └─app
    │      └─templates
    │          └─layout
    └─test
        ├─java
        │  └─com
        │      └─spring
        │          ├─book
        │          └─web_community
        │              └─web
        │                  ├─domain
        │                  │  └─posts
        │                  └─dto
        └─resources
```

# Domain

- 게시판 기능 구현
  - Layered Architecture로 계층을 나누어 구분
  - DTO : 클라이언트로 부터 받는 데이터를 받아 계층 간 데이터 교환을 위해 사용
  - Entity : 데이터베이스의 테이블과 ORM을 구현하는 객체
- SpringSecurity
  - 회원 정보 보안을 위해 사용
  - SecurityFilterChain을 통해 인증 및 인가 절차 시작
  - 네이버나 구글에게 OAuth2 인증 절차를 수행하게 하고 액세스 토큰 발급 
  - 발급 받은 토큰을 OAuth2AuthenticationProcessingFilter에서 유효성 검사 실시


