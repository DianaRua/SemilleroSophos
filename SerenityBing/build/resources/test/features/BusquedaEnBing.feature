Feature: Busqueda en bing
  Yo como usuaria quiero realizar una busqueda en bing
  @tag2
  Scenario Outline: Busqueda exitosa en bing
    Given Diana esta en el sitio bing
    When el busca la palabra "<palabra>" y "<palabrados>"
    Then el verifica que la palabra "<palabra>" este en los resultados

    Examples: 
      | palabra | palabraDos | resutadoEsperado |
      | switch  | datos      | switch           |
      | laptop  | datos      | laptop           |
      | camara  | palabra    | camara           |
