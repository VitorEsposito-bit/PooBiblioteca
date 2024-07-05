public class ArrayDeLivros
{
    private Livro[] ArrayDeLivros;
    private int proximoIndice;
    private String nome;
    
    public ArrayDeLivros(int tamanho, String nome){
        proximoIndice = 0;
        ArrayDeLivros = new Livro[tamanho];
    }
    public boolean cadastraLivros(Livro livro1){
        if(proximoIndice == 0){
            ArrayDeLivros[proximoIndice] = livro1;
            proximoIndice++;
            return true;
        }
        for(int i = 0;i<proximoIndice;i++){
            if(ArrayDeLivros[i].getCodigo() == livro1.getCodigo()){
                return false;
            }
        }
        ArrayDeLivros[proximoIndice] = livro1;
        proximoIndice++;
        return true;
    }
    public Livro buscaLivroCodigo(int codigo){
        if(proximoIndice == 0){
            return null;
        }
        for(int i = 0;i<ArrayDeLivros.length;i++){
            if(codigo == ArrayDeLivros[i].getCodigo()){
                return ArrayDeLivros[i];
            }
        }
        return null;
    }
    public Livro buscaPorTitulo(String titulo){
        if(proximoIndice == 0){
            return null;
        }
        for(int i = 0;i<ArrayDeLivros.length;i++){
            if(ArrayDeLivros[i].getTitulo().equalsIgnoreCase(titulo)){
                return ArrayDeLivros[i];
            }
        }
        return null;
    }
    public boolean excluiLivro(int codigo){
        if(proximoIndice == 0){
            return false;
        }
        for(int i = 0;i<ArrayDeLivros.length;i++){
            if(ArrayDeLivros[i].getCodigo() == codigo){
                ArrayDeLivros[i] = null;
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String saida = "\nNome da Biblioteca: " + nome;
        for(int i = 0;i<ArrayDeLivros.length;i++){
            saida = saida + ArrayDeLivros[i].toString();
        }
        return saida;
    }
}
