package pl.sda.library.command;

import pl.sda.library.model.Library;
import pl.sda.library.model.Multimedia;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FilterByTypeCommand implements Command {

    private final Library<Multimedia> library;

    private final PrintStream printStream;

    public FilterByTypeCommand(Library<Multimedia> library,  PrintStream printStream) {
        this.library = library;

        this.printStream = printStream;
    }

    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        printStream.println("Type:");
        String type = scanner.nextLine();
        for (Multimedia multimedia :library.getMedia() ) {
            if(multimedia.getClass().getSimpleName().equals(type)){
                printStream.println(multimedia);
            }

        }

    }
}
