import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(2, 3);
    }

    @Test
    public void getAddition(){
        assertEquals(5, calculator.getAddition());
    }

    @Test
    public void getDivision(){
        Calculator calculator = new Calculator(6,2);
        assertEquals(3, calculator.getdivision());
    }

    @Test
    public void getSubtraction(){
        assertEquals(-1, calculator.getSubtraction());
    }

    @Test
    public void getMultiplication(){
        assertEquals(6, calculator.getMultiplication());
    }


}
