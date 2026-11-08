# JCCact1_t4

Instituto Tecnológico de Oaxaca
Materia: Programación Web
Alumno: Jesús Cortés Cruz

## Descripción

Proyecto de Spring Boot que expone una API REST sencilla con dos controladores y cuatro endpoints. Fue probado en local y desplegado en una máquina virtual de Azure.

## Tecnologías

- Java 21
- Spring Boot
- Maven
- Nginx 

## Estructura

- EjemploController: devuelve la lista de materias y un objeto con información del servidor.
- EjemploRestController: devuelve el nombre del proyecto y un objeto con detalles del autor.
- Materia: modelo con id, nombre y créditos.

## Endpoints

Todos usan el método GET y la ruta base /api.

- /api/materias: lista de materias en formato JSON.
- /api/detalles_info: información del servidor en JSON.
- /api/nombre: texto con el nombre del proyecto y del autor.
- /api/detalles_info2: detalles del autor en JSON.

## Cómo generar el jar

    ./mvnw clean package -DskipTests

El archivo queda en la carpeta target.

## Despliegue

La aplicación corre en una máquina virtual de Azure como servicio de systemd, con Java 21. El puerto usado es el 8080, que se abrió en el grupo de seguridad de red de Azure.

Enlace del proyecto en el servidor:

    http://20.119.81.138:8081/api/materias

    ## Pruebas en localhost

Se ejecutó el proyecto en la máquina local con el comando:

    .\mvnw.cmd spring-boot:run

Y se probaron los endpoints desde el navegador.

Endpoint /api/materias

![Prueba en localhost de /api/materias](imagenes/imagen1.png)

Endpoint /api/nombre

![Prueba en localhost de /api/nombre](imagenes/imagen2.png)

Endpoint /api/detalles_info

![Prueba en localhost de /api/detalles_info](imagenes/imagen4.png)

Endpoint /api/detalles_info2

![Prueba en localhost de /api/detalles_info2](imagenes/imagen3.png)

## Alumno

Jesús Cortés Cruz
Instituto Tecnológico de Oaxaca
Programación Web