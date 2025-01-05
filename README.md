## Problem

Define the Product class with the field **price**.

Define the **Book** class derived from the **Product** class, having additional fields **title**, **author**, and **publisher**. 

Input 5 objects of type **Book** into an array.

Search for and display the **book** with the highest **price**.

## Problem Solving
```Java
//Create Product class
public class Product {
    private int price;
    //Constructor
    public Product(int price){
        this.price = price;
    }
    //Getter Method
    public int getPrice(){
        return price;
    }
}
```
```Java
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
```
```Java
public class Main {
 public static void main(String[] args) {
        //Scanner object to read from the console
        Scanner sc = new Scanner(System.in);
        //Create an Array list to store books
        List<Book> bookList = new ArrayList<>();
        //Input the number of books
        System.out.print("Introdu numarul de carti: ");
        int numberOFBooks = Integer.parseInt(sc.nextLine());
         //input details for each books
        for (int i = 0 ; i < numberOFBooks; i++ ){
            System.out.print("Input the title for" + (i + 1) + " book: " );
            String title = sc.nextLine();
            System.out.print("Input the author for" + (i + 1) + " book: " );
            String author = sc.nextLine();
            System.out.print("Input the publisher for" + (i + 1) + " book: " );
            String publisher = sc.nextLine();
            System.out.print("Input the price for" + (i + 1) + " book: " );
            int price = Integer.parseInt(sc.nextLine());
            //Adds the book object to the bookList
            bookList.add(new Book(title, author, publisher, price));
        }
        //Find the most expensive book
        Book mostExpensiveBook = bookList.get(0);
        //Iterates from the list to compare the price of each books
        for (Book book : bookList){
            if (book.getPrice() > mostExpensiveBook.getPrice()){
        //Updates if a book with a higher price is found
                mostExpensiveBook = book;
            }
        }
        System.out.println("Most expensive book is: " + mostExpensiveBook);
    }
}
```