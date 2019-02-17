package pl.sda.library.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class LibraryTest {

    @Test
    public void shouldAddBookWhenListOfBooksExist() {
        //given
        Library library = new Library();
        library.setMedia(new LinkedList<Book>());
        Book book = new PaperBookBuilder().title("W pustynie i w puszczy").build();
        book.setTitle("Mistrz i Małgorzata");
        //when
        library.addMedia(book);
        //then
        Assert.assertEquals(Arrays.asList(book), library.getMedia());

    }

    @Test
    public void shouldAddBookWhenListOfBooksIsNull() {
        //given
        Library library = new Library();

        Book book = new PaperBookBuilder().title("Mistrz i Małgorzata").build();
        book.setTitle("Mistrz i Małgorzata");
        //when
        library.addMedia(book);
        //then
        Assert.assertEquals(Arrays.asList(book), library.getMedia());
    }
}
