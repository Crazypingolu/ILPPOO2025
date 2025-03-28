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
    @Override
    public String toString(){
        String idStr = id+"", dateStr = dataNasc+"";
        return "Id: " + idStr + " Data de nascimento: " + dateStr + " RA: " + ra + " Nome: " + nome;
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
