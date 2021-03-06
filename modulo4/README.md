# Spring Boot Web MVC

Instrutor: André Luis Gomes e Glauber Cardoso Barboza

Repositório original: [global-labs-academy](https://github.com/andrelugomes/global-labs-academy)

Plataforma de Ensino: [Digital Innovation One](https://digitalinnovation.one/sign-up?ref=K5EF2VCVKA)

Módulo Criando aplicações web com Spring Web MVC - Dio Bootcamp GFT Java & AWS Developer


<hr>


### Tecnologias utiizadas
- [Spring Initializr](https://start.spring.io/)
- [Spring Boot: 2.4.12](https://spring.io/projects/spring-boot)
  - [Spring Web (WEB)](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-developing-web-applications)
  - [Thymeleaf - (TEMPLATE ENGINES)](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
  - Validation - (I/O)
  - H2 Database - (SQL)
  - [Spring Data JPA - (SQL)](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data)
  - [Spring Boot DevTools - (DEVELOPER TOOLS)](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#using-boot-devtools)
- [Arquitetura REST - Representational State Transfer](https://pt.wikipedia.org/wiki/REST)


<hr>

### Pesquisa complementar
- [Validating Form Input](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.3-Release-Notes#validation-starter-no-longer-included-in-web-starters)
- [accessing-data-jpa](https://spring.io/guides/gs/accessing-data-jpa/)
- [integrate H2 with Spring Boot](https://roytuts.com/integrate-h2-in-memory-database-with-spring-boot/)
- [Database Initialization using data.sql and schema.sql](https://www.youtube.com/watch?v=9Yj2TCvrvaE)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

<hr>

### Comandos

[Executar](https://docs.gradle.org/current/userguide/command_line_interface.html#sec:command_line_executing_tasks)

``` ./gradlew bootRun ```

[Limpar](https://docs.gradle.org/current/userguide/command_line_interface.html#cleaning_outputs)

``` ./gradlew clean ```

[Build](https://docs.gradle.org/current/userguide/command_line_interface.html#computing_all_outputs)

``` ./gradlew build ```

[Atualizar Dependências](https://docs.gradle.org/current/userguide/command_line_interface.html#sec:command_line_execution_options)

``` ./gradlew --refresh-dependencies bootRun ```


<hr>

### O que é Spring

#### Spring Framework

+ Complemento ao Java EE. Não é uma implementação. Integração com algumas especificações
+ Container de Inversão de Controle - Inversion of Control (IoC)
+ Injeção de Dependência - dependency injection (DI) : @Autowired
+ Spring Beans : <bean/>  @Bean : Um Objeto que será gerenciado pelo IoC Container
+ org.springframework.context.ApplicationContext : Representa IoC container e é responsável instanciar, configurar e construir esses beans.
+ 5.0.6
+ Spring?s Aspect-Oriented Programming (AOP)
+ Spring Web MVC
+ Spring WebFlux ^5.0
	- http://www.reactive-streams.org - SPEC (https://github.com/reactive-streams/reactive-streams-jvm)

	+ http://projectreactor.io - IMPL (Reactor is a Reactive Streams library)
	+ http://reactivex.io - IMPL (https://github.com/ReactiveX/RxJava)

+ https://spring.io/projects/spring-framework#learn
+ https://docs.spring.io/spring/docs/current/spring-framework-reference/overview.html
+ https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html

#### Spring Boot

+ Convenção sobre Configuração.
+ Auto configurações por padrão.
+ Pronto para Produção (you can "just run").
+ Não é um gerador de código.
+ Plug-and-play de módulos starters
+ Tomcat, Jetty ou Undertow embedado
+ 2.0.3

	+ https://spring.io/projects/spring-boot
	+ https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/htmlsingle/


#### Spring Web MVC

+ MVC - Model, View and Controller

	+ View = https://www.thymeleaf.org/

+ Start.io = Web e Thymeleaf

+ @Controller
+ @Repository
+ @Service
+ ModelAndView VS Model
+ EL ${}