Feature: Revisar productos del carrito de compra de la aplicación
  Como usuario inexperto
  quiero revisar mis productos añadidos al carrito de compra de la aplicación
  para revisar los productos futuros a comprar

  Background:
    Given El usuario ingresa a la webapp

  #Happy Path
  Scenario: El usuario inexperto que ya inició sesión visualiza correctamente
  los productos añadidos a su carrito de compras
    Given Hace click al botón de Access
    And Rellena los todos los campos solicitados con datos existentes de cuenta de experto
    And Hace click en Sign In
    And el usuario es redirigido a la página principal de la webapp
    And el usuario da click a Tiendas
    And le da click al perfil de una Tienda
    When le da click a añadir un producto de la tienda al carrito
    And le da click al carrito de compras
    Then el producto será visualizado en el carrito de compras
  #Sad Path
  Scenario: El usuario inexperto añade productos de su tienda al carrito de compras antes de iniciar sesión
  y cuando inicia sesión, los productos de su tienda ya no se verán en el carrito de compras debido a que
  un usuario no puede comprar productos de sus mismas tiendas
    Given el usuario da click a Tiendas
    And le da click al perfil de una Tienda
    When le da click a añadir un producto de la tienda al carrito
    And le da a añadir a un producto de su tienda
    And luego le da click al carrito de compras
    Given Hace click al botón de Access
    And Rellena los todos los campos solicitados con datos existentes de cuenta de experto
    And Hace click en Sign In
    And el usuario es redirigido a la página principal de la webapp
    And le da click al carrito de compras
    Then el producto de su tienda no se verá en el carrito de compras

    #Alternative path
  Scenario:El usuario inexperto revisa el carrito de compras después de haber cerrado sesión
    Given Hace click al botón de Access
    And Rellena los todos los campos solicitados con datos existentes de cuenta de experto
    And Hace click en Sign In
    And el usuario es redirigido a la página principal de la webapp
    And el usuario da click a Tiendas
    And le da click al perfil de una Tienda
    When le da click a añadir un producto de la tienda al carrito
    And le da click al carrito de compras
    And Cierra sesión
    And después de cerrar sesión revisa el carrito nuevamente
    But ahora el carro estará vacío por idea de negocio
    But xd
