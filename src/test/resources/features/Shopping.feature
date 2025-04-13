Feature: Shopping

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"
    * ingreso el usuario "standard_user" y password "secret_sauce"

  Scenario: Como usuario existente quiero verificar la UI de la interfaz de shopping para que pueda realizar la compra
    Then verifico la UI de la interfaz de shopping

  Scenario:Como usuario existente quiero verificar la cantidad de elementos seleccionados desde PLP para que pueda realizar la compra
    When agrego todos los items al carrito de compra
    Then el checkout muestra 6 elementos