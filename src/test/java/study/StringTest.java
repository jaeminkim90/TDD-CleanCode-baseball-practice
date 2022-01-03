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

    // 테스트 요구사항
    // "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
    // "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
    @Test
    void split() {
        String[] actual1 = "1".split(",");
        assertThat(actual1).contains("1");
        System.out.println(Arrays.toString(actual1));

        String[] actual2 = "1,2".split(",");
        assertThat(actual2).contains("1","2");
        assertThat(actual2).containsExactly("1","2");
        System.out.println(Arrays.toString(actual2));
    }

    // 테스트 요구사항
    // "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
    @Test
    void substring() {
        String actual = "(1,2)";
        actual = actual.substring(1);
        actual = actual.substring(0,3);
        System.out.println(actual);
        assertThat(actual).isEqualTo("1,2");
     }





}
