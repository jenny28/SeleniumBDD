Feature: Checkout information

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"
    * ingreso el usuario "standard_user" y password "secret_sauce"

  Scenario:
    When ingreso a la interfaz checkout information
    Then se verifica la UI de ckeckout information
