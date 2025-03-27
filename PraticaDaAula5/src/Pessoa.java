public class Pessoa {
    String nome;
    String dataNascimento;
    String telefone;
    public Pessoa(){
        nome = "";
        dataNascimento = "000000";
        telefone = "12345678901234";
    }
    public Pessoa(String nome, String dataNascimento, String telefone){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }
    public void falar(){
        System.out.println(nome + ": bla bla bla.");
    } 
}
