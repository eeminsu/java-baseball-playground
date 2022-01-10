package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    //요구사항 1
    @Test
    void size(){
        int setSize = numbers.size();
        assertThat(setSize).isEqualTo(3);
    }

    //요구사항 2
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int index){
        assertThat(numbers.contains(index)).isTrue();
    }

    //요구사항 3
    @ParameterizedTest
    @CsvSource(value = {"1,true","2,true","3,true","4,false","5,false"})
    void containsEquals(int number, boolean expected){
        assertThat(numbers.contains(number)).isEqualTo(expected);
    }


}
