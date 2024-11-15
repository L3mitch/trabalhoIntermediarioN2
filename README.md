# 🚀 **API de Teste - Exemplo Simples em Java**

Este projeto é uma API desenvolvida em Java com o objetivo de fornecer exemplos simples de interação com requisições HTTP no formato JSON. A API possui rotas GET e POST que podem ser utilizadas para testes ou como base para desenvolvimentos futuros.

## 🛠️ **Requisitos**

- **Java** (versão 8 ou superior)
- **Maven** (para gerenciamento de dependências)
- **Docker** (para execução em container)

## ⚙️ **Preparação**

Antes de iniciar o uso da API, siga os passos abaixo:

1. **📦 Configuração do Projeto**: Clone o repositório e configure o ambiente de desenvolvimento:
  - Verifique se o Maven está instalado no seu sistema.
  - Abra o projeto em sua IDE preferida (IntelliJ, Eclipse, etc.).

2. **📁 Compilação**: Para compilar o projeto, execute o seguinte comando no diretório raiz:
  ```bash
  mvn clean package
  ```

## 🧑‍💻 **Compilando e Executando o Projeto**

### 🐳 **Execução com Docker**

Para criar e iniciar o container Docker, execute:
```bash
docker-compose up --build
```

## 🔗 **Endpoints da API**

### **GET /api/sobre**

Retorna informações sobre o projeto.

**Exemplo de resposta:**
```json
{
  "projeto": "API de Teste",
  "estudante": "Michel Almeida da Rosa"
}
```

### **GET /api/post**

Retorna uma lista com informações de exemplo (pode ser usado como base para outros testes).

**Exemplo de resposta:**
```json
{
  "dados": ["Eu", "Como", "Banana"]
}
```

### **POST /api/post**

Recebe dados e retorna a mesma informação para validar o envio.

**Corpo da requisição (JSON):**
```json
{
  "dados": ["Rodrigo", "Faro"]
}
```

**Exemplo de resposta:**
```json
{
  "status": "sucesso",
  "dados": ["Rodrigo", "Faro"]
}
```

## ℹ️ **Observações**

Esta API foi desenvolvida por Michel Almeida da Rosa como parte de um projeto acadêmico para demonstrar a criação de uma API simples com Java, que lida com requisições GET e POST em formato JSON.
