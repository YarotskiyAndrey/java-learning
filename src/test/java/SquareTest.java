import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    Square square;
    @Before
    public void init(){
        square = new Square(5);
    }
    @Test
    public void getPerimeterTest() {
        assertEquals(square.getPerimeter(),5*4, 0);
    }
    @Test
    public void getAreaTest(){
        assertEquals(square.getArea(),5*5,0);
    }

}
