package Ex01.controller;
import Ex01.model.ClassBook;
public class ClassTest {
    public ClassTest(){
        super();
    }
    public void test(){
        ClassBook book1 = new ClassBook("java is realy fun", 2025, "Globo Livros", "Luvas", 1111, "FNA");
        ClassBook book2 = new ClassBook("How to create a good name", 2026, "Globo Livros", "Julius", 1110, "MFNU");
        book1.showBookInfo();
        book2.showBookInfo();
    }
}
