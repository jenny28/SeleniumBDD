Feature: Checkout Overview

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"
    * ingreso el usuario "standard_user" y password "secret_sauce"

  Scenario Outline:
    When ingreso a la interfaz checkout information
    And completo el <firstName> , <lastName> , <zoneCode>
    And clic en Continuar
    Then se verifica la UI de ckeckout overview
    Examples:
      | firstName | lastName | zoneCode |
      | "Jenny"   | "Huaman" | "1500"   |