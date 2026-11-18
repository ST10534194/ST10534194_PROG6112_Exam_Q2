import org.junit.Test;
import static org.junit.Assert.*;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expected = 525.0;
        double actual = calc.GetVat();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void GetCommission_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expected = 175.0;
        double actual = calc.GetCommission();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expected = 4200.0;
        double actual = calc.GetTotal();
        assertEquals(expected, actual, 0.01);
    }
}