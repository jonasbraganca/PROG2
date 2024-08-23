# PROG2

# Q1 - Explique o conceito de encapsulamento e como ele está relacionado ao princípio de Information Hiding. Por que é importante utilizar esses conceitos em projetos de software?
O encapsulamento se trata da junção de métodos e dados em uma única classe, e ele permite controlar e esconder as informações privadas e mostre apenas as informações que devem ser mostradas publicamente, como o Information Hiding está relacionado a esconder as informações sensíveis que ao serem expostas podem causar risco os conceitos se relacionam intimamente.

# Q2 - Em Java, existem diferentes modificadores de visibilidade para atributos e métodos. Quais são esses modificadores, e qual o propósito de cada um deles? Dê exemplos de situações em que cada um deles seria mais adequado.
Os modificadores de visibilidade são: “private”, “public”, “protected”, e “default”. O “private”, relacionado a questão anterior é um método usado para restringir o acesso a informações , nesse caso somente aquela classe que está inserido terá acesso as informações, num exemplo prático seria as notas e índices acadêmicos de um colega de turma da faculdade no Sigaa. Já o “public” está relacionado a permitir que informações não sensíveis possam ser acessadas, não somente aquela restrita classe, em exemplo prático se trataria de acessar informações como o número de matrícula e nome de um colega de turma no Sigaa da Universidade. O “protected” está ligado a um acesso restrito a uma subclasse ou outras classes, nesse caso do sistema de informações da Universidade, seria o acesso pela secretaria da Universidade à detalhes mais específicos do aluno. E por fim o “default” se trata de quando não há a declaração de restrição de acesso de forma explícita, e não é acessível por classes de pacotes diferentes, somente do mesmo pacote, em exemplo seria o acesso a informações da própria pessoa (considerando que isso seria dentro de um mesmo pacote) sobre suas notas e índices acadêmicos, por exemplo.

# Q3 - O princípio da separação de responsabilidades (Separation of Concerns) é essencial em Orientação a Objetos. Explique esse princípio e discuta como ele pode ser aplicado ao projetar classes e métodos em um sistema Java.

# Q4 - Implemente uma classe Livro em Java com os seguintes atributos: titulo (título do livro), autor (nome do autor), e numeroPaginas (número de páginas). 
# ● Todos os atributos devem ser privados.
# ● A classe deve possuir construtores para inicializar os objetos e métodos para exibir as informações do livro (exibirDetalhes).
# ● Implemente também os métodos getters e setters necessários.

# Q5 - Com base na classe Livro criada na questão anterior, implemente uma classe Biblioteca que seja capaz de gerenciar múltiplos livros.
# ● A classe Biblioteca deve possuir um atributo privado que armazene uma lista de livros.
# ● Implemente métodos para adicionar novos livros, buscar um livro pelo título e exibir todos os livros disponíveis na biblioteca.
# ● Considere o uso adequado de construtores, encapsulamento e visibilidade.
