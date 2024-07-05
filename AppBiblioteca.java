import java.util.Scanner;
public class AppBiblioteca
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int codigo, ano, tamanho, opcao = 0,numeroAutores;
        String titulo, nome, autor;
        String autores[];
        Livro auxiliar;
        System.out.println("\fDigite o nome da biblioteca: ");
        nome = in.nextLine();
        System.out.println("Digite o tamanho da biblioteca: ");
        tamanho = in.nextInt();
        ArrayDeLivros array1 = new ArrayDeLivros(tamanho,nome);
        do{
            menu();
            System.out.println("Digite a opção desejada: ");
            opcao = in.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o código do livro: ");
                    codigo = in.nextInt();
                    System.out.println("Digite o título do livro: ");
                    titulo = in.nextLine();
                    in.nextLine();
                    System.out.println("Digite o ano do livro: ");
                    ano = in.nextInt();
                    System.out.println("Quantos autores tem o livro? ");
                    numeroAutores = in.nextInt();
                    in.nextLine();
                    if(numeroAutores > 1){
                        autores = new String[numeroAutores];
                        for(int i = 0;i<numeroAutores;i++){
                            System.out.println("Digite o nome do autor: ");
                            autor = in.nextLine();
                            autores[i] = autor;
                        }
                    }
                    else{
                    autores = new String[1];
                    System.out.println("Digite o nome do autor: ");
                    autor = in.nextLine();
                    autores[0] = autor;
                    }
                    Livro livro1 = new Livro(codigo,titulo,ano,autores);
                    if(array1.cadastraLivros(livro1)){
                        System.out.println("Livro cadastrado com sucesso!");
                    }
                    else{
                        System.out.println("Livro não cadastrado!");
                    }
                    break;
                case 2:
                    System.out.println("Digite um código: ");
                    codigo = in.nextInt();
                    auxiliar = array1.buscaLivroCodigo(codigo);
                    if(auxiliar == null){
                        System.out.println("Livro não encontrado com este código.");
                    }
                    else{
                        System.out.println(auxiliar.toString());
                    }
                    break;
                case 3:
                    System.out.println("Digite um título: ");
                    titulo = in.nextLine();
                    auxiliar = array1.buscaPorTitulo(titulo);
                    if(auxiliar == null){
                        System.out.println("Livro não encontrado com este título.");
                    }
                    else{
                        System.out.println(auxiliar.toString());
                    }
                    break;
                case 4:
                    System.out.println("Qual o código do livro você deseja exluir?");
                    codigo = in.nextInt();
                    if(array1.excluiLivro(codigo)){
                        System.out.println("Livro excluído com sucesso!");
                    }
                    else{
                        System.out.println("Livro não foi excluído.");
                    }
                    break;
                case 5:
                    array1.toString();
                    break;
        }
    }while(opcao != 6);
    in.close();
}
public static void menu(){
        System.out.println("Opção 1: Cadastrar livro");
        System.out.println("Opção 2: Buscar livro por código.");
        System.out.println("Opção 3: Buscar livro por título.");
        System.out.println("Opção 4: Excluir livro.");
        System.out.println("Opção 5: Listar livros.");
        System.out.println("Opção 6: Sair.");
}
}
