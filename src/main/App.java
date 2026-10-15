package main;
import java.util.ArrayList;

import classes.*;
import enums.*;

public class App{
    protected Catalogo catalogo;
    protected ArrayList<Restricao> restricoes;

    public App(){
        catalogo   = new Catalogo();
        restricoes = new ArrayList<>();

        Restricao Celiaco        = new Alergia(Caracteristica.GLUTEN);
        Restricao AlergiaOvo     = new Alergia(Caracteristica.OVO);
        Restricao AlergiaSoja    = new Alergia(Caracteristica.SOJA);
        Restricao AlergiaAmendoim= new Alergia(Caracteristica.AMENDOIM);
        Restricao IntoleranciaLactose = new Alergia(Caracteristica.LEITE);
        Restricao IntoleranciaCaseina = new Alergia(Caracteristica.LEITE);
        Restricao Vegana = new Alergia(Caracteristica.ORIGEM_ANIMAL);
        Restricao Detox  = new Dieta(Caracteristica.INFLAMATORIO, Caracteristica.ANTI_INFLAMATORIO);

        restricoes.add(Celiaco);
        restricoes.add(AlergiaOvo);
        restricoes.add(AlergiaSoja);
        restricoes.add(AlergiaAmendoim);
        restricoes.add(IntoleranciaLactose);
        restricoes.add(IntoleranciaCaseina);
        restricoes.add(Vegana);
        restricoes.add(Detox);

        Ingrediente pastaAmendoim = new Ingrediente("Pasta de amendoim", Caracteristica.AMENDOIM);
        Ingrediente gomaTapioca   = new Ingrediente("Goma de tapioca", Caracteristica.INFLAMATORIO);
        Ingrediente manjericao    = new Ingrediente("Manjericao");
        Ingrediente ovo      = new Ingrediente("Ovo", Caracteristica.OVO, Caracteristica.ORIGEM_ANIMAL);
        Ingrediente manteiga = new Ingrediente("Manteiga", Caracteristica.LEITE, Caracteristica.ORIGEM_ANIMAL);
        Ingrediente parmesao = new Ingrediente("Queijo parmesao", Caracteristica.LEITE, Caracteristica.ORIGEM_ANIMAL);
        Ingrediente salmao   = new Ingrediente("Salmao", Caracteristica.ORIGEM_ANIMAL, Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente frango   = new Ingrediente("Peito de frango", Caracteristica.ORIGEM_ANIMAL);
        Ingrediente macarrao = new Ingrediente("Macarrao de trigo", Caracteristica.GLUTEN, Caracteristica.INFLAMATORIO);
        Ingrediente molhoSoja= new Ingrediente("Molho de soja", Caracteristica.SOJA, Caracteristica.GLUTEN, Caracteristica.INFLAMATORIO);
        Ingrediente tofu     = new Ingrediente("Tofu", Caracteristica.SOJA);
        Ingrediente azeite   = new Ingrediente("Azeite", Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente alho     = new Ingrediente("Alho", Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente curcuma  = new Ingrediente("Curcuma", Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente gengibre = new Ingrediente("Gengibre", Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente brocolis = new Ingrediente("Brocolis", Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente couve    = new Ingrediente("Couve", Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente feijao   = new Ingrediente("Feijao", Caracteristica.ANTI_INFLAMATORIO);
        Ingrediente abacate  = new Ingrediente("Abacate");
        Ingrediente banana   = new Ingrediente("Banana");
        Ingrediente tomate   = new Ingrediente("Tomate");
        Ingrediente cebola   = new Ingrediente("Cebola");
        Ingrediente cenoura  = new Ingrediente("Cenoura");
        Ingrediente limao    = new Ingrediente("Limao");
        Ingrediente arroz    = new Ingrediente("Arroz");
        Ingrediente tortilla = new Ingrediente("Tortilla de milho");
        Ingrediente agua     = new Ingrediente("Agua");
        Ingrediente sal      = new Ingrediente("Sal");

        Receita omelete = new Receita("Omelete simples", "Bata os ovos com sal. Aqueca a manteiga na frigideira, despeje os ovos e dobre quando firmar.", 10, Culinaria.FRANCESA);
        omelete.adicionarIngrediente(ovo, 3, "un");
        omelete.adicionarIngrediente(manteiga, 1, "colher de sopa");
        omelete.adicionarIngrediente(sal, 1, "pitada");
        catalogo.adicionarReceita(omelete);

        Receita salmaoBrocolis = new Receita("Salmao grelhado com brocolis", "Tempere o salmao com sal, alho e limao. Grelhe por 4 minutos de cada lado. Cozinhe o brocolis no vapor e finalize com azeite.", 25, Culinaria.FRANCESA);
        salmaoBrocolis.adicionarIngrediente(salmao, 200, "g");
        salmaoBrocolis.adicionarIngrediente(brocolis, 150, "g");
        salmaoBrocolis.adicionarIngrediente(azeite, 1, "colher de sopa");
        salmaoBrocolis.adicionarIngrediente(alho, 2, "dente");
        salmaoBrocolis.adicionarIngrediente(limao, 1, "un");
        salmaoBrocolis.adicionarIngrediente(sal, 1, "pitada");
        catalogo.adicionarReceita(salmaoBrocolis);

        Receita pomodoro = new Receita("Macarrao ao pomodoro", "Cozinhe o macarrao. Refogue alho e tomate picado no azeite ate formar molho. Misture o macarrao, finalize com manjericao e parmesao.", 30, Culinaria.ITALIANA);
        pomodoro.adicionarIngrediente(macarrao, 200, "g");
        pomodoro.adicionarIngrediente(tomate, 4, "un");
        pomodoro.adicionarIngrediente(alho, 2, "dente");
        pomodoro.adicionarIngrediente(azeite, 2, "colher de sopa");
        pomodoro.adicionarIngrediente(manjericao, 5, "folha");
        pomodoro.adicionarIngrediente(parmesao, 30, "g");
        catalogo.adicionarReceita(pomodoro);

        Receita tapioca = new Receita("Tapioca com banana", "Espalhe a goma em frigideira antiaderente ate formar a massa. Recheie com banana fatiada e dobre.", 10, Culinaria.BRASILEIRA);
        tapioca.adicionarIngrediente(gomaTapioca, 4, "colher de sopa");
        tapioca.adicionarIngrediente(banana, 1, "un");
        catalogo.adicionarReceita(tapioca);

        Receita tofuLegumes = new Receita("Tofu salteado com legumes", "Corte o tofu em cubos e doure. Adicione brocolis e cenoura, refogue com gengibre e finalize com molho de soja.", 20, Culinaria.JAPONESA);
        tofuLegumes.adicionarIngrediente(tofu, 200, "g");
        tofuLegumes.adicionarIngrediente(brocolis, 100, "g");
        tofuLegumes.adicionarIngrediente(cenoura, 1, "un");
        tofuLegumes.adicionarIngrediente(gengibre, 1, "colher de cha");
        tofuLegumes.adicionarIngrediente(molhoSoja, 2, "colher de sopa");
        catalogo.adicionarReceita(tofuLegumes);

        Receita arrozFeijao = new Receita("Arroz com feijao", "Refogue alho e cebola, adicione o arroz e agua e cozinhe. Prepare o feijao cozido separadamente com sal e sirva junto.", 40, Culinaria.BRASILEIRA);
        arrozFeijao.adicionarIngrediente(arroz, 1, "xicara");
        arrozFeijao.adicionarIngrediente(feijao, 1, "xicara");
        arrozFeijao.adicionarIngrediente(alho, 2, "dente");
        arrozFeijao.adicionarIngrediente(cebola, 1, "un");
        arrozFeijao.adicionarIngrediente(agua, 2, "xicara");
        arrozFeijao.adicionarIngrediente(sal, 1, "pitada");
        catalogo.adicionarReceita(arrozFeijao);

        Receita cha = new Receita("Cha de curcuma e gengibre", "Ferva a agua com curcuma e gengibre por 5 minutos. Coe e adicione o suco de limao.", 10, Culinaria.BRASILEIRA);
        cha.adicionarIngrediente(agua, 300, "ml");
        cha.adicionarIngrediente(curcuma, 1, "colher de cha");
        cha.adicionarIngrediente(gengibre, 1, "colher de cha");
        cha.adicionarIngrediente(limao, 1, "un");
        catalogo.adicionarReceita(cha);

        Receita tacos = new Receita("Tacos de frango", "Grelhe o frango em tiras. Monte as tortillas com frango, tomate, cebola e abacate e finalize com limao.", 30, Culinaria.MEXICANA);
        tacos.adicionarIngrediente(tortilla, 4, "un");
        tacos.adicionarIngrediente(frango, 200, "g");
        tacos.adicionarIngrediente(tomate, 2, "un");
        tacos.adicionarIngrediente(cebola, 1, "un");
        tacos.adicionarIngrediente(abacate, 1, "un");
        tacos.adicionarIngrediente(limao, 1, "un");
        catalogo.adicionarReceita(tacos);

        Receita saladaCouve = new Receita("Salada de couve com abacate", "Corte a couve bem fina e massageie com azeite e limao. Misture o abacate em cubos e sirva.", 10, Culinaria.BRASILEIRA);
        saladaCouve.adicionarIngrediente(couve, 3, "folha");
        saladaCouve.adicionarIngrediente(abacate, 1, "un");
        saladaCouve.adicionarIngrediente(azeite, 1, "colher de sopa");
        saladaCouve.adicionarIngrediente(limao, 1, "un");
        saladaCouve.adicionarIngrediente(sal, 1, "pitada");
        catalogo.adicionarReceita(saladaCouve);

        Receita panqueca = new Receita("Panqueca de banana com pasta de amendoim", "Amasse a banana, misture com os ovos e doure em frigideira antiaderente. Sirva com a pasta de amendoim por cima.", 15, Culinaria.BRASILEIRA);
        panqueca.adicionarIngrediente(banana, 1, "un");
        panqueca.adicionarIngrediente(ovo, 2, "un");
        panqueca.adicionarIngrediente(pastaAmendoim, 3, "colher de sopa");
        catalogo.adicionarReceita(panqueca);
    }

}