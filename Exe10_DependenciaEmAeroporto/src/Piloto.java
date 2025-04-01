public class Piloto extends Pessoa{
    String CIV;
    String RAB;
    String FAM;
    public Piloto(String nome, String dataNascimento, String telefone, String CIV, String RAB,String FAM){
        super(nome, dataNascimento, telefone);
        this.CIV = CIV;
        this.FAM = FAM;
        this.RAB = RAB;
    }
    public void controlarAviao(){
        System.out.println(nome + ": Assumiu o conrole do avião");
    }    
}
