# 🌳 Smart Arborization System

Sistema de informação colaborativo para sinalização de árvores com risco de queda ou já caídas, utilizando geolocalização, imagens e mapas interativos. Desenvolvido como parte de um projeto acadêmico alinhado ao ODS 11 - Cidades e Comunidades Sustentáveis.

---

## 🚀 Tecnologias

- **Back-End**: Java + Spring Boot, Spring Security, Spring Data JPA, PostgreSQL + PostGIS
- **Front-End**: Vite + React + Mantine UI + Leaflet.js
- **Banco de Dados**: PostgreSQL com suporte geoespacial (PostGIS)
- **Autenticação**: JWT (Spring Security)
- **Infraestrutura**: Docker, Heroku
- **Testes**: Spring Boot Test, JUnit, MockMvc, @DataJpaTest
- **Abordagem**: Projeto monorepo

---

## 📂 Estrutura do Projeto

```plaintext
smart-arborization-system/
├── backend/
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   ├── ...
├── frontend/
│   ├── src/
│   ├── index.html
│   ├── Dockerfile
│   ├── ...
├── docker/
│   └── init.sql
├── docs/
│   ├── armazenamento-imagens.md
│   ├── arquitetura.md
│   ├── papeis-e-fluxos.md
│   └── requisitos.md
├── .env.example
├── .gitattributes
├── .gitignore
├── docker-compose.yml
└── README.md
```

## 🐳 Execução via Docker Compose

1. Configure seu `.env` com base no `.env.example`
2. Execute:

```bash
docker compose up --build
```

O backend estará disponível em `http://localhost:8080`  
O frontend em `http://localhost:5173`

## 📚 Documentação

- [Requisitos Funcionais e Não-Funcionais](docs/requisitos.md)
- [Papéis de Usuário e Fluxos de Interação](docs/papeis-e-fluxos.md)
- [Arquitetura do Sistema](docs/arquitetura.md)
- [Análise de Armazenamento de Imagens](docs/armazenamento-imagens.md)

---
