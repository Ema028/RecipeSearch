package classes;

import java.util.Objects;

public class IngredienteReceita {
    private Ingrediente ingrediente;
    private double quantidade;
    private String unidade;

    public IngredienteReceita(Ingrediente ingrediente, double quantidade, String unidade) {
        if (ingrediente != null) this.ingrediente = ingrediente;
        if (quantidade > 0) this.quantidade = quantidade;
        if (unidade != null) this.unidade = unidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void printInfo(){
        System.out.printf("%f%s de %s\n", quantidade, unidade, ingrediente.getNome());
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getUnidade() {
        return unidade;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        IngredienteReceita ingredienteReceita = (IngredienteReceita) o;
        return Objects.equals(ingrediente.getNome(), ingredienteReceita.getIngrediente().getNome());
    }
}
