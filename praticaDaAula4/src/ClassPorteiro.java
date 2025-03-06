public class ClassPorteiro {
    String num;
    String nome;
    int horaEnt;
    private static ClassPorteiro instanciado; // porteiro simpleton

    // construtor
    private ClassPorteiro(String num, String nome, int horaEnt){
        this.num = num;
        this.nome = nome;
        this.horaEnt = horaEnt;
    }
    public static ClassPorteiro getInstanciado(String num, String nome, int horaEnt){ // condicional para construtor
        if (instanciado == null)
            instanciado = new ClassPorteiro(num, nome, horaEnt);
        return instanciado;
    }
    
    // Ações para "porteiro"
    public void abrirPortao(){}
    public void interfonar(){}
    public void atenderTelefone(){}

}
