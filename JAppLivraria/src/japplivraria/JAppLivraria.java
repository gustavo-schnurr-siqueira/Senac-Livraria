
package japplivraria;
//classes importadas




import java.util.Scanner;

public class JAppLivraria {

   
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Scanner ler = new Scanner(System.in);
        int opcao;
        //int codigo;
        String busca;
        
        Livraria.registraLivros();
        Livraria.registraLogin();
        
        //Livraria.imprimeCatalogo();
        
        Livraria.imprimeBoasVindas();
        Livraria.imprimeMenu();
        opcao = ler.nextInt();
        //------------SWITCH----------------------------------------------------    
        
        do{
        switch(opcao){

            case 1:
                System.out.println("-----[Buscar item por título]-----");
                System.out.print("Digite o título do item-> ");
                ler.nextLine();
                busca=ler.nextLine();
                
                        if(!Livraria.validaTitulo(busca)){
                            System.out.print("-----[Produto indisponível]-----");
                        }else{
                            Livraria.imprimeProdutoTitulo(busca);
                        }
                break;
                
            case 2:
                System.out.println("-----[Buscar por autor]-----");
                System.out.print("Digite o nome do autor-> ");
                ler.nextLine();
                busca=ler.nextLine();
                
                        if(!Livraria.validaAutor(busca)){
                            System.out.print("-----[Autor não encontrado]-----");
                        }else{
                            Livraria.imprimeProdutoAutor(busca);
                        }
                break;
            case 3:
                System.out.println("-----[Buscar por gênero]-----");
                System.out.print("Digite o gênero que você busca->");
                ler.nextLine();
                busca=ler.nextLine();
                
                        if(!Livraria.validaGenero(busca)){
                            System.out.print("-----[Gênero não encontrado]-----");
                        }else{
                            Livraria.imprimeProdutoGenero(busca);
                        }
                break;
            case 4:
                System.out.println("-----[Buscar por tipo]-----");
                System.out.print("Digite o tipo de produto que você busca->");
                ler.nextLine();
                busca=ler.nextLine();
                
                        if(!Livraria.validaTipo(busca)){
                            System.out.print("-----[Tipo não encontrado]-----");
                        }else{
                            Livraria.imprimeProdutoTipo(busca);
                        }
                break;
            case 0:
                Livraria.imprimeAdeus();
                break;
            default:
                System.out.println(opcao+" não é uma opção válida");
                Livraria.imprimeMenu();
                break;
        }
        //------------END SWITCH------------------------------------------------
        }while(opcao!=0);
        
        
        
        
    }
    
}
