package methodLesson;
import java.util.*;

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