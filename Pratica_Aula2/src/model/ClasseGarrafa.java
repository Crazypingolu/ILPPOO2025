package model;
public class ClasseGarrafa {
    // Características:
    public String cor;
    public float tamanho;
    public float espessura;
    public float capacidadeDeLiquido;
    public String material;
    // Comportamentos:
    public void receberLiquido(){
        System.out.println("O líquido é colocado na garrafa");
    }
    public void manterLiquido(){
        System.out.println("A garrafa contém o líquido");
    }
    public void liberarLíquido(){
        System.out.println("O líquido deixa a garrafa");
    }

}
