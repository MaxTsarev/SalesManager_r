import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesManagerTest {

    protected long[] sales = new long[]{3, 5, 9, 1};
    SalesManager show = new SalesManager(sales);


    @Test
    public void testMax() {
        long result = 9;
        Assertions.assertEquals(result, show.max());
    }

    @Test
    public void testMin() {
        long result = 1;
        Assertions.assertEquals(result, show.min());
    }

    @Test
    public void testIndexMax() {
        long result = 3;
        Assertions.assertEquals(result, show.indexMax());
    }

    @Test
    public void testIndexMin() {
        long result = 4;
        Assertions.assertEquals(result, show.indexMin());
    }

    @Test
    public void testAverage() {
        long result = 4;
        Assertions.assertEquals(result, show.average(sales, show.indexMin(), show.indexMax()));
    }
}
