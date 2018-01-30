# students-api

> A RESTful API to control a students register

## Installation

### Build
```console
$ mvn clean install
```

### Config
Create a database and configure a new datasource `java:jboss/datasources/alunos` in wildfly standalone

### Running
Copy .war generated to wildfly/standalone/deployments and start wildfly

## Usage

### GET /alunos/{id}
```console
$ curl -X GET http://localhost:8080/students-api/alunos/2
```
```json
{
	"id": 2,
	"cpf": 3123,
	"nome": "Joao",
	"idade": 45,
	"endereco": {
		"id": 1,
		"logradouro": "Rua Beira Rio",
		"numero": 111,
		"complemento": "N/A",
		"bairro": "Centro",
		"cep": "89000000",
		"cidade": "Joinville",
		"estado": "SC"
	}
}
```

### POST /alunos
```json
{
	"cpf": 2312,
	"nome": "Joao",
	"idade": 45,
	"endereco": {
		"id": 1,
		"logradouro": "Rua Beira Rio",
		"numero": 111,
		"complemento": "N/A",
		"bairro": "Centro",
		"cep": "89000000",
		"cidade": "Joinville",
		"estado": "SC"
	}
}
```

## License
The MIT License (MIT)