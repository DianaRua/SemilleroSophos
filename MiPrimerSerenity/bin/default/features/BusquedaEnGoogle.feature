

Feature: Buscar en Google con datos desde la feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario
    Given Diana esta en el sitio google
    When el busca la palabra "<palabra>" y "<palabrados>"
    Then el verifica que la palabra "<palabra>" este en los resultados

    Examples: 
      | palabra | palabrados | resutadoEsperado |
      | switch  | datos      | switch           |
      | sophos  | empresa    | sophos           |
      | camara  | palabra    | sjdgf            |
