Feature: El app permite iniciar sesión de un usuario existente


  Yo Como usuario inexperto deseo iniciar sesión en la aplicación
  para hacer uso de mi cuenta previamente registrada

  Background:
    Given El usuario ingresa a la webapp

  #Happy path
  Scenario: El usuario inexperto inicia sesión exitosamente
    Given Hace click al botón de Access
    When Rellena todos los campos solicitados con datos existentes de cuenta de inexperto
    And Hace click en Sign In
    Then el usuario es redirigido a la página principal de la webapp

  #Sad Path
  Scenario: El usuario inexperto no completa todos los campos solicitados en el inicio de sesión
    Given Hace click al botón de Access
    When No rellena todos los campos solicitados con datos existentes de cuenta de inexperto
    And Hace click en Sign In
    Then la webapp le mostrará una alerta en cada campo faltantes

  #Alternative Path
  Scenario: El usuario inexperto completa el formulario de inicio de sesión con información inválida
    Given Hace click al botón de Access
    When Rellena los campos con información inválida
    And Hace click en Sign In
    Then la web app le mostrará un mensaje de alerta notificando que el usuario es inválido
