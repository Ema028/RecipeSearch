package main;

import classes.Usuario;

public class AppRoteiro extends App {
    private Usuario teste = new Usuario();

    public void roteiro(){
        //Celiaco, AlergiaOvo, AlergiaSoja, AlergiaAmendoim, IntoleranciaLactose, IntoleranciaCaseina, Vegana, Detox
        teste.adicionarRestricao(restricoes.get(1)); //AlegiaOvo
        System.out.println("Filtrando Receitas para usuário teste com Alergia a ovo...");
        catalogo.filtrarReceitas(teste);

        System.out.println("Filtrando Receitas para usuário teste com Alergia a ovo ordenando por tempo de preparo...");
        catalogo.ordenarPorTempoPreparo();
        catalogo.filtrarReceitas(teste);
    }
}
