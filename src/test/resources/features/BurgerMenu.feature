Feature: Burger Menu

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"
    * ingreso el usuario "standard_user" y password "secret_sauce"
    And ingreso al burger menu

  Scenario: Como usuario existente quiero verificar el botón About para ingresar a otras opciones del aplicativo
    Then verifico el botón About con url "https://saucelabs.com/"