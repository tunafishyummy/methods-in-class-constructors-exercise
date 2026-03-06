package Group4_Base_5_module3_exercise3_3_methodsInClassConstructors;

import javax.swing.JOptionPane;

/*
Galang, Patrick James
Garcia, Dolf Philippe
Lamio, Adinoel Rodge
Payawal, Matthew James
Ramos, Erus
ITE 012-CS12S4
March 6, 2026
Topic: Application of Methods in Class Constructors
*/

public class Runner {
    public static void main(String[] args) {

    int bookId = Integer.parseInt(JOptionPane.showInputDialog("Enter Book ID:"));
    String title = JOptionPane.showInputDialog("Enter Book Title:");
    String ISBN = JOptionPane.showInputDialog("Enter Book ISBN:");
    String Category = JOptionPane.showInputDialog("Enter Book Category:");

    //Book Object
    Book book1 = new Book(bookId, title, ISBN, Category);

    //Author Object
    Author author1 = new Author(authorId, lastName, firstName);
}
}
