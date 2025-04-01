package model;
import java.util.Date;

public class ClassAlunos {
    // Atributos
    private long id;
    private Date dataNasc;
    private String ra;
    private String nome;
    // Construtor
    public ClassAlunos(long id, Date dataNasc, String ra, String nome){
        this.id = id;
        this.dataNasc = dataNasc;
        this.ra = ra;
        this.nome = nome;
    }
    // Substituir o toString
    @SuppressWarnings("deprecation")
    @Override
    public String toString(){
        String idStr = id+"";
        String dataDia = dataNasc.getDate()+"", dataMes = dataNasc.getMonth()+"", dataAno = dataNasc.getYear()+"";
        return "\nId: " + idStr + "\nData de nascimento: " + dataDia + "/" + dataMes + "/" + dataAno + "\nRA: " + ra + "\nNome: " + nome;
    }
    // setters e getters
    public long getId() {
        return id;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public String getRa() {
        return ra;
    }
    public String getNome() {
        return nome;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
