package controller;
import model.ClassGestaoAlunos;
import model.ClassAlunos;
import java.lang.Exception;

@SuppressWarnings("unused")
public class ClassController {
    public ClassController(){
        super();
    }
    public void run() {
        ClassGestaoAlunos lista = new ClassGestaoAlunos();
        while (true) {
         try {
            lista.menu();
            break;
         } catch (Exception e) {
           System.err.println("Erro: " + e.getMessage());
         }   
        }
    }
}
