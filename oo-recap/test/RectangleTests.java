import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTests {

    @Test
    public void shouldGetTheAreaWhenLengthIsOneAndWidthIsTwo() throws Exception{
        double length = 1.0;
        double width = 2.0;
        Rectangle rectangle = new Rectangle(length,width);

        assertEquals(length * width,rectangle.getArea(),0.01);
    }

    @Test
    public void shouldGetTheAreaWhenLengthIsTwoAndWidthIsThree() throws Exception{
        double length = 2.0;
        double width = 3.0;
        Rectangle rectangle = new Rectangle(length,width);

        assertEquals(length * width,rectangle.getArea(), 0.01);
    }
}
