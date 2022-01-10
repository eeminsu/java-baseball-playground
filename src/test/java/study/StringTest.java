package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] splitTest = "1,2".split(",");
        assertThat(splitTest).contains("1", "2");

        String[] splitTest2 = "1".split(",");
        assertThat(splitTest2).containsExactly("1");
    }

    @Test
    void subString(){
        String actual = "(1,2)".substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String Class CharAt 테스트")
    void charAt() throws Exception{
        String str = "abc";
        int index = 5;

        assertThatThrownBy(() -> str.charAt(index))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String is out of range: %d",index);
    }
}
