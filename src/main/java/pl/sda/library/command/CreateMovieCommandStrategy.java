package pl.sda.library.command;

import pl.sda.library.model.AudioBookBuilder;
import pl.sda.library.model.Format;
import pl.sda.library.model.MovieBuilder;
import pl.sda.library.model.Multimedia;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

class CreateMovieCommandStrategy implements CreateMultimediaStrategy {

    public static final String MOVIE = "Movie";
    @Override
    public Multimedia createMultimedia(Scanner scanner, PrintStream printStream) {
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Imię reżysera:");
        String directorFirstName = scanner.nextLine();
        printStream.println("Nazwisko reżysera:");
        String directorLastName = scanner.nextLine();
        printStream.println("Czas trwania:");
        int duration = scanner.nextInt();
        scanner.nextLine();
        return new MovieBuilder()//
                .title(title)//
                .directorFirstName(directorFirstName)//
                .directorLastName(directorLastName)//
                .duration(duration)//
                .build();
    }
    @Override
    public boolean isTypeCorrect(String type) {
        return Objects.equals(type,MOVIE);
        //return MOVIE.equals(type);
    }
}
