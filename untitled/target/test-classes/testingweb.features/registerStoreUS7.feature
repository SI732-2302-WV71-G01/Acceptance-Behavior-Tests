Feature: La app permite registrar una tienda informática a un usuario experto

  Como usuario experto
  quiero registrar mi tienda de informática en la aplicación
  para obtener ventas en el medio virtual

  Background:
    Given El usuario ingresa a la webapp
    And Hace click al botón de Access
    When Rellena los todos los campos solicitados con datos existentes de cuenta de experto
    And Hace click en Sign In
    Then el usuario es redirigido a la página principal de la webapp

  #Happy path3
  Scenario: El usuario registra exitosamente nueva tienda en la webapp
    Given El usuario da click en Mis Tiendas
    And Le da click a Nueva Tienda
    When Rellena todos los campos solicitados para el registro de la nueva tienda
    And le da en Guardar Tienda
    Then la nueva tienda se encontrará registrada

  #Sad path
  Scenario: El usuario no completa todos los datos de registro de nueva tienda en la webapp
    Given El usuario da click en Mis Tiendas
    And Le da click a Nueva Tienda
    When No rellena todos los campos solicitados para el registro de la nueva tienda
    And le da en Guardar Tienda
    Then la app le notificará los campos faltantes

  #Alternative Path
  Scenario: El usuario completa todos los datos de registro de tienda pero se excede en el número de fotos de tienda subidas
    Given El usuario da click en Mis Tiendas
    And Le da click a Nueva Tienda
    When Rellena los campos solicitados para el registro de la nueva tienda
    But Se excede en el número de imágenes permitidas de la tienda
    And le da en Guardar Tienda
    Then La tienda no se registrará
    And la app le notificará el exceso de fotos