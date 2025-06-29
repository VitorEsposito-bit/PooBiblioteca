# OOP_Library

This Java program simulates a virtual library where the user can register, search, and delete books using arrays.

## Project Structure
The project consists of three main classes:

## 1. ArrayDeLivros.java
This class represents the library and contains methods to manage books.

**Attributes:**

- `ArrayDeLivros`: Array of objects from the Livro class.
- `proximoIndice`: Controls the next available index in the array.
- `nome`: Name of the library.

**Methods:**

- `ArrayDeLivros(int tamanho, String nome)`: Constructor to initialize the library with a specific size.
- `boolean cadastraLivros(Livro livro1)`: Registers a new book in the array, avoiding duplications.
- `Livro buscaLivroCodigo(int codigo)`: Searches for a book by its code.
- `Livro buscaPorTitulo(String titulo)`: Searches for a book by title.
- `boolean excluiLivro(int codigo)`: Deletes a book by its code.
- `String toString()`: Returns a string representation of the library.

## 2. Livro.java
This class represents a book with its basic information.

**Attributes:**

- `codigo`: Unique code of the book.
- `titulo`: Title of the book.
- `ano`: Publication year of the book.
- `autores`: Array of strings containing the authors' names.

**Methods:**

- Getter and setter methods for all attributes.
- `String toString()`: Returns a string representation of the book's information.

## 3. AppBiblioteca.java
This is the main class that contains the main method to run the program interactively.

**Features:**

- Book registration.
- Book search by code or title.
- Book deletion.
- Listing of all books registered in the library.

**Menu:**

An interactive menu offers options to perform the operations mentioned above.