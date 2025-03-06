package Ex01.model;
public class ClassBook {
    String title;
    int year;
    ClassAuthor author;
    String publisher;
    public ClassBook(String title, int year, String publisher, String authorName, int birthDate, String degree){
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        author = new ClassAuthor(authorName, birthDate, degree);
    }
    public void showBookInfo(){
        System.out.printf("%nTitle: %s \nPublication Date (Year): %d \nAuthor: " + author.name, title, year);
        System.out.printf("\nPublisher: %s %n", publisher);
    }
}