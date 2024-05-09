@ParaBank
Feature: Registro de formulario

  @Login
  Scenario Outline: caso de prueba creacion de cuenta
    Given ingreso al sistema parabank "<IDTest>"
    When ingreso datos personales al formulario "<IDTest>"
    And ingreso datos cuenta al formulario "<IDTest>"
    And clic en el boton registrar
    Then Valida que se despliega el mensaje de éxito
    When ingreso la session con la cuenta creada "<IDTest>"
    Examples:
      | IDTest |
      | 1      |








