import org.junit.Before;
import org.junit.Test;
import org.hamcrest.core.Is;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class TraingleTest {
    Traingle acute, obtuse, right;

    @Before
    public void init() {
        acute = new Traingle(5,6,7);
        obtuse = new Traingle(2,2,10);
        right = new Traingle(3,4,5);
    }

    @Test
    public void getPerimeterTest() {
        assertThat(acute.getPerimeter(),is(18D));
    }

    @Test
    public void getAreaTest() {
        assertThat(acute.getArea(),is(14.696938456699069));
    }

    @Test
    public void getTypeTest(){
        assertThat(acute.getType(),is("Acute"));
        assertThat(obtuse.getType(),is("Obtuse"));
        assertThat(right.getType(),is("Right"));
    }

}
