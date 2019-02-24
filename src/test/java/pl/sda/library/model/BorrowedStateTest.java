package pl.sda.library.model;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

public class BorrowedStateTest {

    @Test
    public void shouldNotBorrowBookWhenIsBorrowed(){
        //given
        PrintStream printStreamMock = Mockito.mock(PrintStream.class);
        BorrowedState state = new BorrowedState(printStreamMock);
        String firstName1 = "Gloria";
        String lastName1 = "Feria";
        state.setFirstName(firstName1);
        state.setLastName(lastName1);
        String firstName2 = "Asmel";
        String lastName2 = "Wings";
        //when
        MultimediaState multimediaState = state.borrowMultimedia(firstName2,lastName2);
        //then
        assertTrue(multimediaState instanceof BorrowedState);
        assertEquals(firstName1, ((BorrowedState) multimediaState).getFirstName());
        assertEquals(lastName1, ((BorrowedState) multimediaState).getLastName());
        verify(printStreamMock, only())//
                .println("Książka jest wypożyczona");
    }

    @Test public void shouldReturnBookWhenIsBorrowed() {
        // given
        PrintStream printStreamMock = Mockito.mock(PrintStream.class);
        BorrowedState state = new BorrowedState(printStreamMock);
        // when
        MultimediaState multimediaState = state.returMultimedia();
        // then
        assertTrue(multimediaState instanceof ReturnedState);
        verify(printStreamMock, never()).println(anyString());
    }

}