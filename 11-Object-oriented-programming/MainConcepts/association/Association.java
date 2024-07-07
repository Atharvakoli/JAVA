package MainConcepts.association;

public class Association {
    public static void main(String[] args) {

    }
}

class Library {
    // private List<Book> books;

    // public Library(List<Book> books) {
    // this.books = books;
    // }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}