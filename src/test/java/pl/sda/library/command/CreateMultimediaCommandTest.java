package pl.sda.library.command;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.sda.library.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CreateMultimediaCommandTest {
    public static final String TEST_AUDIO_BOOK_INPUT = "AudioBook\nChłopaki Anansiego\nNeil\nGeaiman\nMP3\n100\n";
    public static final String TEST_PAPER_BOOK_INPUT = "PaperBook\nChłopaki Anansiego\nNeil\nGeaiman\nHARD\n130\n";
    public static final String TEST_MOVIE_INPUT = "Movie\nPrzed wschodem Słońca\nJuly\nDelphy\n120\n";
    public static final String TEST_MAGAZINE_INPUT = "Magazine\nProgramista\n10\n90\n";
    private InputStream inputStream;

    @Before
    public void setUp() {
        inputStream = System.in;
    }

    @After
    public void tearDown() {
        System.setIn(inputStream);
    }

    @Test
    public void shouldCreateAudioBookWhenAudioBookWasTyped() {
        //given
        System.setIn(new ByteArrayInputStream(TEST_AUDIO_BOOK_INPUT.getBytes()));
        Library<Multimedia> library = new Library<>();
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new CreateMultimediaCommand(library, printStreamMock);

        //when
        command.execute();
        AudioBook audioBook = new AudioBookBuilder()
                .title("Chłopaki Anansiego")
                .authorFirstName("Neil")
                .authorLastName("Geaiman")
                .format(Format.MP3)
                .duration(110)
                .build();

        //then
        Library<Multimedia> expectedLibrary = new Library<>();
        expectedLibrary.addMedia(audioBook);
        assertEquals(expectedLibrary, library);
        verify(printStreamMock, times(1)).println("Typ:");
        verify(printStreamMock, times(1)).println("Tytuł:");
        verify(printStreamMock, times(1)).println("Imię autora:");
        verify(printStreamMock, times(1)).println("Nazwisko autora:");
        verify(printStreamMock, times(1)).println("Format:");
        verify(printStreamMock, times(1)).println("Czas trwania:");
    }

    @Test
    public void shouldCreatePaperBookWhenAudioBookWasTyped() {
        //given
        System.setIn(new ByteArrayInputStream(TEST_PAPER_BOOK_INPUT.getBytes()));
        Library<Multimedia> library = new Library<>();
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new CreateMultimediaCommand(library, printStreamMock);
        //when
        command.execute();
        PaperBook paperBook = new PaperBookBuilder()
                .title("Chłopaki Anansiego")
                .authorFirstName("Neil")
                .authorLastName("Geaiman")
                .cover(CoverKind.HARD)
                .build();
        //then
        Library<Multimedia> expectedLibrary = new Library<>();
        expectedLibrary.addMedia(paperBook);
        assertEquals(expectedLibrary, library);
        verify(printStreamMock, times(1)).println("Typ:");
        verify(printStreamMock, times(1)).println("Tytuł:");
        verify(printStreamMock, times(1)).println("Imię autora:");
        verify(printStreamMock, times(1)).println("Nazwisko autora:");
        verify(printStreamMock, times(1)).println("Cover:");
        verify(printStreamMock, times(1)).println("Liczba stron:");
    }

    @Test
    public void shouldCreateMovieWhenMovieTypeWasTyped() {
        System.setIn(new ByteArrayInputStream(TEST_MOVIE_INPUT.getBytes()));
        Library<Multimedia> library = new Library<>();
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new CreateMultimediaCommand(library, printStreamMock);
        //when
        command.execute();
        Movie movie = new MovieBuilder()
                .title("Przed wschodem słońca")
                .directorFirstName("July")
                .directorLastName("Delphy")
                .duration(120)
                .build();
        //then
        Library<Multimedia> expectedLibrary = new Library<>();
        expectedLibrary.addMedia(movie);
        assertEquals(expectedLibrary, library);
        verify(printStreamMock, times(1)).println("Typ:");
        verify(printStreamMock, times(1)).println("Tytuł:");
        verify(printStreamMock, times(1)).println("Imię reżysera:");
        verify(printStreamMock, times(1)).println("Nazwisko reżysera:");
        verify(printStreamMock, times(1)).println("Duration:");

    }

    @Test
    public void shouldCreateMagazineWhenAudioBookWasTyped() {
        //given
        System.setIn(new ByteArrayInputStream(TEST_MAGAZINE_INPUT.getBytes()));
        Library<Multimedia> library = new Library<>();
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new CreateMultimediaCommand(library, printStreamMock);
        //when
        command.execute();
        Magazine magazine = new MagazineBuilder()
                .title("Programista")
                .number(10)
                .pageCount(90)
                .build();
        //then
        Library<Multimedia> expectedLibrary = new Library<>();
        expectedLibrary.addMedia(magazine);
        assertEquals(expectedLibrary, library);
        verify(printStreamMock, times(1)).println("Typ:");
        verify(printStreamMock, times(1)).println("Tytuł:");
        verify(printStreamMock, times(1)).println("Liczba stron:");
    }
}