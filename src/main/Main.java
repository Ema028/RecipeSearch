package main;

public class Main {
    public static void main(String[] args){
        AppRoteiro roteiro = new AppRoteiro();
        AppInterativo menu = new AppInterativo();

        System.out.println("Iniciando roteiro de testes...");
        roteiro.roteiro();
        System.out.println("Fim dos testes, indo para o menu interativo");
        menu.menuInterativo();
    }
}
