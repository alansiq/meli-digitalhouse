# Objetivos

O objetivo deste exercício prático é que possamos consolidar e aprofundar os conceitos de
programação orientada a objetos aplicados à Java. Para isso vamos propor uma série de
exercícios simples e incrementais (já que vamos trabalhar e adicionar lógica às classes que
temos que construir), que nos permitirão rever os tópicos que estudamos.


- [x] Exercício 1

Crie uma classe Pessoa que terá os seguintes atributos: nome, idade, ID (neste caso vamos
representá-la como uma string de caracteres), peso e altura. Que tipo de dado você atribuiria
às variáveis de instância? Como seria a estrutura básica da sua classe?


- [X] Exercício 2
Vamos criar diferentes construtores na classe Pessoa, um sem parâmetros, e o outro deve
receber nome, idade e ID como parâmetros; e por fim criaremos um terceiro construtor que
recebe como parâmetro todos os atributos da classe.

- [X] Exercício 3
Crie uma nova classe chamada Main, onde você irá chamar o método main como ensinamos
anteriormente. Isso nos permitirá executar o nosso programa.

- [X] Exercício 4
Na classe Main que acabamos de criar, dentro do método main() pedimos para você criar um
objeto do tipo Pessoa para cada construtor que definimos na classe, lembre-se de colocar um
nome significativo para as variáveis para atribuir cada objeto. A seguir, vamos criar outro
objeto do tipo Pessoa e vamos construí-lo passando apenas um valor para o nome e outro
para a idade no construtor. Isto é possivel? O que acontece se tentarmos fazer isso?


- [ ] Exercício 5
Na classe Pessoa vamos implementar os seguintes métodos: calcularIMC(), a fórmula para
calculá-lo é: peso/(altura^2) - (peso expresso em kg e altura em metros). Se este cálculo
retornar um valor menor que 20, a função deve retornar -1, se retornar um número entre 20 e
25, o método deve retornar 0, por fim, se retornar um número maior que 25 deve retornar 1.
Uma vez que o método anterior foi criado, vamos adicionar o método ehMaiorIdade() que
deve retornar um valor booleano, levando em consideração que a maioridade será
considerada, a partir de 18 anos. Por fim, adicione um método toString() que retornará todas
as informações da pessoa.
Lembre-se, você pode usar os métodos da classe java.lang.Math para calcular a potência.

- [ ] Exercício 6
A partir da classe Main vamos calcular o IMC da última pessoa que criamos (aquela que
criamos corretamente através do construtor que recebe todos os atributos como parâmetro).
Também descobriremos se a pessoa é maior de idade ou não; Observe que em ambos os
casos, dependendo dos resultados retornados pelos métodos, você deve imprimir uma
mensagem correspondente ao usuário. Finalmente, queremos mostrar todos os dados dessa
pessoa imprimindo essas informações pelo console. O formato em que você vai exibir os
dados e as mensagens fica a seu critério, mas deve ser legível e descritivo para quem vê a
saída do programa.

Referências:
* IMC   		--   	Nivel de peso
* < 20  		--   	Abaixo do peso
* > 20 & < 25		-- 	Saudável
* > 25  		-- 	Sobrepeso


