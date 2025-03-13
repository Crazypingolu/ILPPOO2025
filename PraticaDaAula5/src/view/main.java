package view;
import controller.controllerTeste;
public class main {
    public static void main(String[] args) {
        try {
            controllerTeste run = new controllerTeste();
            run.test();
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("Program Ended");
        }
    }
    
}
