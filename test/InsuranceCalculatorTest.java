import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {
    InsuranceCalculator insuranceCalculator = new InsuranceCalculator();

    @Test
    public void low(){
        double lowResult = insuranceCalculator.calculateInsurance(5000);
        Assertions.assertEquals(1825.0, lowResult);
    }

    @Test
    public void medium(){
        double mediumResult = insuranceCalculator.calculateInsurance(25000);
        Assertions.assertEquals(38600.0, mediumResult);
    }

    @Test
    public void high(){
        double highResult = insuranceCalculator.calculateInsurance(50000);
        Assertions.assertEquals(78500.0, highResult);
    }

    @Test
    public void veryHigh(){
        double vHighResult = insuranceCalculator.calculateInsurance(100_000);
        Assertions.assertEquals(106400.0, vHighResult);
    }
}