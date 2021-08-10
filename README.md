# Spring Boot | REST API


### Prints da aplicação

<img src="https://github.com/VictorHenrique-dev/colaboradores_backend/blob/main/screenshot/1.PNG">
<img src="https://github.com/VictorHenrique-dev/colaboradores_backend/blob/main/screenshot/2.PNG">

------------------------------------------------------------------------------------------------------------------

### Como configurar o ambiente:

- Faça clone do projeto;
- Importe o projeto para sua IDE de preferência, via pom (Maven).  

### Para fazer os testes dos casos de uso em funcionamento:

# LocadoraSpringBoot
Projeto Spring Boot para criação dos testes unitários e bug report

# Instruções para execução
Crie um banco de dados mysql com o nome de ```locadora```

Rotas:
``` 
localhost:8080/colaboradores
```
# API REST para teste

**GET** requisições para ```/colaboradores``` retorna uma lista de colaboradores em formato JSON

**GET** requisições para ```/colaboradores/1``` retorna o colaborador com o ID 1

**POST** requisições para ```/colaboradores``` com um objeto Usuario JSON cria um novo colaborador

**PUT** requisições para ```/colaboradores/1``` com um objeto Usuario JSON atualiza o colaborador com ID 1

**DELETE** requisições para ```/colaboradores/1``` deleta o colaborador com ID 1

**DELETE** requisições para ```colaboradores``` deleta todos os colaboradores

