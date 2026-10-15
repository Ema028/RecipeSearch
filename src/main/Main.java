package main;

public class Main {
    private AppInterativo menuInterativo = new AppInterativo();
    private AppRoteiro menuRoteiro = new AppRoteiro();
    public void main(){
        System.out.println("Iniciando roteiro de testes...");
        menuRoteiro.roteiro();
        System.out.println("Fim dos testes, indo para o menu interativo");
        menuInterativo.menuInterativo();
    }
}
