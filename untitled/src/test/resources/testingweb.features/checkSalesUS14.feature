Feature: Revisar el historial de ventas de una tienda de un usuario

  Background:
    Given El usuario ingresa a la webapp
    Given Hace click al botón de Access
    When Rellena los todos los campos solicitados con datos existentes de cuenta de experto
    And Hace click en Sign In
    Then el usuario es redirigido a la página principal de la webapp
  #Happy Path
  Scenario: El usuario experto visualiza ventas en una de sus tiendas
    Given El usuario da click en Mis Tiendas
    And el usuario va a una de sus tiendas con ventas
    When le da click en Ventas de la tienda
    Then la aplicación le mostrará las ventas de dicha tienda satifactoriamente

  #Sad Path
  Scenario: El usuario experto no visualiza ventas en una de sus tiendas
    Given El usuario da click en Mis Tiendas
    And el usuario va a una de sus tiendas sin ventas
    When le da click en Ventas de la tienda
    Then la aplicación le notificará que la tienda no tiene ventas aún

  #Alternative Path
  #Scenario: