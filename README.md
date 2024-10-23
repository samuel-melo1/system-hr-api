# API Recursos Humanos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://shields.io/badge/MySQL-lightgrey?logo=mysql&style=plastic&logoColor=white&labelColor=blue)
![Docker](https://shields.io/badges/docker-image-size)

Esse é um projeto construído em  **Java com Spring Boot e banco de dados H2 e JPA com Hibernate. Load Balancing, OpenFeign e API Gateway, Lombok, Spring Cloud, Docker e Git/Github .** 

A API simula um sistema de recursos humanos construído em uma arquitetura de microsserviços, responsável pela realização de pagamentos de funcionários. Tendo uma api responsável pelo controle de usuários e outra para pagamentos.

## Table of Contents

- [Instalação](#instalação)
- [Usabilidade](#usabilidade)
- [API Endpoints](#api-endpoints)
- [Contribuição](#contribuição)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/samuel-melo1/system-hr-api
```

2. Instale as dependencias com Maven

3. A API utiliza o Docker para containerização de toda a aplicação, incluindo a api-gateway e o 
eureka server. Portanto, é necessário realizar a instalação do Docker na sua máquina, abaixo estará o link para instalação: 

[Docker](https://docs.docker.com/engine/install/)

## Usabilidade

1. Inicie a aplicação com o Maven
2. A API estará disponível em http://localhost:8080


## API Endpoints
A API possui os seguintes endpoints:

```markdown

GET /api/payments/{id} - Buscar um pagamento realizado relacionado a um empregado. 

GET /api/users/{id} - Buscar um usuário cadastrado na base de dados. 

GET /api/users/ - Buscar todos os usuários cadastrados na base de dados. 
```

## Contribuição

Sugestões e/ou contribuições são bem-vindas! Se você encontrar qualquer questão ou tenha sugestões de melhorias, por favor, abra uma solicitação pull para o repositório. 


Ao contribuir para este projeto, siga o estilo de código existente, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), e envie suas alterações em uma ramificação separada.
