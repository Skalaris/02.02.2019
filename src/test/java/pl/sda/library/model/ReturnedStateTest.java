package pl.sda.library.model;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.only;

public class ReturnedStateTest {

    @Test
    public void shouldBorrowBookWhenIsreturned(){
        //given
        PrintStream printStreamMock = mock(PrintStream.class);
        MultimediaState state = new ReturnedState(printStreamMock);
        String firstName = "Gloria";
        String lastName = "Feria";
        //when
        MultimediaState multimediaState = state.borrowMultimedia(firstName,lastName);
        //then
        assertTrue( multimediaState instanceof BorrowedState);
        assertEquals(firstName,((BorrowedState)multimediaState).getFirstName());
        assertEquals(lastName,((BorrowedState)multimediaState).getLastName());

    }

    @Test
    public void shouldNotReturnBookWhenIsReturned(){
        //given
        PrintStream printStreamMock = mock(PrintStream.class);
        MultimediaState state = new ReturnedState(printStreamMock);
        String firstName = "Gloria";
        String lastName = "Feria";
        //when
        MultimediaState multimediaState = state.returMultimedia();
        //then
        assertTrue(multimediaState instanceof ReturnedState);
        //verify(printStreamMock,only().)
    }

}