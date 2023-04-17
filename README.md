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
  - Entity : 데이터베이스의 테이블과 자바 객체 사이의 ORM을 구현하는 객체
- SpringSecurity
  - 회원 정보 보안을 위해 사용
  - SecurityFilterChain에서 클라이언트에서 요청을 받고 인증 및 인가 절차를 하는 객체에 넘김
  - 네이버나 구글에게 OAuth2 인증 절차를 수행하게 하고 액세스 토큰 발급 
  - 발급 받은 토큰을 SecurityFilterChain에서 유효성 검사를 해주는 객체에 넘김

# Deploy
- 배포를 위해 AWS ec2 서버 사용
  - t2.micro 사용 -> 메모리 양이 적은 문제 발생(1GB) -> 해결책으로 swap 파일이라는 가상 메모리(4GB) 설정
- AWS RDS 사용 
  - MariaDB 데이터베이스 설정
  - 배포하기 전에 테스트할 용도로 h2 데이터베이스를 따로 사용 (application-h2.yml에 설정) -> application에 profile 설정을 바꾸면서 사용
- 깃허브 Master에 올릴 시 ec2에 배포되도록 Travis CI 사용
  - 보안을 위해 깃허브에 DB와 OAuth2에 접속하기 위한 계정 정보를 담는 application 파일을 올리지 않도록 .gitignore 설정
- 무중단 배포를 위해 Nginx 사용
  - ec2 내부에 8081, 8082 포트 사용해서 배포

