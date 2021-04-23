Feature: teste 2

  Scenario Outline: Teste de Submissao
    Given que seja acessado o endpoint "topicos"
    Then for efetuado um post com os valores "<titulo>" e "<mensagem>"

    Examples: erros
      | titulo         | mensagem          |
      | Bug no Tablet  | erro no login     |
      | Teste  Dojo    | Dojo Bug          |
      | Teste  Teste   | Dojo Correto      |










