## Projeto final

### Obrigatoriedades:
Apresentar a API sua aplicação devidamente documentada para uma demonstração de uma jornada de consumo dos recursos pertinentes a proposta do teu projeto.

### Orientações: 
Detalhar no README do projeto modelo de consumo de endpoint para facilitar a utilização da API:

### Forma de entrega: 

Disponibilizar o link do github do projeto bem descrito quanto às funcionalidades, implementações relevantes, participação dos membros da equipe, READEME com a jornada na plataforma e a API Rest documentada pelo Swagger em um ambiente Azure, Heroku ou OnPromisse.

### Critérios de Aceite - Expectativa da Entrega: 

1.	Apresentar a estrutura do projeto no github ou na IDE;

2.	Apresentar a API da plataforma devidamente documentada e preferencialmente no Heroku;

3.	Realizar uma demonstração de uma jornada de consumo dos recursos para conforme requisitados;

4.	Requisitos Técnicos: Implementação aplicando as boas práticas de programação, uso de:
	**ORM-JPA, Framework de persistência,  integridade do banco de dados e segurança na API(+).** 
 
## ⚙️ LocaBike - Projeto Final / Repositório 

- [Repositório do Projeto](https://github.com/BrunoAMieli/mjv-projetoFinal)

  

## ⚙️ Alunos participantes / Github

- [Bruno Alessandro](https://github.com/BrunoAMieli)

- [Fábio Ericeira](https://github.com/FabioEriceira)

- [Gabriel Cruz](https://github.com/ProbBC)

- [Paulo Ricardo](https://github.com/Paulo-Ultra)

- [Renato Gonçalves](https://github.com/Renato-RJ)


## ⚙️ Dependências 

* [JDK 11: Para executar o Projeto](https://www.oracle.com/java/technologies/downloads/#java11)

* [Maven 3.8.3: Para executar build do Projeto](https://maven.apache.org/download.cgi)

## ⚙️ Executando o projeto
``` shell 
# CHECANDO A VERSÃO DO JAVA
java -version

# CHECANDO A VERSÃO DO MVN
mvn -v

# INICIANDO O PROJETO
mvn spring-boot:run

# BUILD O PROJETO
mvn clean install
```

## 🌐 Diagramas



## 🌐 Endpoints
📄  As urls interativas, construídas através do [Swagger](https://swagger.io/tools/swagger-ui/)

| Método | URL        | Finalidade       |   
|--------|------------|------------------|
| POST   |/clients | Adiciona um novo cliente|
| GET    |/clients  | Lista todos os clientes|
| GET    |/clients/{id} | Detalha um cliente pelo id|
| PUT    |/clients/{id} | Atualiza o cliente pelo id|
| DELETE    |/clients/{id}/delete | Desativa o cliente pelo id|

