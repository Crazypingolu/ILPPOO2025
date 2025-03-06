package model;
public class ClasseFogao {
    // Características:
    public String cor;
    public float tamanho;
    public float capacidadeForno;
    public int quantidadeDeBocas;
    public float consumoEnergia;
    // Comportamentos:
    public void liberarGas(int boca){
        System.out.println("O gás está sendo liberado na boca " + boca);
    }
    public void ignicao(int boca){
        System.out.println("O botão de ignição libera uma descarga na saída " + boca);
    }
    public void abrirForno(){
        System.out.println("Compartimento aberto");
    }

}
