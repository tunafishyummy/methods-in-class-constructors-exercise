package Group4_Base_5_module3_exercise3_3_methodsInClassConstructors;

public class Book {
    int bookId;
    String title;
    String ISBN;
    String category;

    public Book(int bookId, String title, String ISBN, String category){
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.category = category;
}
public int getbookId() {return bookId;}
public String getTitle() {return title;}
public String getISBN() {return ISBN;}
public String getCategory() {return category;}
}