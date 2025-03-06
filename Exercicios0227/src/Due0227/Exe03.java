/*
  Program: create a code to give the error: Out of Memory - Java Heap Error
  @author Lucas P.
  @version 1.0
*/
package Due0227;
import java.util.ArrayList;
import java.util.List;
public class Exe03 {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        while(true){
            int[] array = new int[1000000];
            list.add(array);
        }
    }    
}
