package main;

import classes.Usuario;
import java.util.Scanner;

public class AppInterativo extends App{
    private Usuario usuario = new Usuario();
    private int opcao = -1;

    public void menuInterativo(){
        Scanner scanner = new Scanner(System.in);

        while(opcao != 0){
            System.out.println("Bem vindo, você gostaria de: ");
            System.out.println("1-Ver o Catálogo, 2-Adicionar um filtro, 3-Ordenar receitas por Tempo de preparo, 4-Limpar Filtros");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    catalogo.printInfo();
                    break;
                case 2:
                    while(opcao != 0){
                        System.out.println("Selecione uma restrição alimentar: ");
                        System.out.println("1-Celíaco, 2-Alergia a Ovo, 3-Alergia a Soja, 4-Alergia a Amendoim, 5-Intolerancia a Lactose, 6-Intolerancia a Caseina, 7-Vegana, 8-Detox");
                        opcao = scanner.nextInt();
                        if(opcao<1 || opcao>8){
                            System.out.println("Não é uma opção válida");
                        }else{
                            usuario.adicionarRestricao(restricoes.get(opcao - 1));
                        }
                        System.out.println("Gostaria de: ");
                        System.out.println("0-Ver receitas com filtros escolhidos, 1-Adicionar nova restrição");
                        opcao = scanner.nextInt();
                    }
                    catalogo.filtrarReceitas(usuario);
                    break;
                case 3:
                    System.out.println("Ordenando catálogo ...");
                    catalogo.ordenarPorTempoPreparo();
                    System.out.println("Ordenado");
                    break;
                case 4:
                    System.out.println("Limpando Filtros ...");
                    usuario = new Usuario();
                    System.out.println("Filtros zerados");
                default:
                    System.out.println("Não é uma opção válida");
                    break;
            }
            System.out.println("Gostaria de: ");
            System.out.println("0-Sair, 1-Voltar ao Menu");
        }
        scanner.close();
    }
    
}
