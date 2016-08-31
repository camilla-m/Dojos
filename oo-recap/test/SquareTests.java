import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTests {

    @Test
    public void shouldGetAreaWhenLengthIsOne() throws Exception {
        Square square = new Square(1);

        assertEquals(1, square.getArea(),0.01);
    }

//    @Test
//    public void shouldGetAreaWhenLengthIsOne() throws Exception {
//        Square square = new Square(1);
//
//        assertEquals(1, square.getArea(),0.01);
//    }

}
