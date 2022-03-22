# Exercício Personagens de Star Wars

Uma API precisa ser desenvolvida para pesquisar por nome ou parte do nome dos
personagens de Star Wars. Ele receberá uma palavra para pesquisar e retornará uma lista
de caracteres que contêm essa palavra em seu nome.

Exemplo:
● Se buscarmos por "Luke" -> nos mostrará o personagem de "Luke Skywalker"
● Se buscarmos por "Darth" -> nos mostrará o personagem de "Darth Vader" e "Darth
Maul".

Teremos uma única entidade chamada Personagem, com os seguintes atributos:
● name
● height
● mass
● hairColor
● skinColor
● eyeColor
● birthYear
● gender
● homeworld
● species

Todos os atributos serão do tipo String, exceto height e mass que serão do tipo inteiro.

Do personagem, você deseja ver todos os atributos, exceto hairColor, skinColor, eyeColor
e birthYear.

Nota: Nenhuma conexão de banco de dados será usada no momento, então usaremos este
arquivo starwars.json como banco de dados. Tente aplicar a arquitetura multicamada
onde for possível.
