
public class Livro
{
    private int codigo;
    private String titulo;
    private int ano;
    private String [] autores;
    
    public Livro(int codigo,String titulo,int ano, String [] autores){
    this.autores = autores;
    this.codigo = codigo;
    this.titulo = titulo;
    this.ano = ano;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }
    public void setAutores(String [] autores){
        this.autores = autores;
    }
    public String getAutores(){
        String saida = "\n";
        for(int i =0;i<autores.length;i++){
            saida = saida + autores[i];
        }
        return saida;
    }
    public String toString(){
        if(autores.length>1){
            return "\nO Código do livro é: "+getCodigo()+". O título é: "+getTitulo()+". O ano é: "+getAno()+". Os autores são: "+getAutores();
        }
        else
        return "\nO Código do livro é: "+ codigo + ". O título é: " + titulo + ". O ano é: " + ano + ". O autores é: " + autores;
    }
}
