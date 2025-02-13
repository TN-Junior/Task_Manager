# Task Management API

## Descrição
Task Management API é uma aplicação backend desenvolvida em **Java** utilizando **Spring Boot**. O objetivo é fornecer uma API RESTful para gerenciamento de tarefas no estilo "TRELLO", com suporte a autenticação e conexão a um banco de dados relacional.

---

## Tecnologias Usadas
- **Java**
- **Spring**
- **Spring Data JPA**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Apache Kafka**
- **Hibernate**
- **Maven** 
- **Docker** 


---
# Apache Kafka - Testes Básicos
## Producer:
O producer envia mensagens para um tópico Kafka específico, simulando a criação de uma nova tarefa.

![KafkaProducer](https://github.com/user-attachments/assets/82862ee9-42e1-4e68-8b98-b429499f1710)

## Consumer:
O consumer consome mensagens do tópico e processa eventos, como notificações de criação de tarefas.
![KafkaConsumer](https://github.com/user-attachments/assets/b6a2c6df-b1c7-4b90-b112-14311d7a35c6)
