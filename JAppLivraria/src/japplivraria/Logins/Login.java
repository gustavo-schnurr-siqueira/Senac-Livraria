
package japplivraria.Logins;

public class Login {
    //-------------------------------------------------
    private int acesso;
    private String nome;
    private String endereco;
    private String telefone;
    
    
    //construtor
    public Login(int acesso,String nome, String endereco, String telefone){
        this.acesso=acesso;
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }
    
    //--sets
    public void setAcesso(int acesso){
        this.acesso=acesso;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    
    //--gets
    
    public int getAcesso(){
        return this.acesso;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    //-------------------------------------------------
    
    
    
}
