package view;
import controller.ClasseController;
public class ClasseMain {
    public static void main(String[] args) {
        try {
            ClasseController game = new ClasseController();
            game.run();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println("\nGame over");
        }
    }
}
