# Classes Abstratas e Interfaces

## Objetivo
O objetivo deste exercício é estudar detalhadamente o uso de classes abstratas e
interfaces.


## Exercício 1
Um banco possui diferentes tipos de transações que pode realizar, dentre elas estão:
Depósito, Transferência, Saque em Dinheiro, Consulta de Saldo, Pagamento de
Serviços. Todas as transações têm dois métodos em comum, que são transacaoOk() e
transacaoNaoOk().
Com base nisso, existem diferentes tipos de clientes que podem interagir com o
banco:
● Executivos: Fazem Depósitos e Transferências.
● Básico: Realizam consultas de saldo, pagamentos de serviços e saques em
dinheiro.
● Cobradores: Eles fazem saques em dinheiro e consultam saldos.

Implemente o cenário acima permitindo aos clientes mencionados acima, o acesso
aos diferentes métodos dependendo da operação que desejam realizar.

Nota:
● Não é necessário implementar cálculos ou funções matemáticas. Os métodos
podem ser implementações de mensagens usando System.out.println. Por
exemplo, ao fazer um depósito, a mensagem “Fazendo um depósito” aparece.
● Básico, Cobradores e Executivos podem ser tratados como classes.
● A transação pode ser tratada como uma Interface. Observe que existem
diferentes tipos de transações que implementarão essa interface principal.

## Exercício 2
Propõe-se desenvolver um programa que permita, através de uma interface, imprimir
diferentes tipos de documentos.

Os tipos de documentos são:
● Currículos: inclui uma pessoa com todos os seus atributos mais uma lista de
suas habilidades.
● Livros em PDF: Incluem atributos como número de páginas, nome do autor,
título e gênero.
● Relatórios: Incluem um texto de comprimento n, número de páginas, autor e
revisor.
Implemente este cenário onde cada um desses objetos é criado e que, por meio de
um método estático de uma interface, qualquer tipo de documento pode ser passado
e o conteúdo é impresso.

## Exercício 3
Solicita-se a criação de uma classe abstrata chamada Animal, da qual derivam 3
animais: Cachorro, Gato e Vaca. Os 3 animais são capazes de “emitir sons”, para isso
será necessário implementar um método que permita visualizar no console o som
que cada animal emite. Por exemplo, no caso do cachorro “Auau”, do gato “miau” e
da vaca “mu”.
A partir disso, levando em consideração os gostos alimentares de cada animal (gato e
cachorro são considerados carnívoros e a vaca herbívora), incluir as interfaces
necessárias para contemplar os métodos comerCarne ou comerPasto.
Feito isso, realize a criação de diferentes animais e a invocação de suas respectivas
implementações de métodos no exercicio1.Main.
Como proposta extra, sugere-se criar um método para comerAnimal onde, a partir da
passagem de um objeto de qualquer tipo de animal como parâmetro, chama o
método comer de acordo com o referido animal.