package pl.sda.library.command;
import pl.sda.library.model.Multimedia;
import java.io.PrintStream;
import java.util.Scanner;

public interface CreateMultimediaStrategy {

    Multimedia createMultimedia(Scanner scanner, PrintStream printStream);
    boolean isTypeCorrect(String type);
}
