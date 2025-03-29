package model;
import java.lang.Exception;
import model.ClassAlunos;
import java.util.Scanner;
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
    // menu
    @SuppressWarnings("deprecation")
    public void menu() throws Exception{
        Scanner scan = new Scanner(System.in);
        String opcFrase = "", nome = " ", ra = "none";
        int id = 0;
        char opcLetra;
        Date date = new Date();
        while(true){
            System.out.println("\n(C)riar   (E)xibir   (R)emover\r\n" +
                                "(A)tualizar   (S)air");
            opcFrase = scan.nextLine().toUpperCase();
            opcLetra = opcFrase.charAt(0);
            if (opcLetra == 'S'){
                break;
            } else if (opcLetra == 'C'){
                System.out.println("Insira o ID: ");
                id = scan.nextInt();
                scan.nextLine(); // Limpa o Scanner
                System.out.println("Insira o dia do nascimento: ");
                date.setDate(scan.nextInt());
                scan.nextLine(); // Limpa o Scanner
                System.out.println("Insira o mês do nascimento: ");
                date.setMonth(scan.nextInt());
                scan.nextLine(); // Limpa o Scanner
                System.out.println("Insira o ano do nascimento: ");
                date.setYear(scan.nextInt());
                scan.nextLine(); // Limpa o Scanner
                System.out.println("Insira o RA:");
                ra = scan.nextLine();
                System.out.println("Insira o Nome: ");
                nome = scan.nextLine();
                criar(id, date, ra, nome);
            } else if (opcLetra == 'E'){
                exibir(scan);
            } else if (opcLetra == 'R'){
                excluir(scan);
            } else if (opcLetra == 'A'){
                atualizar(scan);
            } else {
                throw new IllegalArgumentException("Opção digitada é inválida.");
            }
        }
        scan.close();
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
    public void exibir(Scanner scan){
        if (indice < 1)
            throw new IllegalArgumentException("Não existe nenhum aluno registrado.");
        System.out.println("Digite o RA do aluno para exibir: "); 
        String raPesquisa;
        raPesquisa = scan.nextLine();
        String raLista;
        for (int i = 0; i < indice; i++){
            raLista = listaAlunos[i].getRa();
            if (raLista.equals(raPesquisa)){
                System.out.println(listaAlunos[i].toString());
                return;
            }
        }
        System.out.println(indice);
        throw new IllegalArgumentException("Aluno não encontrado na lista.");
    }
    /*
     * A função excluir() deve pedir ao usuário para digitar um RA, e em seguida deve excluir o(s) aluno(s)
     * com este RA da matriz (alunos)
     */
    public void excluir(Scanner scan){
        if (indice == 0)
            throw new IllegalArgumentException("Não existe nenhum aluno registrado.");
        System.out.println("Digite o RA do aluno para excluir: "); 
        String raPesquisa;
        raPesquisa = scan.nextLine();
        int deletions = 0, indiceDel = 0;
        String raLista;
        for (int i = 0; i < indice; i++){
            raLista = listaAlunos[i].getRa();
            if (raLista.equals(raPesquisa)){
                for (int j = i; j < indice; j++){ // Coloca todos os próximos alunos 1 casa para trás e atualiza o indice
                    if (i == (indice -1)){
                        listaAlunos[j].setId(0);
                        listaAlunos[j].setDataNasc(null);
                        listaAlunos[j].setRa(null);
                        listaAlunos[j].setNome(null);
                    } else {
                        listaAlunos[j].setId(listaAlunos[j+1].getId());
                        listaAlunos[j].setDataNasc(listaAlunos[j+1].getDataNasc());
                        listaAlunos[j].setRa(listaAlunos[j+1].getRa());
                        listaAlunos[j].setNome(listaAlunos[j+1].getNome());
                    }
                }
            }
            indice--;
            indiceDel++;
        }
        if (indiceDel < 1)
            throw new IllegalArgumentException("Aluno não encontrado na lista.");
    }
    /*
     * A função atualizar() deve pedir ao usuário para digitar um RA, e em seguida deve procurar pelo primeiro aluno na matriz
     * (alunos) que contenha este RA. A função deve  em seguida solicitar ao usuário para que digite os demais dados do aluno
     * (nome e nascimento) para trocar os valores das características do aluno encontrado na matriz pelos valores recém 
     * informados pelo usuário.
     */
    @SuppressWarnings("deprecation")
    public void atualizar(Scanner scan){
        if (indice == 0)
            throw new IllegalArgumentException("Não existe nenhum aluno registrado.");
        System.out.println("Digite o RA do aluno para atualizar: "); 
        String raPesquisa;
        raPesquisa = scan.nextLine();
        String raLista;
        for (int i = 0; i < indice; i++){
            raLista = listaAlunos[i].getRa();
            if (raLista.equals(raPesquisa)){
                Date dataNova = new Date();
                System.out.println("Digite o novo nome: ");
                listaAlunos[i].setNome(scan.nextLine());
                System.out.println("Digite o dia da nova data de nascimento: ");
                dataNova.setDate(scan.nextInt());
                scan.nextLine(); // Limpa o Scanner
                System.out.println("Digite o mês da nova data de nascimento: ");
                dataNova.setMonth(scan.nextInt());
                scan.nextLine(); // Limpa o Scanner
                System.out.println("Digite o ano da nova data de nascimento: ");
                dataNova.setYear(scan.nextInt());
                scan.nextLine(); // Limpa o Scanner
                listaAlunos[i].setDataNasc(dataNova);
                return;
            }
        }
        throw new IllegalArgumentException("Aluno não encontrado na lista.");
    }
}