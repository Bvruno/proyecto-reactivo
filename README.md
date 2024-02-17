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
