package Important;

public class Book {

    String nameOfTheBooks;
    int id;
    String authorName;
    String dateOfPublish;

      /*a student class constructor is used to pass the details of a student
        at the time you create an object. And toString() method is used to print
    the object’s information name, grade and email.*/

    public Book(String nameOfTheBooks, int id, String authorName, String dateOfPublish) {
        this.nameOfTheBooks = nameOfTheBooks;
        this.id = id;
        this.authorName = authorName;
        this.dateOfPublish = dateOfPublish;
    }

    public String getNameOfTheBooks() {
        return nameOfTheBooks;
    }

    public int getId() {
        return id;
    }

    public String getAuthorsName(){
        return authorName;
    }

    public String getDateOfPublish(){
        return dateOfPublish;
    }

}
