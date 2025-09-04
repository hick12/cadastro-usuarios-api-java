# API de Gerenciamento de Usuários

Este é um projeto de API REST desenvolvido com Spring Boot para gerenciamento de usuários.

## 💻 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 🔧 Configuração do Projeto

### Pré-requisitos

- JDK 17 ou superior
- Maven
- MySQL

### Configuração do Banco de Dados

O projeto utiliza MySQL como banco de dados. As configurações de conexão podem ser encontradas em `src/main/resources/application.properties`.

### Estrutura do Banco de Dados

A aplicação utiliza uma tabela de usuários com os seguintes campos:
- id (Integer, Primary Key)
- nome (String)
- email (String)
- senha (String)
- telefone (String)

## 🚀 Como Executar

1. Clone o repositório
```bash
git clone [URL_DO_SEU_REPOSITORIO]
```

2. Entre no diretório do projeto
```bash
cd projeto
```

3. Execute o projeto com Maven
```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`

## 📌 Endpoints

### Usuários

- GET `/usuarios` - Lista todos os usuários

## 🛠️ Estrutura do Projeto

```
projeto/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/
│   │   │       └── com/
│   │   │           └── criandoapi/
│   │   │               └── projeto/
│   │   │                   ├── controller/
│   │   │                   ├── DAO/
│   │   │                   └── model/
│   │   └── resources/
│   └── test/
└── pom.xml
```



---

⌨️ com ❤️ por [Henrique Palorca]
