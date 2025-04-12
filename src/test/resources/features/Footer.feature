Feature: Footer de la página

  Background:
    Given que ingreso a la página "https://www.saucedemo.com/"
    When ingreso el usuario "standard_user" y password "secret_sauce"

  Scenario: Como usuario existente quiero visualizar en el footer FB,TW y LK para tener acceso a estar redes sociales
    Then se verifica la red de facebook "https://www.facebook.com/saucelabs" , de twitter "https://twitter.com/saucelabs" y de linkedln "https://www.linkedin.com/company/sauce-labs/" en el footer