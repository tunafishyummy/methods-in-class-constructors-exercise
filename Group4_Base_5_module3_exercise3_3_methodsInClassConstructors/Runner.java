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
    String ISBN = JOptionPane.showInputDialog("Enter ISBN:");
    String category = JOptionPane.showInputDialog("Enter Category:");
    
    //Book Object
    Book book1 = new Book(bookId, title, ISBN, category);

    int authorId = Integer.parseInt(JOptionPane.showInputDialog("Enter Author ID:"));
    String firstName = JOptionPane.showInputDialog("Enter First Name:");
    String lastName = JOptionPane.showInputDialog("Enter Last Name:");

    Author author1 = new Author(authorId, firstName, lastName);

    JOptionPane.showMessageDialog(null, 
        "~~~~Book Details~~~~\n"+
        "ID: "+book1.getbookId()+"\n"+
        "Title: "+book1.getTitle()+"\n"+
        "ISBN: "+book1.getISBN()+"\n"+
        "Category: "+book1.getCategory()+"\n\n"+
        "~~~~Author Details~~~~\n"+
        "ID: "+author1.getAuthorId()+"\n"+
        "Name: "+author1.getfirstName()+" "+author1.getlastName());
    }
}
