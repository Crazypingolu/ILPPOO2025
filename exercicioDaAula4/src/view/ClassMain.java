package view;
import controller.ClassController;
public class ClassMain {
    public static void main(String[] args) {
        try {
            ClassController run1 = new ClassController();
            run1.test();
        } catch (Exception e) {
            e.getStackTrace();
            // TODO: handle exception
        } finally {
            System.out.println("Program finished");
        }
    }
}
