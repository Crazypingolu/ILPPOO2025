package Ex01.view;
import Ex01.controller.ClassTest;
public class ClassMainEx01 {
    public static void main(String[] args) {
        try{
			ClassTest obj = new ClassTest();
            obj.test();
            System.out.println("\nNo errors ocurred");
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			System.out.println("Program Finished.\n");
		}
    }
}
