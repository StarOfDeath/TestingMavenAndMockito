package mx.iteso;

/**
 * Created by lamos on 9/5/2016.
 */
import org.junit.Test;

import static mx.iteso.Foo.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MockitoHelloWorldExampleTest {
    @Test
    public void fooGreets() {
        Foo foo = mock(Foo.class);
        when(foo.greet()).thenReturn(HELLO_WORLD);
        System.out.println("Foo greets: " + foo.greet());
        assertEquals(foo.greet(), HELLO_WORLD);
    }
}