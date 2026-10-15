package main;

import classes.Usuario;

public class AppRoteiro extends App {
    private Usuario teste = new Usuario();

    public void roteiro(){

        catalogo.printInfo();

        //Celiaco, AlergiaOvo, AlergiaSoja, AlergiaAmendoim, IntoleranciaLactose, IntoleranciaCaseina, Vegana, Detox
        System.out.println("Criando usuário teste com Alergia a ovo e Celíaco...");
        teste.adicionarRestricao(restricoes.get(1));
        teste.adicionarRestricao(restricoes.get(0));
        System.out.println("Filtrando Receitas para usuário teste com Alergia a ovo e Celíaco...");
        catalogo.filtrarReceitas(teste);

        System.out.println("Filtrando Receitas para usuário teste ordenandas por tempo de preparo...");
        catalogo.ordenarPorTempoPreparo();
        catalogo.filtrarReceitas(teste);
    }
}
