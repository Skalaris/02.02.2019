package pl.sda.library.command;

import pl.sda.library.model.AudioBookBuilder;
import pl.sda.library.model.Format;
import pl.sda.library.model.MagazineBuilder;
import pl.sda.library.model.Multimedia;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

class CreateMagazineCommandStrategy implements CreateMultimediaStrategy {

    public static final String MAGAZINE = "Magazine";
    @Override
    public Multimedia createMultimedia(Scanner scanner, PrintStream printStream) {
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Numer:");
        int number = scanner.nextInt();
        printStream.println("Liczba stron:");
        int pageCount = scanner.nextInt();
        scanner.nextLine();
        return new MagazineBuilder()//
                .title(title)
                .number(number)
                .pageCount(pageCount)//
                .build();
    }
    @Override
    public boolean isTypeCorrect(String type) {
        return Objects.equals(type,MAGAZINE);
    }
}
