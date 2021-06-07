package Smoothstack;
import static org.junit.Assert.*;
import org.junit.After;

public class LineTest {

    private Line line;

    @BeforeEach
    public void setUp() throws Exception {
        line = new Line(double x0, double y0, double x1, double y1);
    }

    @Test
    @DisplayName("Test to get the slope")
    public void testGetSlope() {
        assertEquals(10, line(1, 1, 2, 11).getSlope(), .0001); // delta-y = 10, delta-x = 1
    }

    @Test
    @DisplayName("Test to throw ArithmeticExcpetion for division by 0")
    public void testArithmeticException() {
        Throwable exception = assertThrows(ArithmeticException.class, line(1, 1, 1, 11)) // x1 == x0 (1-1)
    }

    @Test
    @DisplayName("Test to check that getDistance works")
    public void testGetDistance() {
        assertEquals(10, line(10, 10, 110, 110).getDistance(), .0001)
    }

    @Test
    @DisplayName("Test to check that parallel to works")
    public void testParallelTo() {
        assertTrue(line(1, 1, 2, 2).parallelTo(2, 2, 4, 4))
    }
}