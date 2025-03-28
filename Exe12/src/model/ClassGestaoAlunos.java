package model;
import java.lang.Exception;
import model.ClassAlunos;
import java.util.Date;
@SuppressWarnings("unused")

public class ClassGestaoAlunos {
    private int indice;
    private ClassAlunos[] listaAlunos;
    // Construtor
    public ClassGestaoAlunos() {
        this.indice = 0; // Inicializa o índice com 0
        this.listaAlunos = new ClassAlunos[50]; // Cria um array para armazenar 50 alunos
    }
    /*
     * O comportamento criar() deve criar uma nova instância de Aluno, preencher as características 
     * desta instância com informações fornecidas pelo usuário, e deve guardar esta instância de 
     * aluno na matriz (alunos) na posição indicada pela variável indice.
     */
    public void criar(int id, Date dataNasc, String ra, String nome) throws IllegalArgumentException{
        if (indice < 50){
            ClassAlunos alunoNovo = new ClassAlunos(id, dataNasc, ra, nome);
            listaAlunos[indice] = alunoNovo;
            indice++;
        } else {
            throw new IllegalArgumentException("Não existe mais espaço para cadastro de alunos na lista.");
        }
    }
    /*
     * A função exibir() deve pedir ao usuário para que digite um número de RA e procure qual aluno na 
     * matriz (alunos) possui um RA idêntico. Os dados do aluno encontrado devem ser exibidos na tela.
     */
    public void exibir(String raPesquisa){
        if (indice == 0)
            throw new IllegalArgumentException("Não existe nenhum aluno registrado.");
        String raLista;
        for (int i = 0; i < indice; i++){
            raLista = listaAlunos[i].getRa();
            if (raLista.equals(raPesquisa)){
                System.out.println(listaAlunos[i].toString());
                return;
            }
        }
        throw new IllegalArgumentException("Aluno não encontrado na lista.");
    }
    /*
     * A função excluir() deve pedir ao usuário para digitar um RA, e em seguida deve excluir o(s) aluno(s)
     * com este RA da matriz (alunos)
     */
    public void excluir(String raPesquisa){
        if (indice == 0)
            throw new IllegalArgumentException("Não existe nenhum aluno registrado.");
        int deletions = 0, indiceDel = 0;
        String raLista;
        for (int i = 0; i < indice; i++){
            raLista = listaAlunos[i].getRa();
            if (raLista.equals(raPesquisa)){
                for (int j = i; j < indice; j++){ // Coloca todos os próximos alunos 1 casa para trás e atualiza o indice
                    listaAlunos[j].setId(listaAlunos[j+1].getId());
                    listaAlunos[j].setDataNasc(listaAlunos[j+1].getDataNasc());
                    listaAlunos[j].setRa(listaAlunos[j+1].getRa());
                    listaAlunos[j].setNome(listaAlunos[j+1].getNome());
                }
            }
            indice--;
            indiceDel++;
        }
        if (indiceDel < 1)
            throw new IllegalArgumentException("Aluno não encontrado na lista.");
    }
}