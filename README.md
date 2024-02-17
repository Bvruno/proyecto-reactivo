# Proyecto Reactivo

Este proyecto es una aplicación Spring Boot que utiliza el paradigma de programación reactiva para crear un sistema de gestión de tiendas en línea. Utiliza una arquitectura basada en microservicios y una base de datos PostgreSQL con soporte para R2DBC.

## Descripción del Proyecto

El proyecto Reactivo es una aplicación demostrativa que implementa un sistema de gestión de tiendas en línea. Proporciona funcionalidades básicas para administrar usuarios, tiendas, productos, órdenes de compra y ofertas. La aplicación utiliza Spring Boot en su núcleo y está construida con el principio de programación reactiva para manejar operaciones asíncronas de manera eficiente.

## Tecnologías Utilizadas

- **Spring Boot**: Framework para el desarrollo de aplicaciones Java basado en Spring.
- **Spring WebFlux**: Framework de Spring para desarrollar aplicaciones web reactivas.
- **Spring Security**: Proporciona autenticación y control de acceso para la aplicación.
- **R2DBC**: Interfaz de base de datos reactiva para interactuar con PostgreSQL.
- **Project Lombok**: Biblioteca para reducir el código boilerplate en Java.
- **JSON Web Token (JWT)**: Utilizado para la autenticación basada en tokens.
- **PostgreSQL**: Sistema de gestión de bases de datos relacional utilizado como almacenamiento de datos.

- **Postman**: En el proyecto se incluye la configuracion de collection para su carga rapida.
- **Diagrama**: Se incluye el diagrama UML en PlantUML para ver las tablas.


## Estructura del Proyecto

El proyecto sigue una estructura de paquetes típica de una aplicación Spring Boot:

- `com.brunovarillas.proyecto_reactivo`: Paquete raíz del proyecto.
    - `controller`: Contiene controladores para manejar las solicitudes HTTP.
    - `entity`: Contiene las clases de entidades que representan los objetos de dominio.
    - `repository`: Contiene interfaces de repositorio para acceder a la base de datos.
    - `service`: Contiene la lógica de negocio de la aplicación.
    - `security`: Contiene configuraciones relacionadas con la seguridad de la aplicación.

## Configuración del Proyecto

El proyecto utiliza Apache Maven como sistema de gestión de proyectos y dependencias. A continuación se muestra el archivo `pom.xml` con las dependencias y configuraciones del proyecto:


# Descripción de Entidades

Este repositorio contiene las clases Java correspondientes a las entidades del sistema. Cada entidad representa un concepto clave dentro del sistema.

## Clases de Entidades

### UserEntity

- `userId`: Identificador único del usuario.
- `username`: Nombre de usuario.
- `email`: Correo electrónico del usuario.
- `password`: Contraseña del usuario.
- `role`: Rol del usuario.
- `status`: Estado del usuario.

### ShopEntity

- `shopId`: Identificador único de la tienda.
- `name`: Nombre de la tienda.
- `description`: Descripción de la tienda.
- `address`: Dirección de la tienda.
- `schedule`: Horario de la tienda.
- `status`: Estado de la tienda.

### PurchaseDetailEntity

- `purchaseDetailsId`: Identificador único del detalle de compra.
- `listOrderId`: Lista de IDs de órdenes asociadas.
- `quantity`: Cantidad de productos comprados.
- `price`: Precio total de la compra.
- `status`: Estado de la venta.
- `date`: Fecha de la compra.

### ProductEntity

- `productId`: Identificador único del producto.
- `name`: Nombre del producto.
- `description`: Descripción del producto.
- `urlImage`: URL de la imagen del producto.
- `shopId`: ID de la tienda a la que pertenece el producto.
- `status`: Estado del producto.

### OrderEntity

- `orderId`: Identificador único de la orden.
- `offerId`: ID de la oferta asociada (si aplica).
- `quantity`: Cantidad de productos en la orden.
- `total`: Total de la orden.
- `date`: Fecha de la orden.

### OfferEntity

- `offerId`: Identificador único de la oferta.
- `productId`: ID del producto asociado.
- `shopId`: ID de la tienda asociada.
- `stock`: Stock disponible de la oferta.
- `price`: Precio de la oferta.
- `status`: Estado de la oferta.
- `date`: Fecha de la oferta.
