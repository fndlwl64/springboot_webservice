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
  Layered Architecture로 계층을 나누어 구분
  DTO와 Entity 객체를 나누어 Controller 계층에 데이터를 담는 객체를 DTO 객체로 만들어 유연성을 확보하고
  Entity 객체에 대한 의존성을 줄임
- Oauth2
  


