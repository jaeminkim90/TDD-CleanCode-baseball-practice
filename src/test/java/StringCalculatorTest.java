import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("문자열을 받아서 분리하는 테스트")
    void splitStringTest() {
        String userString = "1 + 2 + 3";

        String[] values = StringCalculator.splitString(userString);
        // splitString에 문자열 원형을 넣으면 문자 단위로 쪼개진 배열을 반환한다.

        assertThat(Arrays.toString(values)).isEqualTo("[1, +, 2, +, 3]");

    }
}