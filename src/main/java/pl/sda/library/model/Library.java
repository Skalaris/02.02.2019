package pl.sda.library.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Library<T extends Book> {

    private List<T> listOfBooks;

    public List<T> getListOfBooks() {//chcemy zeby geter zwrócił niemodyfikowalną listę
        return Collections.unmodifiableList(listOfBooks);
    }

    public void setListOfBooks(List<T> listOfBooks) {
        this.listOfBooks = new LinkedList<>(listOfBooks);
    }

    public void addBook(T book) {
        if (listOfBooks == null) {
            listOfBooks = new LinkedList<>();
        }
        listOfBooks.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(listOfBooks, library.listOfBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfBooks);
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfBooks=" + listOfBooks +
                '}';
    }
}
