import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTests {

    @Test
    public void shouldGetAreaWhenRadiusIsOne() throws Exception {
        Circle circle = new Circle(1.0);
        assertEquals(Math.PI * 1.0 * 1.0, circle.getArea(), 0.01);
    }

    @Test
    public void shouldGetAreaWhenRadiusIsTwo() throws Exception {
        Circle circle = new Circle(2);
        assertEquals(Math.PI * 4, circle.getArea(), 0.01);
    }

    @Test
    public void shouldGetCircumference() throws Exception {
        double radius = 1.0;
        Circle circle = new Circle(radius);
        assertEquals(2 * Math.PI * radius, circle.getCircumference(), 0.01);
    }
}
