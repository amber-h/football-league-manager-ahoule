import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by thoughtworker on 1/16/14.
 */
public class menuTest {
    PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldDisplayOptionsWhenMenuOptionsIsCalled(){
        Menu menu = new Menu();
        menu.displayOptions(printStream);

        verify(printStream).println("1 - List of Players");
        verify(printStream).println("2 - Search for Player");
    }
}
