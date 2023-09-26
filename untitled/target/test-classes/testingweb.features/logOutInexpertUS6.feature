Feature: Cerrar sesión en la aplicación web

  Como usuario experto
  quiero cerrar sesión en la aplicación
  para hacer dejar de hacer uso de mi cuenta previamente registrada

  Background:
    Given El usuario ingresa a la webapp
    And Hace click al botón de Access
    When Rellena todos los campos solicitados con datos existentes de cuenta de inexperto
    And Hace click en Sign In
    Then el usuario es redirigido a la página principal de la webapp

  #Happy path
  Scenario: El usuario inexperto cierra sesión exitosamente
    Given Hace click al botón de Logout
    Then el usuario es redirigido a la página principal de la webapp

  #Sad path
  Scenario: El usuario inexperto no puede cerrar sesión debido a que no ha iniciado
  sesión todavía
    Given La aplicación se encuentra sin inciar sesión
    When El usuario no encuentra el botón de Log Out
    Then El usuario no puede deslogearse

   #Alternative path
  Scenario: El usuario inexperto se equivoca de botón y presiona Mis Compras

    Given El usuario hace click al botón de My Purchases
    Then Es dirigido a la página de My purchases
    But no es dirigido a la página principal