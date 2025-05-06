Feature: Carrito de compra

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"
    * ingreso el usuario "standard_user" y password "secret_sauce"

  Scenario: Como usuario existente quiero verificar la UI para que pueda agregar ver los productos al carrito
    When ingreso a la interfaz carrito de compra
    Then se muestra la UI carrito de compra


