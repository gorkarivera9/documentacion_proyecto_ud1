# Gestor de incidencias
## Descripción del proyecto

Gestor de incidencias es uiuna app desarrollada en Java que permiute consultar las incidencias de un centro educativo.
La app se ejecuta desde la consola t permite utilizar un menú interactivo o introducir comandos directamente

## Funcionalidades
La app nos permite realizar las sigujientes operaciones:
-Mostrar todas las incidencias registradas
-Mostrar unicamente las incidencias abiertas
-Buscar incidencias por identificador o titulo
-Consultar una incidencia mediante su id
-Mostrar la ayuda de la app

## Requisitos
Para utilizar el proyecto necesitamos:
-Java 17 o superior
-Maven 
-Un terminal para ejecutar los comandos

## Estructura del proyecto
gestor-incidencias/
|--src/main/java/es/centro/incidencias/
|   |--App.java
|   |--GestorIncidencias.java
|   |--Incidencia.java
|   |--IncidenciaNoEncontradaException.java
|
|--docs/
|   |--apidocs/
|        |--index.html
|--pom.xml
|--mvnw
|--mvnw.cmd
|--README.md

## Compilación y ejecución
Para ejecutar el proyecto abrimos la terminal en la carpeta donde se encuentra el archivo pom.xml y ejecutamos
```bash
.\mvnw.cmd clean compile
```
Para ejecutar la app
```bash
.\mvnw.cmd exec:java
```
## Clases principales
App --> Inicia la app y gestiona el menu y los comandos.
GestorIcidencias --> Gestiona las incidencias y permite listarlas y buscarlas.
Incidencia --> Representa una incidencia con su id, título, prioridad y estado.
IncidenciaNoEncontradaException --> Excepcion que se produce cuando no se encuentra una incidencia por su id

## Generar Javadoc
El proyecto incuye comentarios java doc para explicar las clases constructores y metodos publicos
Debemos ejecutar para generar la documentacion
```bash
.\mvnw.cmd clean javadoc:javadoc
```
se generará la documentacion en docs/apidocs/

## Documentación publicada en GitHub Pages
La documentacion java doc estrara disponible en 
[Ver documentación Javadoc](https://gorkarivera9.github.io/documentacion_proyecto_ud1/proyecto-base-maven-gestor-incidencias/docs/apidocs/index.html)

## Autor
Gorka

## Versión
1.0.0