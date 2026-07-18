# Arquitectura de Microservicios - Sistema de Gestión

Este repositorio contiene el diseño e implementación de una arquitectura de microservicios desarrollada con **Spring Boot 3.4.4** y **Java 17/23**. La solución está dividida en componentes independientes encargados de resolver lógicas de negocio específicas, comunicándose de manera desacoplada.

## 📁 Estructura del Proyecto

El repositorio se organiza de la siguiente manera:

* **`ms-usuario/` (Puerto 8081):** Microservicio encargado de la gestión de usuarios, autenticación y control de accesos.
* **`ms-producto/` (Puerto 8082):** Microservicio responsable del catálogo de productos, control de stock y gestión de categorías.
* **`ms-pedidos/` (Puerto 8083):** Microservicio que administra el ciclo de vida de las órdenes de compra y solicitudes de los clientes.

---

## 🛠️ Tecnologías y Componentes Utilizados

* **Java 17+ / Spring Boot 3.4.4:** Framework principal para la creación de los microservicios RESTful.
* **Spring Data JPA / Hibernate:** Capa de abstracción para la persistencia de datos y mapeo objeto-relacional.
* **H2 Database (In-Memory):** Motor de base de datos SQL en memoria configurado de forma local para facilitar el despliegue rápido y pruebas ágiles en entornos de desarrollo.
* **Spring Security & JWT:** Implementación de seguridad perimetral. Los filtros de tokens han sido configurados para permitir una comunicación directa en fases de prueba locales.

---

## 🚀 Instrucciones de Despliegue Local

Cada microservicio es completamente autónomo y cuenta con su propio empaquetador Maven. Para levantar la arquitectura completa, sigue estos pasos:

### Pre-requisitos
* Java JDK 17 o superior instalado.
* Postman u otra herramienta para pruebas de endpoints.

### Ejecución de los Microservicios
Abre tres terminales independientes en tu sistema, navega a la carpeta de cada microservicio y ejecuta el wrapper de Maven correspondiente:

1.  **Levantar Servicio de Usuarios:**
    ```bash
    cd ms-usuario
    ./mvnw spring-boot:run
    ```
2.  **Levantar Servicio de Productos:**
    ```bash
    cd ms-producto
    ./mvnw spring-boot:run
    ```
3.  **Levantar Servicio de Pedidos:**
    ```bash
    cd ms-pedidos
    ./mvnw spring-boot:run
    ```

Una vez iniciados, las consolas de Spring Boot confirmarán la inicialización exitosa de Tomcat en los puertos `8081`, `8082` y `8083` respectivamente.
