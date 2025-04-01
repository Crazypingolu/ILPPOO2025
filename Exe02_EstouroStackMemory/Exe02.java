package Due0227;
public class Exe02 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(badRecursive(num));
    }
    static int badRecursive(int n){
        int r = 0;
        r = n + 1;  
        if (r > 0) {
            badRecursive(r);
        }
        return r;
    }
}

