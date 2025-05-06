Feature: Shopping

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"
    * ingreso el usuario "standard_user" y password "secret_sauce"

  @regression
  Scenario: Como usuario existente quiero verificar la UI de la interfaz de shopping para que pueda realizar la compra
    Then verifico la UI de la interfaz de shopping

  @regression
  Scenario Outline:Como usuario existente quiero verificar la cantidad de elementos seleccionados desde PLP para que pueda realizar la compra
    When agrego todos los items al carrito de compra
    Then el checkout muestra <cantidad> elementos
    Examples:
      | cantidad |
      | 6        |

  Scenario Outline: Como usuario existente quiero agregar varios productos al carrito de compras para generar mi orden de compra
    When agrego todos los items al carrito de compra
    And completo el <firstName> , <lastName> , <zoneCode>
    And clic en finalizado
    Then se genera la orden de compra
    Examples:
      | firstName | lastName | zoneCode |
      | "Jenny"   | "Huaman" | "1500"   |