package StringCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class StringInputProcessorTest {

    static StringInputProcessor sp;

    @BeforeEach
    void setUp() {
        sp = new StringInputProcessor();
    }

    @Test
    void pick(){
        String input = "21 * 2343 / 5454 + 445";
        LinkedList operandList = new LinkedList();
        LinkedList operatorList = new LinkedList();

        LinkedList operandTest = sp.pick(input, "operand");
        LinkedList operatorTest = sp.pick(input, "operator");

        operandList.add(new Integer(21));
        operandList.add(new Integer(2343));
        operandList.add(new Integer(5454));
        operandList.add(new Integer(445));

        operatorList.add("*");
        operatorList.add("/");
        operatorList.add("+");

        assertEquals(operandTest, operandList);
        assertEquals(operatorTest, operatorList);
    }
}