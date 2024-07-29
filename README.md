# Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway - DIO

## 💻 Sobre o projeto

Usei como base para criar a API REST em Java o [Dindin](https://github.com/GessycaBorges/api-dindin), uma API criada em JavaScript durante um curso que realizei.

---
## ⚙️ Diagrama de Classes

```mermaid
classDiagram
    class Transaction {
        +int id
        +int userId
        +int type
        +int category
        +float amount
        +String date
        +String observation
    }

    class User {
        +int userId
        +String name
        +String email
        +String password
    }

    class Category {
        +int id
        +String description
    }

    class Type {
        +int id
        +String description
    }

    Transaction "0..*" -- "1" User : registers
    Transaction "0..*" -- "1" Category : classifies
    Transaction "0..*" -- "1" Type : categorizes

```
