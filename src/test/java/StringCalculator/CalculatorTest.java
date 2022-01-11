package StringCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator cal;

    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @Test
    void getAnswer() {
        LinkedList<Object> operandList = new LinkedList<>();
        LinkedList<Object> operatorList = new LinkedList<>();

        operatorList.add("*");
        operatorList.add("/");
        operatorList.add("+");
        operatorList.add("-");

        operandList.add(234);
        operandList.add(456);
        operandList.add(345);
        operandList.add(678);
        operandList.add(234);

        assertEquals(cal.getAnswer(operandList, operatorList), 753);

    }

}