package pl.sda.library.model;

import java.io.PrintStream;
import java.util.Objects;

public class BorrowedState implements MultimediaState {

    private final PrintStream printStream;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BorrowedState(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public MultimediaState borrowMultimedia(String firstName, String lastName) {
        printStream.println("Książka jest wypożyczona");
        return this;
    }

    @Override
    public MultimediaState returMultimedia() {
        return new  ReturnedState(printStream);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BorrowedState state = (BorrowedState) o;
        return Objects.equals(printStream, state.printStream) &&
                Objects.equals(firstName, state.firstName) &&
                Objects.equals(lastName, state.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(printStream, firstName, lastName);
    }

    @Override
    public String toString() {
        return "BorrowedState{" +
                "printStream=" + printStream +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
