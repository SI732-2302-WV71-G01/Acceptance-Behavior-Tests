Feature: Registrar producto en tienda informática de la aplicación

  Como usuario experto
  quiero registrar un producto en mi tienda de informática de la aplicación
  para obtener ventas de dicho producto en el medio virtual

  Background:
    Given El usuario ingresa a la webapp
    And Hace click al botón de Access
    When Rellena los todos los campos solicitados con datos existentes de cuenta de experto
    And Hace click en Sign In
    And el usuario es redirigido a la página principal de la webapp
    And El usuario da click en Mis Tiendas

  #Happy path
  Scenario: El usuario registra su producto en su tienda exitosamente
    Given el usuario da click en el perfil de una de sus tiendas
    When le de click a Nuevo Producto
    And Rellene todos los campos de registro de producto solicitados
    And le de click en Guardar Producto
    Then el producto se registrará en su tienda exitosamente

  #Sad Path
  Scenario: El usuario no completa todos los campos solicitados de registro de un nuevo producto
    Given el usuario da click en el perfil de una de sus tiendas
    When le de click a Nuevo Producto
    And No rellena todos los campos de registro de producto solicitados
    And le de click en Guardar Producto
    Then la app le notificará los campos faltantes
    And el producto no se registrará en su tienda exitosamente

  #Alternative Path
  Scenario: El usuario completa todos los campos pero se excede en el número de fotos del producto
    Given el usuario da click en el perfil de una de sus tiendas
    When le de click a Nuevo Producto
    And Rellena los campos de registro de producto solicitados
    But se excede en el máximo de número de fotos del producto
    And le de click en Guardar Producto
    Then la app le notificará el exceso de fotos
    And el producto no se registrará en su tienda exitosamente
