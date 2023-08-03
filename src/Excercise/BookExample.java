package Excercise;

public class BookExample  {
    public static void main(String[] args) {
        Book book = new Book("Java: The complete Reference, Twlefth Edition", "Herbert Schildt", 2021);
       

        System.out.println("Book Title: " + book.gettitle());
        System.out.println("Author: " + book.getauthor());
        System.out.println("Publication Year: " + book.getpublicationYear());

      
    }
}
