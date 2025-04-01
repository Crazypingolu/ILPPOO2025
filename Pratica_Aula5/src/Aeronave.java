public class Aeronave {
    String id;
    int quantAssentos;
    String compAerea;
    Piloto piloto;
    public Aeronave(String id, int quantAssentos, String compAerea, String nome, String dataNascimento, String telefone, String CIV, String RAB,String FAM){
        this.id = id;
        this.quantAssentos = quantAssentos;
        this.compAerea = compAerea;
        piloto = new Piloto(nome, dataNascimento, telefone, CIV, RAB, FAM);
    }
    public void voar(){
        System.out.println("Avião id #" + id + ": levantou voo");
    }
}