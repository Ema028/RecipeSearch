package main;

public class Main {
    public static void main(String[] args){
        System.out.println("Iniciando roteiro de testes...");
        new AppRoteiro().roteiro();
        System.out.println("Fim dos testes, indo para o menu interativo");
        new AppRoteiro().roteiro();
    }
}
