package pl.sda.library;
import pl.sda.library.model.*;

public class Main {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();
        //Library<AudioBook> library1 = new Library<>();
        library.addBook(new PaperBookBuilder().
                authorFirstName("Carrol").
                authorLastName("Lewis")
                .title("Lew,czarownica i stara szafa")
                .cover(CoverKind.HARD)
                .build());
        library.addBook(new PaperBookBuilder().
                authorFirstName("Michaił").
                authorLastName("Bułhakov")
                .title("Mistrz i Małgorzata")
                .cover(CoverKind.HARD)
                .build());
        library.addBook(new PaperBookBuilder().
                authorFirstName("Aghata").
                authorLastName("Christie")
                .title("I nie było już nikogo")
                .cover(CoverKind.HARD)
                .build());
        library.addBook(new PaperBookBuilder().
                authorFirstName("Neil").
                authorLastName("Geiman")
                .title("Chłopaki Anansiego")
                .cover(CoverKind.HARD)
                .build());
        library.addBook(new PaperBookBuilder().
                authorFirstName("Terry").
                authorLastName("Prachett")
                .title("Dobry Omen")
                .cover(CoverKind.HARD)
                .build());
        library.addBook(new AudioBookBuilder().
                authorFirstName("Carrol").
                authorLastName("Lewis")
                .title("Lew,czarownica i stara szafa")
                .format(Format.MP3)
                .build());
        library.addBook(new AudioBookBuilder().
                authorFirstName("Michaił").
                authorLastName("Bułhakov")
                .title("Mistrz i Małgorzata")
                .format(Format.MP3)
                .build());
        library.addBook(new AudioBookBuilder().
                authorFirstName("Aghata").
                authorLastName("Christie")
                .title("I nie było już nikogo")
                .format(Format.MP3)
                .build());
        library.addBook(new AudioBookBuilder().
                authorFirstName("Neil").
                authorLastName("Geiman")
                .title("Chłopaki Anansiego")
                .format(Format.MP3)
                .build());
        library.addBook(new AudioBookBuilder().
                authorFirstName("Terry").
                authorLastName("Prachett")
                .title("Dobry Omen")
                .format(Format.MP3)
                .build());
        for(Book book: library.getListOfBooks()){
            System.out.println(book);


        }
    }
}
