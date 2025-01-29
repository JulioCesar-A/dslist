# DSList - Gerenciador de games

## 📝 Sobre o projeto

O DSList é um projeto que foi desenvolvido no **Intensivão Java Spring**. Ele consiste em uma API REST com a finalidade de gerenciar listas de games

---

## 🛠️ Tecnologias Usadas:

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## Funcionalidades Atuais

1. Consulta de games.

2. Listagem de games organizados por categorias.

3. Consulta personalizada com Projections.

---
## Estrutura do projeto

```plaintext
📂 dslist
├── 📂 .mvn/
├── 📂 src/
|   ├── 📂 main/
|   |    ├── 📂 java/
|   |    |    └── 📂 com/
|   |    |         └── 📂 devsuperior/
|   |    |              └── 📂 dslist/
|   |    |                   ├── 📂 controllers/
|   |    |                   ├── 📂 dto/ 
|   |    |                   ├── 📂 entities/
|   |    |                   ├── 📂 projections/
|   |    |                   ├── 📂 repositories/
|   |    |                   ├── 📂 services/
|   |    |                   └── ☕ DslistApplication.java
|   |    └── 📂 resources/
|   |         ├── 📂 static/
|   |         ├── 📂 templates/
|   |         ├── ⚙️ application-dev.properties
|   |         ├── ⚙️ application-prod.properties
|   |         ├── ⚙️ application-test.properties
|   |         ├── ⚙️ application.properties
|   |         └── 🗃️ import.sql 
|   └── 📂 test/
├── 🗃️ create.sql
├── 🪶 pom.xml
├── 📚 README.md
└── ⚙️ system.properties
```
---
