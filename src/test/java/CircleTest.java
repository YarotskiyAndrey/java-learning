import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle circle;

    @Before
    public void init() {
        circle = new Circle(10);
    }

    @Test
    public void getPerimeterTest() {
        assertEquals(circle.getPerimeter(),(Math.PI*2*10), 0);
    }
    @Test
    public void getAreaTest(){
        assertEquals(circle.getArea(),Math.PI*100,0);
    }

}
