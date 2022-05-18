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

- [Repositório do Projeto Final](https://github.com/Paulo-Ultra/mjv-school-java/tree/main/MJV%20-%20Projeto%20Final)

  

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

### Diagrama de Classe
<p align="center">
    <img align="center" width="700" src="https://github.com/Paulo-Ultra/mjv-school-java/blob/main/MJV%20-%20Projeto%20Final/Diagrama%20de%20Classe.jpeg" style="max-width:100%;">
</p>

### Diagrama do Banco de Dados
<p align="center">
    <img align="center" width="700" src="https://github.com/Paulo-Ultra/mjv-school-java/blob/main/MJV%20-%20Projeto%20Final/Diagrama%20Banco%20de%20Dados.jpg" style="max-width:100%;">
</p>

## 🌐 Endpoints
📄  As urls interativas, construídas através do [Swagger](https://swagger.io/tools/swagger-ui/)

|*_Método_* | *_URL_*       | *Finalidade*       |   
|--------|------------|------------------|
| POST   |/cliente | Adiciona um novo cliente|
| GET    |/cliente | Lista todos os clientes|
| GET    |/cliente/{id} | Detalha um cliente pelo id|
| PUT    |/cliente | Atualiza o cliente|
| DELETE    |/cliente/{id} | Desativa o cliente pelo id|
|    | |  |
| *Método* | *URL*        | *Finalidade*       |
| POST   |/equipamento | Adiciona um novo equipamento|
| GET    |/equipamento | Lista todos os equipamentos|
| GET    |/equipamento/{id} | Detalha um equipamento pelo id|
| PUT    |/equipamento | Atualiza o equipamento|
| DELETE    |/equipamento/{id} | Desativa o equipamento pelo id|
|    | |  |
| *Método* | *URL*        | *Finalidade*       |
| POST   |/locacao_item | Adiciona um novo item nas locações|
| GET    |/locacao_item | Lista todos os itens das locações|
| GET    |/locacao_item/{id} | Detalha um item da locação pelo id|
| PUT    |/locacao_item | Atualiza o item da locação|
| DELETE    |/locacao_item/{id} | Desativa o item da locação pelo id|
|    | |  |
| *Método* | *URL*        | *Finalidade*       |
| POST   |/locacao | Adiciona uma nova locação|
| GET    |/locacao| Lista todos as locações|
| GET    |/locacao/{id} | Detalha uma locação pelo id|
| PUT    |/locacao | Atualiza a locação|
| DELETE    |/locacao/{id} | Desativa a locação pelo id|

##### Apresentação

1. Cadastro de cliente
2. Cadastro de equipamento
3. Cadastro de item da locação
4. Inclusão de locação

##### JSON Cadastros

* Cadastrando Cliente
``` shell 
{
  "id": 0,
  "cpf": "string",
  "nomeCompleto": "string",
  "telefone": "string",
  "endereco": {
    "id": 0,
    "rua": "string",
    "numero": "string",
    "bairro": "string",
    "cidade": "string",
    "estado": "string",
    "complemento": "string"
  }
}
```
* Cadastrando Equipamento
``` shell 
{
  "id": 0,
  "tipoEquipamento": "MTB",
  "fabricacao": "string",
  "marca": "string",
  "grupo": "string",
  "qtdDisponivel": 0,
  "valorLocacao": 0
}
```
* Cadastrando Itens da Locação
``` shell 
{
  "id": 0,
  "equipamentoId": 0,
  "qtdDiasLocacao": 0,
  "subtotal": 0
}
```
* Cadastrando a Locação
``` shell 
{
  "id": 0,
  "dataRetirada": "2022-05-18",
  "dataDevolucao": "2022-05-18",
  "clienteId": 0,
  "valorFinal": 0,
  "itens": [
    {
      "id": 0,
      "equipamentoId": 0,
      "qtdDiasLocacao": 0,
      "subtotal": 0
    }
  ]
}
```
