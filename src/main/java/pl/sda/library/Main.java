package pl.sda.library;

import pl.sda.library.model.BookBuilder;
import pl.sda.library.model.Library;

import pl.sda.library.model.Book;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new BookBuilder().
                authorFirstName("Carrol").
                authorLastName("Lewis")
                .title("Lew,czarownica i stara szafa")
                .build());
        library.addBook(new BookBuilder().
                authorFirstName("Michaił").
                authorLastName("Bułhakov")
                .title("Mistrz i Małgorzata")
                .build());
        library.addBook(new BookBuilder().
                authorFirstName("Aghata").
                authorLastName("Christie")
                .title("I nie było już nikogo")
                .build());
        library.addBook(new BookBuilder().
                authorFirstName("Neil").
                authorLastName("Geiman")
                .title("Chłopaki Anansiego")
                .build());
        library.addBook(new BookBuilder().
                authorFirstName("Terry").
                authorLastName("Prachett")
                .title("Dobry Omen")
                .build());
        for(Book book: library.getListOfBooks()){
            System.out.println(book);


        }
    }
}
