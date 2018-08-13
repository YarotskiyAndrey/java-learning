import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rectangle;
    @Before
    public void init(){
        rectangle = new Rectangle(3,4);
    }
    @Test
    public void getPerimeterTest() {
        assertEquals(rectangle.getPerimeter(),2*(3+4), 0);
    }
    @Test
    public void getAreaTest(){
        assertEquals(rectangle.getArea(),3*4,0);
    }
}
