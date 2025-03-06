package view;
import controller.ClasseController;
public class Main {
    public static void main(String[] args) {
        try {
            ClasseController t = new ClasseController();
            t.testeCaixa();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
