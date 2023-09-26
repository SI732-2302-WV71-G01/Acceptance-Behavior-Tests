Feature: Un usuario inexperto compra un producto de una tienda

  Como usuario inexperto
  quiero comprar un producto de una tienda de informática
  para gozar de la utilidad de dicho producto

  Background:
    Given Hace click al botón de Access
    When Rellena todos los campos solicitados con datos existentes de cuenta de inexperto
    And Hace click en Sign In
    Then el usuario es redirigido a la página principal de la webapp

  Scenario: El usuario compra un producto exitosamente
    Given el usuario ingresa a la tienda D uno
    When añade un producto a su carrito
    And se dirige al carrito de compras
    And Selecciona comprar
    And Rellena todos los campos de compra solicitados
    And le da click en comprar
    And la da click a Mis Compras
    Then el producto habra sido agregado a Mis Compras