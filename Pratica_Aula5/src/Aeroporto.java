public class Aeroporto {
    String endereco;
    String nome;
    int capAeronaves;
    public Aeroporto(String endereco, String nome, int capAeronaves){
        this.endereco = endereco;
        this.nome = nome;
        this.capAeronaves = capAeronaves;
    }
    public void infoPilotoAeronave(Aeronave aeronave){
        System.out.println("O avião de id #" + aeronave.id + " tem como piloto o(a) capitão(ã): " + aeronave.piloto.nome);
    }
}
