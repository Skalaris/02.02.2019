package pl.sda.library.command;

import pl.sda.library.model.Library;
import pl.sda.library.model.Multimedia;
import pl.sda.library.model.MultimediaState;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class BorrowMultimediaCommand implements Command {

    private final Library<Multimedia> library;
    private final PrintStream printStream;

    public BorrowMultimediaCommand(Library<Multimedia> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Tytuł:");
        String title = scanner.nextLine();
        printStream.println("Imię osoby wypożyczającej:");
        String firstName = scanner.nextLine();
        printStream.println("Nazwisko osoby wypożyczającej:");
        String lastName = scanner.nextLine();
        Optional<Multimedia> multimedia = library.getMedia().stream()
                .filter(m-> Objects.equals(m.getTitle(),title))
                .findFirst();
        Optional<MultimediaState> state =multimedia.map(m->m.getState().borrowMultimedia(firstName,lastName));
        multimedia.ifPresent(m->m.setState(state.get()));
        if(!multimedia.isPresent()){
            printStream.println("Książka nie istnieje");
        }

    }
}
