import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateMethodsTest {
    CalculateMethods cal = new CalculateMethods();
    @Test
    public void dev(){
        assertEquals(2, cal.divide(10,5));
    }
}
