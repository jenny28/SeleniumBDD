Feature: Login del sistema

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"


  Scenario: Como usuario existente quiero visualizar la interfaz de login para ingresar mis credenciales
    Then el sistema muestra la interfaz de login
    And el sistema muestra la url "https://www.saucedemo.com/"


  Scenario Outline: Como usuario existente quiero ingresar credenciales válidas para acceder satisfactoriamente al sistema
    When ingreso el usuario <username> y password <password>
    Then se verifica el ingreso al sistema
    Examples:
      | username        | password       |
      | "standard_user" | "secret_sauce" |

  @regression
  Scenario Outline: Como usuario no existente quiero que se valide las credenciales para que no pueda ingresar al sistema
    When ingreso el usuario <username> y password <password>
    Then el sistema muestra mensaje de error <message>
    Examples:
      | username          | password       | message                                                                     |
      | "locked_out_user" | "secret_sauce" | "Epic sadface: Sorry, this user has been locked out."                       |
      | "1"               | "1"            | "Epic sadface: Username and password do not match any user in this service" |