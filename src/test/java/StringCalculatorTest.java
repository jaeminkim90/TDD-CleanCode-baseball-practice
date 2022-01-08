import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
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

    @Test
    @DisplayName("문자 단위로 쪼개진 배열을 받아, 숫자만 리턴하는 테스트")
    void creatNumberListTest() {
        String[] values = {"1", "+", "2", "+", "3"};
        List<Integer> expectList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<Integer> onlyNumber = StringCalculator.creatNumberList(values);
        assertThat(onlyNumber.equals(expectList)).isTrue();
    }

    @Test
    @DisplayName("문자 단위로 쪼개진 배열을 받아, 연산자만 리턴하는 테스트")
    void creatOperatorListTest() {
        String[] values = {"1", "+", "2", "-", "3"};
        List<String> expectList = new ArrayList<String>(Arrays.asList("+", "-"));
        List<String> onlyOperator = StringCalculator.creatOperatorList(values);
        assertThat(onlyOperator.equals(expectList)).isTrue();

    }

    @Test
    @DisplayName("문자 단위로 쪼개진 배열을 받아, 연산자만 리턴하는 테스트")
    void calculateTest() {
        List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<String> operatorList = new ArrayList<String>(Arrays.asList("-", "+"));
        int result = StringCalculator.calculate(numberList, operatorList);
        assertEquals(2, result);
    }
}










