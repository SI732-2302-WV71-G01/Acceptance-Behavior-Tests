Feature: Añadir producto al carrito de compra de la aplicación

  Como usuario experto
  quiero añadir un producto en el carrito de compra de la aplicación
  para obtener un rastro de dicho producto y comprarlo próximamente

  Background:
    Given El usuario ingresa a la webapp
    And Hace click al botón de Access
    When Rellena los todos los campos solicitados con datos existentes de cuenta de experto
    And Hace click en Sign In
    And el usuario es redirigido a la página principal de la webapp

  #Happy Path
  Scenario: El usuario añade exitosamente un producto a su carrito de compras
    Given el usuario da click a Tiendas
    And le da click al perfil de una Tienda
    When le da click a añadir un producto de la tienda al carrito
    And le da click al carrito de compras
    Then el producto será añadido al carrito de compras

  #Sad Path
  Scenario: El usuario no logra añadir un producto fuera de stock al carrito de compras
    Given el usuario da click a Tiendas
    And le da click al perfil de una Tienda
    When le da click a añadir un producto fuera de stock de la tienda al carrito
    And le da click al carrito de compras
    Then el producto no será añadido al carrito de compras
    And la webapp le mostrará un mensaje notificando que el producto ya se encuentra fuera de stock

  #Alternative Path
  Scenario: El usuario no añade otra vez un producto que ya se encuentra en el carrito de compras
    Given el usuario da click a Tiendas
    And le da click al perfil de una Tienda
    And le da click a añadir un producto de la tienda al carrito

    When le de click a añadir al mismo producto nuevamente al carrito de compras nuevamente
    And le da click al carrito de compras
    Then la app no le permitirá el registro de dicho producto
    And la webapp le mostrará un mensaje notificando que el producto ya se encuentra en el carrito de compras

