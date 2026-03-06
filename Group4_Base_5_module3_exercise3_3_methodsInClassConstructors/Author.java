package Group4_Base_5_module3_exercise3_3_methodsInClassConstructors;

public class Author {
    int authorId;
    String lastName;
    String firstName;

    public Author(int authorId, String lastName, String firstName){
        this.authorId = authorId;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public int getAuthorId() {return authorId;}
    public String getlastName() {return lastName;}
    public String getfirstName() {return firstName;}
}
