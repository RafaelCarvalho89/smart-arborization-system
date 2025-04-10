# 🖼 Análise de Armazenamento de Imagens – Smart Arborization System

## Objetivo

Avaliar as opções viáveis para armazenar imagens enviadas pelos usuários nas ocorrências de árvores com risco ou queda. A análise considera facilidade de uso, custo, escalabilidade, integração com Java/Spring e recursos disponíveis no GitHub Student Developer Pack.

---

## Opções Avaliadas

| Solução         | Tipo         | Integração com Java | GitHub Student Pack | Vantagens | Desvantagens |
|-----------------|--------------|---------------------|----------------------|-----------|---------------|
| **Amazon S3**    | Cloud (Object Storage) | Boa (SDK ou Spring Cloud AWS) | Sim, 12 meses com 5GB | Alta confiabilidade, bem documentado | Requer configuração de IAM, política de acesso, tokens |
| **Backblaze B2** | Cloud (Object Storage) | Via API REST ou SDKs | Sim, 10GB gratuitos | Barato, leve, fácil de usar no GitHub Pack | Integração em Java menos documentada que o S3 |
| **Cloudinary**   | Cloud (especializado em imagens) | SDK Java disponível | Sim, plano gratuito de 25 créditos/mês | Otimização automática, thumbnails, links diretos | Limite mensal baixo, requer conta |

---

## ✅ Escolha: **Backblaze B2**

### Justificativa:
- Disponível gratuitamente no GitHub Student Developer Pack com 10 GB.
- Boa alternativa ao S3, mais simples e com menos complexidade de configuração.
- Integração pode ser feita por API REST direta.
- Permite uso de URLs públicas para carregar imagens no front-end com Leaflet.js.

---

## Considerações Futuras

- Para produção em escala, Amazon S3 pode ser revisado como opção mais robusta.
- Cloudinary pode ser adotado futuramente caso se deseje compressão automática, thumbnails ou otimizações de imagem.
- Durante o desenvolvimento, pode-se usar armazenamento local temporário (com links fake ou CDN pública).

---

## Referências

- [Backblaze B2 GitHub Student Pack](https://education.github.com/pack)
- [Amazon S3 Free Tier](https://aws.amazon.com/free)
- [Cloudinary for Students](https://education.github.com/pack#offers)

---

### [Voltar para a descriçãodo projeto](../README.md)