package japplivraria;

import japplivraria.Logins.Login;


public class Livraria {
    //criando um array pra armazenar os produtos
    public static Produto[] produtos = new Produto[6];    
    public static Login[] login = new Login[4];
    
    public static void registraLogin(){
        Login login0 = new Login(01,"Janice Picoli","Rua das Andorinhas, 17","51-32127777");
        Login login1 = new Login(01,"Sebastião Doce","Rua Jorge de Toledo, 1017","51-35449984");
        Login login2 = new Login(02,"Clênis de Aquino","Rua Vigílio Bonito, 350","51-997451102");
        Login login3 = new Login(02,"Ortência da Silva","Rua Gramado, 111","51-32775641");
        
        login[0]=login0;
        login[1]=login1;
        login[2]=login2;
        login[3]=login3;
    }
    
    
    public static void registraLivros(){
        //usando o construtor da Classe produto dentro do método
        Produto item0 = new Produto("O mundo de Sofia","Jostein Gaarder","Fantasia","Livro",0);
        Produto item1 = new Produto("O dia do Coringa","Jostein Gaarder","Fantasia","Livro",1);
        Produto item2 = new Produto("A moreninha","Joaquim Manuel de Macedo","Romance","Livro",2);
        Produto item3 = new Produto("Rosa","Joaquim Manuel de Macedo","Drama","Livro",3);
        Produto item4 = new Produto("Girl from Rio","Anitta","Funk","CD",4);
        Produto item5 = new Produto("The Ozzman Cometh","Ozzy Osbourne","Rock","CD",5);
        
        //aqui relaciono cada um dos produtos registrados acima em uma posição do array
        produtos[0] = item0;
        produtos[1] = item1;
        produtos[2] = item2;
        produtos[3] = item3;
        produtos[4] = item4;
        produtos[5] = item5;
    }    
    //-----VALIDA CODIGO[não utilizado]
    /*public static boolean validaCodigo(int codigo){
        for(Produto produto:produtos){
            if(produto.getCodigo()==codigo){
               return true;
            }            
        } 
        return false;
    }*/
    
    //-----VALIDA TÍTULO
    public static boolean validaTitulo(String titulo){
        for(Produto produto:produtos){
            if(produto.getTitulo().compareToIgnoreCase(titulo)==0){
               return true;            
            }           
        }       
        return false;
    } 
    //-----VALIDA AUTOR
    public static boolean validaAutor(String autor){
        for(Produto produto:produtos){
            if(produto.getAutor().compareToIgnoreCase(autor)==0){
               return true;
            }            
        } 
        return false;
    }
    //-----VALIDA GÊNERO
    public static boolean validaGenero(String genero){
        for(Produto produto:produtos){
            if(produto.getGenero().compareToIgnoreCase(genero)==0){
               return true;
            }            
        } 
        return false;
    }
    //-----VALIDA TIPO
    public static boolean validaTipo(String tipo){
        for(Produto produto:produtos){
            if(produto.getTipo().compareToIgnoreCase(tipo)==0){
               return true;
            }            
        } 
        return false;
    }
        
//============IMPRESSÕES===============================================
    
    //----------BEM VINDO--------
    public static void imprimeBoasVindas(){
       System.out.println("--------------------------------"
               +"\n---Bem Vindo à nossa Livraria---"
               +"\n--------------------------------"
               +"\n------Selecione uma opção-------");
    }
    //----MENU------
    public static void imprimeMenu(){
       System.out.println("1- [Buscar por título]"
       +"\n2- [Buscar por autor]"
       +"\n3- [Buscar por gênero]"
       +"\n4- [Buscar tipo de produto]"
       +"\n0- [Sair do programa]");
    }
    //----ADEUS----
    public static void imprimeAdeus(){
       System.out.println("---Volte sempre!!!---");
    }
    
    //Imprime os produtos cadastrados---------------
    public static void imprimeCatalogo(){
        for(Produto produto : produtos){
            System.out.println("==========="+"\nProduto -> " + produto.getTitulo() + "\n Tipo -> "+ produto.getTipo()+"\nCódigo-> "+produto.getCodigo()+"\n=======");
        }        
    }
    //-----PRODUTO POR CÓDIGO [TESTE INT]--------
    public static void imprimeProdutoCod(int numero){
        for(int controle=0;controle<=produtos.length-1;controle++){
            if(produtos[numero].getCodigo()==numero){
                System.out.println("=================="+"\nTitulo-> "+produtos[numero].getTitulo()
                +"\nAutor-> "+produtos[numero].getAutor()
                +"\nGênero-> "+produtos[numero].getGenero()
                +"\nTipo-> "+produtos[numero].getTipo()
                +"\n==================");
                break;
            }
        }
    }
    
   //----IMPRIME POR TÍTULO [STRING]------------
    
    public static void imprimeProdutoTitulo(String titulo){
        for(int controle=0;controle<=produtos.length-1;controle++){
            if(produtos[controle].getTitulo().compareToIgnoreCase(titulo)==0){
                System.out.println("=================="
                +"\n[TÍTULO]-> "+produtos[controle].getTitulo()
                +"\nAutor-> "+produtos[controle].getAutor()
                +"\nGênero-> "+produtos[controle].getGenero()
                +"\nTipo-> "+produtos[controle].getTipo()
                +"\n==================");
               
                break;
            }
        }
    }
   //-----IMPRIME POR AUTOR [STRING] ---------------
    
    public static void imprimeProdutoAutor(String autor){
        for(int controle=0;controle<=produtos.length-1;controle++){
            if(produtos[controle].getAutor().compareToIgnoreCase(autor)==0){
                System.out.println("=================="
                +"\nTitulo-> "+produtos[controle].getTitulo()
                +"\n[AUTOR]-> "+produtos[controle].getAutor()
                +"\nGênero-> "+produtos[controle].getGenero()
                +"\nTipo-> "+produtos[controle].getTipo()
                +"\n==================");
                            
            }           
        }
        
    }
    //-----IMPRIME POR GENERO[STRING]----------------------
    
    public static void imprimeProdutoGenero(String genero){
        for(int controle=0;controle<=produtos.length-1;controle++){
            if(produtos[controle].getGenero().compareToIgnoreCase(genero)==0){
                System.out.println("=================="
                +"\nTitulo-> "+produtos[controle].getTitulo()
                +"\nAutor-> "+produtos[controle].getAutor()
                +"\n[GÊNERO]-> "+produtos[controle].getGenero()
                +"\nTipo-> "+produtos[controle].getTipo()
                +"\n==================");
                
            }
        }
    }
    
    //---- IMPRIME POR TIPO[STRING]----------------------
    public static void imprimeProdutoTipo(String tipo){
        for(int controle=0;controle<=produtos.length-1;controle++){
            if(produtos[controle].getTipo().compareToIgnoreCase(tipo)==0){
                System.out.println("=================="
                +"\nTitulo-> "+produtos[controle].getTitulo()
                +"\nAutor-> "+produtos[controle].getAutor()
                +"\n[Gênero-> "+produtos[controle].getGenero()
                +"\n[TIPO-> "+produtos[controle].getTipo()
                +"\n==================");
                
            }
        }
    }
}
