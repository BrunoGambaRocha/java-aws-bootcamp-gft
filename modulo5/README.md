# Microsserviços em Spring Cloud com Java

Instrutor: Oswaldo Neto


Repositório original: [dio-experts](https://github.com/oswaldoneto/dio-experts) [dio-experts-config](https://github.com/oswaldoneto/dio-experts-config)

Plataforma de Ensino: [Digital Innovation One](https://digitalinnovation.one/sign-up?ref=K5EF2VCVKA)

Módulo Microsserviços em Spring Cloud com Java - Dio Bootcamp GFT Java & AWS Developer


<hr>

### Tecnologias utiizadas
- [Arquitetura REST - Representational State Transfer](https://pt.wikipedia.org/wiki/REST)

- [Spring Initializr](https://start.spring.io/)
	- [Spring Boot 2.6.0](https://spring.io/projects/spring-boot)
	- [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#boot-features-developing-web-applications)
	- [Config Client](https://cloud.spring.io/spring-cloud-config/reference/html/#_spring_cloud_config_client)
	- [Config Server](https://cloud.spring.io/spring-cloud-config/reference/html/#_spring_cloud_config_server)
	- [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
	- [Spring Data Elasticsearch (Access+Driver)](https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#reference)
	- [Spring Data Redis (Access+Driver)](https://spring.io/projects/spring-data-redis)
	- [Eureka Discovery Client](https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html)
	- [Eureka Server](https://spring.io/guides/gs/service-registration-and-discovery/)
	- [Gateway](https://spring.io/projects/spring-cloud-gateway)

- [Docker](https://www.docker.com/)
	- [redis](https://hub.docker.com/_/redis)
	- [elasticsearch](https://hub.docker.com/_/elasticsearch)
	- [kibana](https://hub.docker.com/_/kibana)
	
- [Kibana](https://www.elastic.co/pt/kibana/)



<hr>

## Conteúdo
- Introdução à Arquiteturas de Software - do Monolito ao Microsserviço
- Conhecendo o Ecossistema Spring Boot e Criando um Microsserviço de Catálogo de Produtos
- Conceito de Health Check e Configuração do Spring Data Elasticsearch
- Modelagem e Persistência de Dados com Spring Data Elasticsearch em uma API REST
	- [x] [Lab microserviço product-catalog](https://youtu.be/9fQUyN0WvaE)
- Configurando um Microsserviço de Carrinho de Compras com Spring Data Redis
	- [x] Lab microserviço shopping-cart
- Criando um Config Server
- Conectando os Microsserviços ao Config Server
	- [ ] Lab microserviço config-server
- Criando um Service Discovery
	- [ ] Lab microserviço service-discovery
- Registrando os Microsserviços ao Service Discovery e Criando um Gateway
- Configurando o Gateway e Entendendo suas Responsabilidades
	- [ ] Lab microserviço gateway



<hr>

### Comandos

Docker - Listar MVs

``` docker-machine ls ```

[Containers status](https://medium.com/xp-inc/principais-comandos-docker-f9b02e6944cd)

``` docker ps ```

[Containers iniciar](https://dev.to/ingresse/docker-e-docker-compose-um-guia-para-iniciantes-48k8)

``` docker-compose up -d ```

Monitorar os logs

``` docker-compose logs -f ```

[Docker Fix "Error checking TLS connection: Something went wrong running an SSH command"](https://forums.docker.com/t/error-starting-docker-quickstart/18140/2)

``` docker-machine rm -y default; docker-machine create -d virtualbox default ```


<hr>

## Pesquisa Complementar

- [Docker Toolbox](https://github.com/docker-archive/toolbox/releases)
- [actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- [actuator - health-check](https://reflectoring.io/spring-boot-health-check/)
- [Elasticsearch Guide [6.6] - Removal of mapping types](https://www.elastic.co/guide/en/elasticsearch/reference/6.6/removal-of-types.html)
- [GitHub - spring-data-elasticsearch](https://github.com/spring-projects/spring-data-elasticsearch)
- [Elasticsearch Repositories](https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#elasticsearch.repositories)
- [Using Elasticsearch with Spring Boot](https://reflectoring.io/spring-boot-elasticsearch/)
- [Connecting to Redis](https://docs.spring.io/spring-data/redis/docs/current/reference/html/#redis:connectors)



<hr>

## Autor

Bruno Gamba Rocha

[https://www.linkedin.com/in/bruno-gamba-rocha/](https://www.linkedin.com/in/bruno-gamba-rocha/)