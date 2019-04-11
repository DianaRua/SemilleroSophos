Feature: Search in google with data from feature
  Diana quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given Diana esta en el sitio de google
    When el busca la frase compuesta
      | cadenaUno | cadenaDos    |
      | <palabra> | <palabrados> |
    Then el verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra | palabrados | resultadoEsperado |
      | switch  | uno        | switch uno        |
      | sophos  | dos        | sophos dos        |
      | hola    | tres       | hola tres         |
