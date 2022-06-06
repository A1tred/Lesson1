package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator(321,123, '+');

    @Test
    void setNum1() {
        calculator.setNum1(222);
        assertEquals(222, calculator.getNum1(), () -> "Should return first operand - '222'.");
    }

    @Test
    void getNum1() {
        assertEquals(321, calculator.getNum1(), () -> "Should return first operand - '321'.");
    }

    @Test
    void setNum2() {
        calculator.setNum2(333);
        assertEquals(333, calculator.getNum2(), () -> "Should return second operand - '333'.");
    }

    @Test
    void getNum2() {
        assertEquals(123, calculator.getNum2(), () -> "Should return second operand - '123'.");
    }

    @Test
    void setOperation() {
        calculator.setOperation('-');
        assertEquals('-', calculator.getOperation(), () -> "Should return operator - '-'.");
    }

    @Test
    void getOperation() {
        assertEquals('+', calculator.getOperation(), () -> "Should return operator - '+'.");
    }

    @Test
    void getResult() {
        assertEquals(444, calculator.getResult(), () -> "Should return second operand - '444'.");
    }

    @Test
    void testToString() {
        assertEquals("Операция выполнена успешно: 321 + 123 = 444", calculator.toString(), () -> "Should return full operation.");
    }
}