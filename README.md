# SPRINT BOOT MICROSERVICE USERS 

## JPA + Hibernate + H2

Se implementó PagingAndSortingRepository para generar el controlador y el repositorio de datos para User.
PagingAndSortingRepository implemente HATEOAS, es la abreviación de *Hypermedia as the Engine of Application State* (hipermedia como motor del estado de la aplicacion).


## USING ZUUL GATEWAY 

### POST
```
  http://localhost:8090/api/users/users
```


```json
{
    
    "username": "johnsnow",
    "password": "1234",
    "name": "John",
    "lastname": "Snow",
    "email": "snowjohn@google.com",
    "enabled": true,
    "roles": [
        { "idRole": 1 }
    ]
}
```

### CUSTOM METHOD RESTREPOSITORY:



### SEARCH
```
  http://localhost:8090/api/users/users/search/find-username?username=michaelx
```

```json
{
    "id": 2,
    "username": "michaelx",
    "password": "1234",
    "name": "Michael",
    "lastname": "Stark",
    "email": "michael@google.com",
    "roles": [
        {
            "idRole": 2,
            "name": "ROLE_ADMIN"
        },
        {
            "idRole": 1,
            "name": "ROLE_USER"
        }
    ],
    "_links": {
        "self": {
            "href": "http://localhost:38897/users/2"
        },
        "user": {
            "href": "http://localhost:38897/users/2"
        }
    }
}

```