# 📋 Requisitos do Sistema – Smart Arborization System

## 1. Requisitos Funcionais

RF01. O sistema deve permitir que usuários autenticados registrem ocorrências de árvores com risco de queda ou já caídas.  
RF02. O sistema deve permitir que qualquer usuário visualize o mapa com registros ativos (não resolvidos).  
RF03. O sistema deve permitir que usuários autenticados atualizem o status de ocorrências se estiverem próximos geograficamente e enviarem uma nova foto.  
RF04. O sistema deve exibir os detalhes completos de uma ocorrência ao clicar em um ponto do mapa.  
RF05. O sistema deve registrar as informações de cada ocorrência: localização, tipo (risco ou queda), observações, status, foto, data/hora.  
RF06. O sistema deve validar o login via autenticação JWT.  
RF07. O sistema deve rejeitar o registro ou atualização de ocorrência por usuários não autenticados.  
RF08. O sistema deve armazenar os dados de forma geoespacial para uso em mapas.
RF09. O sistema deve apresentar apenas ocorrências com status diferente de “resolvido” no mapa.  
RF10. O sistema deve estar disponível via navegador (aplicação web responsiva).

## 2. Requisitos Não-Funcionais

RNF01. A aplicação deve ser desenvolvida com arquitetura RESTful.  
RNF02. O sistema deve usar PostgreSQL com PostGIS como banco de dados geoespacial.  
RNF03. A API deve ser implementada em Java com Spring Boot.  
RNF04. O front-end deve ser implementado com React, Vite e Mantine.  
RNF05. O tempo de resposta da API para operações principais deve ser inferior a 500ms em condições normais.  
RNF06. A aplicação deve ser hospedada em ambiente cloud via Docker no Heroku.  
RNF07. O sistema deve utilizar Leaflet.js para exibição de dados geoespaciais no front-end.  
RNF08. A autenticação deve seguir o padrão JWT com expiração configurável.  
RNF09. O sistema deve estar containerizado com Docker para ambientes de desenvolvimento e produção.  
RNF10. O projeto deve seguir práticas de versionamento, testes automatizados (back-end), documentação e organização por monorepo.

## 3. Considerações

- Não haverá curadoria ou moderação nos registros inicialmente.
- Haverá apenas um tipo de usuário no MVP: **cidadão autenticado**.
- O registro poderá ser atualizado por qualquer usuário, desde que esteja geograficamente próximo e envie uma nova foto.
- As fotos inicialmente serão armazenadas como URLs (armazenamento em nuvem a ser definido na [HIST-004](https://github.com/RafaelCarvalho89/smart-arborization-system/issues/4)).

---

### [Voltar para a descriçãodo projeto](../README.md)

