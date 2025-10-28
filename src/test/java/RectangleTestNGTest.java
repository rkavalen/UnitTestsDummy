import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RectangleTestNGTest {
    @Test
    public void constructorAndGetLengthTest() {
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        assertEquals("ConstructorAndGetLength test failure", 3.0, rectangle.getLength(), 0.00001);
    }

    @Test
    public void constructorAndGetWidthTest() {
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        assertEquals("ConstructorAndGetWidth test failure", 5.0, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void setLengthAndGetLengthTest() {
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        rectangle.setLength(4.0);
        assertEquals("SetLengthAndGetLength test failure", 4.0, rectangle.getLength(), 0.00001);
    }

    @Test
    public void setWidthAndGetWidthTest() {
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        rectangle.setWidth(6.0);
        assertEquals("SetWidthAndGetWidth test failure", 6.0, rectangle.getWidth(), 0.00001);
    }

    @Test
    public void getAreaTest() {
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        assertEquals("SetWidthAndGetWidth test failure", 15.0, rectangle.getArea(), 0.00001);
    }
}
