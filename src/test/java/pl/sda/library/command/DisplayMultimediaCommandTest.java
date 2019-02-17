package pl.sda.library.command;

import org.junit.Test;
import org.mockito.Mockito;
import pl.sda.library.model.*;

import java.io.PrintStream;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class DisplayMultimediaCommandTest {


    @Test

    public void shouldDisplayMultimediaWhenSomeMultimediaIsavailable(){
        //given
        PaperBook book = new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("W pustyni i w puszczy")
                .cover(CoverKind.HARD)
                .pageCount(300)
                .build();

                Movie movie = new MovieBuilder()
                        .directorFirstName("Władysław")
                        .directorLastName("ślesicki")
                        .title("W pustyni i w puszczy")
                        .duration(100)
                        .build();
        Library<Multimedia>library = new Library<>();
        library.addMedia(book);
        library.addMedia(movie);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new DisplayMultimediaCommand(library,printStreamMock);
        //when
        command.execute();
        //then
        verify(printStreamMock, times(1))
                .println(book);
        verify(printStreamMock, times(1))
                .println(movie);
    }

}