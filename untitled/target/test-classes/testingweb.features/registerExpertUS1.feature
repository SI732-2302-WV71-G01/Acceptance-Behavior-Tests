Feature: El app permite registrar a un usuario experto

  Yo Como usuario experto
  deseo registrarme en la aplicación
  para obtener ventas y clientes en el medio virtual

  Background:
    Given El usuario ingresa a la webapp

  #Happy path
  Scenario: El usuario experto se registra exitosamente
    Given Hace click al botón de Access
    And Hace click en el botón Sign Up
    When Rellena todos los campos solicitados de registro válidamente
    And Selecciona el rol de Experto
    And Hace click en Sign Up
    Then la app registra al usuario en la aplicación

  #Sad path
  Scenario: El usuario experto no se registra por no rellenar todos los campos de registro solicitados
    solicitados de registro
    Given Hace click al botón de Access
    And Hace click en el botón Sign Up
    When No Rellena todos los campos solicitados de registro
    And Selecciona el rol de Experto
    And Hace click en Sign Up
    Then la app le alerta los campos faltantes de registro

   #Alternative path
  Scenario: El usuario experto no se puede registrar porque el nombre de usuario ya existe
    Given Hace click al botón de Access
    And Hace click en el botón Sign Up
    When Rellena los campos de registro con un nombre de usuario experto ya existente
    And Selecciona el rol de Experto
    And Hace click en Sign Up
    Then la app le alerta la app le notificará que el username ya existe