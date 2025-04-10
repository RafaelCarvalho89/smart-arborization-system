# 🏗 Arquitetura do Sistema – Smart Arborization System

## 1. Visão Geral

O sistema é composto por três camadas principais: front-end, back-end (API RESTful) e banco de dados com suporte geoespacial. Utiliza arquitetura monolítica modularizada no back-end, estruturada em camadas bem definidas, e comunicação entre front e back via API REST.

---

## 2. Arquitetura em Camadas

```
Usuário (Navegador Web)
        |
        ▼
Front-End (Vite + React + Mantine + Leaflet.js)
        |
        ▼
API RESTful (Spring Boot + Spring Security + JPA)
        |
        ▼
Banco de Dados (PostgreSQL + PostGIS)
```

---

## 3. Tecnologias por Camada

| Camada         | Tecnologias                                |
|----------------|---------------------------------------------|
| Front-End      | Vite, React, Mantine UI, Leaflet.js         |
| Back-End       | Java, Spring Boot, Spring Security, JPA     |
| Banco de Dados | PostgreSQL com extensão PostGIS             |
| Infraestrutura | Docker, Docker Compose, Heroku              |
| Testes         | Spring Boot Test, JUnit, MockMvc, @DataJpaTest |

---

## 4. Comunicação entre Componentes

- O front-end realiza requisições HTTP para a API REST.
- A API processa as requisições, aplica regras de negócio e responde com dados em formato JSON.
- A autenticação é baseada em JWT.
- Dados geoespaciais são manipulados com PostGIS.

---

## 5. Organização do Back-End

```
Controller → Service → Repository → Database
             ↑
          Model
```

- Controller: Camada de entrada HTTP (Spring MVC).
- Service: Camada de regras de negócio.
- Repository: Interface com o banco de dados via Spring Data JPA.
- Model: Entidades do domínio.
- Security Config: Configuração de autenticação JWT e filtros de segurança.

---

## 6. Boas Práticas

- Estrutura em monorepo: `/backend`, `/frontend`, `/docs`, `/docker`.
- Separação clara entre camadas.
- Organização de pacotes por domínio funcional.
- Documentação da API com Swagger/OpenAPI.
- Testes automatizados obrigatórios no back-end.
- Manter o escopo enxuto no MVP.
- Responsividade e acessibilidade no front-end.

---

## 7. Estrutura de Diretórios

```
smart-arborization-system/
├── backend/
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
├── frontend/
│   ├── src/
│   ├── index.html
│   ├── Dockerfile
├── docker/
│   └── docker-compose.yml
├── docs/
│   ├── requisitos.md
│   ├── papeis-e-fluxos.md
│   └── arquitetura.md
└── README.md
```

---

### [Voltar para a descriçãodo projeto](../README.md)