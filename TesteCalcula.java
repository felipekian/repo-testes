import org.junit.*;

public class TesteCalcula extends TestCase{

    public static final int DELTA = 1;

    public void testSoma(){

        Calcula aut = new Calcula();

        assertEquals(4, aut.soma(2,2), DELTA);
    }
}
