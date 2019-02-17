package pl.sda.library;
import pl.sda.library.model.*;

public class Main {
    public static void main(String[] args) {
        Library<Multimedia> library = new Library<>();
        //Library<AudioBook> library1 = new Library<>();
        library.addMedia(new PaperBookBuilder().
                authorFirstName("Carrol").
                authorLastName("Lewis")
                .title("Lew,czarownica i stara szafa")
                .cover(CoverKind.HARD)
                .build());
        library.addMedia(new PaperBookBuilder().
                authorFirstName("Michaił").
                authorLastName("Bułhakov")
                .title("Mistrz i Małgorzata")
                .cover(CoverKind.HARD)
                .build());
        library.addMedia(new PaperBookBuilder().
                authorFirstName("Aghata").
                authorLastName("Christie")
                .title("I nie było już nikogo")
                .cover(CoverKind.HARD)
                .build());
        library.addMedia(new PaperBookBuilder().
                authorFirstName("Neil").
                authorLastName("Geiman")
                .title("Chłopaki Anansiego")
                .cover(CoverKind.HARD)
                .build());
        library.addMedia(new PaperBookBuilder().
                authorFirstName("Terry").
                authorLastName("Prachett")
                .title("Dobry Omen")
                .cover(CoverKind.HARD)
                .build());
        library.addMedia(new AudioBookBuilder().
                authorFirstName("Carrol").
                authorLastName("Lewis")
                .title("Lew,czarownica i stara szafa")
                .format(Format.MP3)
                .build());
        library.addMedia(new AudioBookBuilder().
                authorFirstName("Michaił").
                authorLastName("Bułhakov")
                .title("Mistrz i Małgorzata")
                .format(Format.MP3)
                .build());
        library.addMedia(new AudioBookBuilder().
                authorFirstName("Aghata").
                authorLastName("Christie")
                .title("I nie było już nikogo")
                .format(Format.MP3)
                .build());
        library.addMedia(new AudioBookBuilder().
                authorFirstName("Neil").
                authorLastName("Geiman")
                .title("Chłopaki Anansiego")
                .format(Format.MP3)
                .build());
        library.addMedia(new AudioBookBuilder().
                authorFirstName("Terry").
                authorLastName("Prachett")
                .title("Dobry Omen")
                .format(Format.MP3)
                .build());
        library.addMedia(new MagazineBuilder()
                .title("Motor")
                .number(21)
                .pageCount(133)
                .build());
        library.addMedia(new MagazineBuilder()
                .title("PCGames")
                .number(66)
                .pageCount(200)
                .build());
        library.addMedia(new MagazineBuilder()
                .title("Ogród")
                .number(159)
                .pageCount(130)
                .build());
        library.addMedia(new MovieBuilder()
                .title("Przed wschodem słonca")
                .directorFirstName("Juliet")
                .directorLastName("Delphy")
                .duration(95)
                .build());
        library.addMedia(new MovieBuilder()
                .title("Przed zachodem słonca")
                .directorFirstName("Juliet")
                .directorLastName("Delphy")
                .duration(102)
                .build());
        library.addMedia(new MovieBuilder()
                .title("Swięci z bostonu")
                .directorFirstName("Non")
                .directorLastName("Name")
                .duration(100)
                .build());

        library.getMedia().forEach(System.out::println);


        /*for(Multimedia book: library.getMedia()){
            System.out.println(book);*/



    }
}
