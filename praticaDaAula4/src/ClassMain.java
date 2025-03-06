public class ClassMain {
    public static void main(String[] args) {
        /*
        ClassPorteiro p1 = new ClassPorteiro("123", "Jose", 8);
        ClassPorteiro p2 = new ClassPorteiro("456", "Joao", 10);
        ClassPorteiro p3 = new ClassPorteiro("789", "Julio", 12);
        */
        ClassPorteiro p1 = ClassPorteiro.getInstanciado("123", "João", 8);
        ClassPorteiro p2 = ClassPorteiro.getInstanciado("456", "José", 8);

        System.out.println("p1: " + p1.nome);
        System.out.println("p2: " + p2.nome); // não é josé por conta de porteiro ser único.
    }
}
