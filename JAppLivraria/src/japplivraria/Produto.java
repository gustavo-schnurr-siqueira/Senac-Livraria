package japplivraria;


public class Produto {
    //---------------------------    
    
    private String titulo;
    private String autor;
    private String genero;
    private String tipo;
    private int codigo;
    
    //--construtor
    
    public Produto (String titulo, String autor,String genero,String tipo,int codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.genero=genero;
        this.tipo=tipo;
        this.codigo=codigo;
    }
    
    //---Sets
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }    
    
    //---Gets
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
   
    
}
