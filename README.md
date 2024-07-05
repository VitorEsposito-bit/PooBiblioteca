# POO_biblioteca

Este programa em Java simula uma biblioteca virtual onde o usuário pode cadastrar, buscar e excluir livros usando arrays.

## Estrutura do Projeto
O projeto é composto por três classes principais:

## 1. ArrayDeLivros.java
Esta classe representa a biblioteca e contém métodos para gerenciar livros.

Atributos:

ArrayDeLivros: Array de objetos da classe Livro.
proximoIndice: Controla o próximo índice disponível no array.
nome: Nome da biblioteca.

Métodos:

ArrayDeLivros(int tamanho, String nome): Construtor para inicializar a biblioteca com um tamanho específico.
boolean cadastraLivros(Livro livro1): Cadastra um novo livro no array, evitando duplicações.
Livro buscaLivroCodigo(int codigo): Busca um livro pelo seu código.
Livro buscaPorTitulo(String titulo): Busca um livro pelo título.
boolean excluiLivro(int codigo): Exclui um livro pelo seu código.
String toString(): Retorna uma representação em string da biblioteca.

## 2. Livro.java
Esta classe representa um livro com suas informações básicas.

Atributos:

codigo: Código único do livro.
titulo: Título do livro.
ano: Ano de publicação do livro.
autores: Array de strings contendo os nomes dos autores.

Métodos:

Métodos getters e setters para todos os atributos.
String toString(): Retorna uma representação em string das informações do livro.

## 3. AppBiblioteca.java
Esta é a classe principal que contém o método main para executar o programa interativamente.

Funcionalidades:

Cadastro de livros.
Busca de livros por código ou título.
Exclusão de livros.
Listagem de todos os livros cadastrados na biblioteca.

Menu:

Um menu interativo oferece opções para realizar as operações mencionadas acima.
