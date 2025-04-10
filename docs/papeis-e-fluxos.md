# 👤 Papéis de Usuário e Fluxos de Interação

## 1. Papéis de Usuário

### 🔹 Cidadão
- Pode se registrar e fazer login.
- Pode registrar novas ocorrências de árvores com risco ou queda.
- Pode atualizar ocorrências existentes se estiver próximo.
- Pode visualizar todas as ocorrências ativas no mapa (inclusive sem estar logado).
- Não possui privilégios administrativos (não há outro tipo de usuário no MVP).

## 2. Fluxos de Interação

### 📌 Fluxo 1 – Visualização pública do mapa

- Qualquer usuário (autenticado ou não) acessa o site.
- O mapa carrega registros com status diferente de "resolvido".
- O usuário pode clicar em qualquer ponto para ver detalhes da ocorrência.

### 📌 Fluxo 2 – Registro de nova ocorrência

- Apenas usuários autenticados têm acesso ao botão de registro.
- O usuário preenche o formulário com:
  - Tipo da ocorrência (risco de queda ou queda).
  - Observações.
  - Localização (via navegador).
  - Imagem (via upload).
- A ocorrência é enviada para a API, validada e salva.

### 📌 Fluxo 3 – Atualização de ocorrência existente

- Qualquer usuário autenticado pode clicar em um ponto do mapa.
- Se estiver próximo geograficamente da ocorrência, pode atualizá-la.
- A atualização exige uma nova foto, status e novas observações.

## 3. Considerações

- A atualização de ocorrência por proximidade geográfica será verificada via cálculo de distância entre a geolocalização atual do usuário e a coordenada registrada.
- A validação de autenticação será feita via token JWT.
- Futuramente poderão ser adicionados novos papéis (ex: administração pública), mas isso não será tratado neste MVP.

---

### [Voltar para a descriçãodo projeto](../README.md)
