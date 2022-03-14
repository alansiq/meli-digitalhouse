# Objetivo

O objetivo deste exercício prático é que possamos consolidar e aprofundar os conceitos sobre encapsulamento, herança, sobrescrita e exceções. Para isso, vamos propor uma série de exercícios simples que nos permitirão rever os tópicos que estudamos.

## Exercício 1
- [X] Crie uma classe PraticaExcecoes e defina os atributos a = 0 e b = 300 do tipo int. Calcule a razão b/a. Controle a exceção lançada indicando a mensagem: "Ocorreu um erro". No final do programa deve sempre indicar a mensagem "Programa finalizado"
- [X] Modifique o programa acima para que, quando ocorrer o erro, em vez de
  imprimir a mensagem “Ocorreu um erro” no console, ele a lance como uma
  exceção IllegalArgumentException com a mensagem “Não pode ser dividido
  por zero”.
  
## Exercício 2
Temos que entregar um trabalho para um distribuidor de produtos, então vamos gerar
um programa que faça diferentes operações. Teremos duas categorias de produtos
diferentes: Perecíveis e Não Perecíveis.

- [X] Crie uma classe Produto que possua os seguintes atributos: String nome e
  double preco, ela deve definir os métodos getters e setters para seus
  atributos, um construtor que recebe todos os seus atributos como parâmetro e
  o método toString(). Crie o método calcular() para o qual vamos passar um
  parâmetro do tipo int chamado quantidadeDeProdutos; este método tem que
  multiplicar o preço pela quantidade de produtos passados.
  
- [X] Crie a classe Pereciveis, que terá um atributo chamado diasParaVencer do tipo
  int, igual a classe produto, defina setters, getters, um construtor que recebe
  todos os atributos por parâmetro e o método toString(). Essa classe deve
  herdar da classe Produto e sobrescrever o método calcular(), que deve fazer o
  mesmo que a classe Produto (multiplicar o preço pelo número de produtos) e,
  adicionalmente, reduzir o preço de acordo com o diasParaVencer:
    * Se faltar um (1) dia para expirar, o preço final será reduzido em 4 vezes.
    * Se faltarem dois (2) dias para expirar, o preço final será reduzido em 3
      vezes.
    * Se faltarem 3 dias (3) para expirar, metade do seu preço final será
      reduzido.
      
- [X] Crie a classe NaoPereciveis, ela terá um atributo chamado tipo que será uma
String. Crie os setters, getters, construtor e método toString(); nesta classe o
método calcular() fará exatamente o mesmo que na classe Produto.
  
- [X] Crie uma classe executável chamada Distribuidora onde você vai criar um
  array de produtos, imprimir o preço total ao vender 5 produtos de cada tipo.
  Crie os elementos do array com os dados que você desejar.