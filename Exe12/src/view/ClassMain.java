package view;
import controller.ClassController;

public class ClassMain {
    public static void main(String[] args) {
        ClassController Obj = new ClassController();
        try {
            Obj.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
