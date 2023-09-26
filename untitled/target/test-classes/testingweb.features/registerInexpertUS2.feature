Feature: El app permite registrar a un usuario inexperto

  Como usuario inexperto
  deseo registrarme en la aplicación
  para conocer más sobre la informática y comprar con más orientación

  Background:
    Given El usuario ingresa a la webapp

  #Happy path
  Scenario: El usuario inexperto se registra exitosamente
    Given Hace click al botón de Access
    And Hace click en el botón Sign Up
    When Rellena todos los campos solicitados de registro válidamente
    And Selecciona el rol de Inexperto
    And Hace click en Sign Up
    Then la app registra al usuario en la aplicación

  #Sad path
  Scenario: El usuario inexperto no se registra por no rellenar todos los campos de registro solicitados
  solicitados de registro
    Given Hace click al botón de Access
    And Hace click en el botón Sign Up
    When No Rellena todos los campos solicitados de registro
    And Selecciona el rol de Inexperto
    And Hace click en Sign Up
    Then la app le alerta los campos faltantes de registro

   #Alternative path
  Scenario: El usuario inexperto no se puede registrar porque el nombre de usuario ya existe
    Given Hace click al botón de Access
    And Hace click en el botón Sign Up
    When Rellena los campos de registro con un nombre de usuario inexperto ya existente
    And Selecciona el rol de Inexperto
    And Hace click en Sign Up
    Then la app le alerta la app le notificará que el username ya existe