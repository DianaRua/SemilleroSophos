Feature: Agregar producto al carro de compras
  Diana quiere agregar un producto al carro de compras en la pagina Oster

  @SmokeTest
  Scenario Outline: Buscar y agregar producto al carro de compras en pagina Oster
    Given Diana esta en la pagina de Oster
    When ella busca y agrega un producto al carro de compras
      | Producto   | Caracteristica   |
      | <producto> | <caracteristica> |
    Then ella verifica que el producto agregado este en el "<Resultado>" 

    Examples: 
      | producto  | caracteristica | Resultado |
      | Licuadora | Mezclador      | Mezclador |
