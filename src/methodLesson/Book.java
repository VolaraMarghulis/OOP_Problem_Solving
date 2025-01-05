package methodLesson;

    //class -Book- that inherits another class -Product-
public class Book extends Product {
    //Instance Viariables
    private String title;
    private String author;
    private String publisher;
    //Constructor of the -book- class
    public Book(String title, String author, String publisher, int price){
    // call the constructor of the -Product- class
        super(price);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public String toString(){
        // Provide a string representation of a -book- object
        return "{title = " + this.title + ", author = " + this.author
                + " , publisher = " + this.publisher +" , price = " + getPrice() + "}";
    }
}
