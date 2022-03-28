# Objetivos
Com base no projeto "ObterDiploma", que se encontra totalmente implementado neste link:
https://drive.google.com/file/d/1xy0kbxdVaGJC48Monh9sGsXzYQgm7mij/view?usp=sharing,
devem ser realizadas validações para os dados de entrada (request) de forma a controlar os diferentes
cenários possíveis propostos em cada exercício.

# User Story
História do usuário narrada do ponto de vista da equipe administrativa da instituição de ensino. O serviço
(end-point) é exposto na instituição de ensino para ser consumido por qualquer pessoa autorizada que o
solicite.
✔ US-0001: Calcular a média de todas as notas obtidas por um aluno tendo em conta as
disciplinas estudadas. Desenvolva uma mensagem personalizada dependendo da média.

# Exercício
Deseja-se realizar as validações correspondentes no Histórico do Usuário apresentado. Para isso, leve em
consideração StudentDTO e SubjectDTO da resolução em anexo sem validações e a seguinte tabela de
validações e seus correspondentes comportamentos esperados:

Atributo Tipo Obrigatório? Validação Mensagem de erro
studentName String SIM

● Que o campo
não está vazio.
● Que comece
com letra
maiúscula.
● Comprimento
máximo de 50
caracteres.

● O nome do aluno não
pode ficar vazio.
● O nome do aluno deve
começar com letra
maiúscula.
● O comprimento do
nome não pode
exceder 50 caracteres.

subjects List<SubjectDTO> SIM ● Que a lista não
está vazia.

● A lista não pode estar
vazia.

name String SIM

● Que o campo
não está vazio.
● Que comece
com letra
maiúscula.
● Comprimento
máximo de 30
caracteres.

● O nome do assunto não
pode ficar vazio.
● O nome do assunto
deve começar com letra
maiúscula.
● O comprimento do
nome não pode
exceder 30 caracteres.

score Double SIM ● Que o campo
não está vazio.
● Mínimo 0.0
● Máximo 10.0

● A nota não pode estar
vazia.
● A nota mínima é 0,0.
● A nota máxima é 10,0.

Representação JSON
A carga útil necessária para prosseguir com a carga é definida, assim como a resposta (response) no
formato JSON.
