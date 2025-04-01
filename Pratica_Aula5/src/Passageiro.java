public class Passageiro extends Pessoa {
    int numAssento;
    String codPassagem;
    String codPassaporte;
    public Passageiro(String nome, String dataNascimento, String telefone, int numAssento, String codPassagem, String codPassaporte){
        super(nome, dataNascimento, telefone);
        this.numAssento = numAssento;
        this.codPassagem = codPassagem;
        this.codPassaporte = codPassaporte;
    }
    public void embarcar(){
        System.out.println("Passageiro " + nome + ": sentou no assento " + numAssento);
    }
}
