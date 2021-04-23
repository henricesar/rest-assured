Feature: teste 3

  Scenario Outline: Teste de Atualizacao
    Given que seja acessado o endpoint "topicos/1"
    Then for efetuado uma atualizacao com os valores "<titulo>" e "<mensagem>"

    Examples: erros
      | titulo         | mensagem           |
      | Bug na protese | erro na placa      |










