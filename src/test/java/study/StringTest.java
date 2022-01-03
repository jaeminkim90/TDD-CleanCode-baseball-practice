package study;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static jdk.internal.org.jline.utils.Colors.s;
import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
        // test commit
    }

    @Test
    void split() {
        String[] actual1 = "1".split(",");
        assertThat(actual1).contains("1");
        System.out.println(Arrays.toString(actual1));

        String[] actual2 = "1,2".split(",");
        assertThat(actual2).contains("1","2");
        System.out.println(Arrays.toString(actual2));
    }



}
