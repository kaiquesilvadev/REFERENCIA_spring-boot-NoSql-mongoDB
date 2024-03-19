# Workshop Spring Boot MongoDB DevSuperior

Este é o material de apoio que o DevSuperior disponibiliza para os alunos como referência para o projeto.

### Modelo conceitual

https://docs.google.com/document/d/1CCWaBMSpMtQtJSLDAukO5GhBwZgm2MY3pify79Gl_MU/edit?usp=sharing

### Container Docker do MongoDB para desenvolvimento

```
docker run -d -p 27017:27017 -v /data/db --name mongo1 mongo:4.4.3-bionic
```

```
docker exec -it mongo1 bash
```

### Postman collection

(baixe o arquivo DSPosts.postman_collection.json que está aqui na pasta do projeto, e importe-o no seu Postman)

Consulta detalhada

```json
{ 
	$and: [ 
		{ 
			moment: {
				$gte: ?1
			} 
		}, 
		{ 	
			moment: { 
				$lte: ?2} 
		} , 
		{ 	
			$or: [ 
				{ 
					'title': { 
						$regex: ?0, 
						$options: 'i' 
					} 
				}, 
				{ 
					'body': { 
						$regex: ?0, 
						$options: 'i' 
					} 
				}, 
				{ 
					'comments.text': { 
						$regex: ?0, $options: 'i' 
					} 
				} 
			] 
		} 
	] 
}
```

## Recursos adicionais

### Documentação MongoDB: query operators

https://docs.mongodb.com/manual/reference/operator/query

### Documentação Spring Data MongoDB

https://docs.spring.io/spring-data/mongodb/docs/current/reference/html

### Localização dos volumes Docker no Windows

https://stackoverflow.com/questions/43181654/locating-data-volumes-in-docker-desktop-windows
