import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import stringCalculator.StringCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReadyGameTest {

    @Test
    void inputUserNumberTest() {

        String userNumber = "123";// Sacanner를 통해 사용자가 3자리 수를 입력했다고 가정
        assertThat(userNumber.length()).isEqualTo(3);

    }

    @Test
    void creatRandomNumberTest() {
        List<Integer> computerNumber = ReadyGame.creatRandomNumber();
        SoftAssertions softly = new SoftAssertions();

        assertThat(computerNumber.size()).isEqualTo(3); // 3자리 숫자 확인

        for (Integer number : computerNumber) {
            assertThat(number > 0 && number < 10).isEqualTo(true); // 각 숫자의 범위가 1~10에 해당하는지 확인
            assertThat(Collections.frequency(computerNumber, number)).isEqualTo(1); // 해당 값이 1개만 존재
        }
    }

    @Test
    void splitNumberTest() {
//        String userNumber = "123";
//
//        List<Integer> userNumberList = ReadyGame.
//                String[]values = StringCalculator.splitString(userString);
//        // splitString에 문자열 원형을 넣으면 문자 단위로 쪼개진 배열을 반환한다.
//
//        assertThat(Arrays.toString(values)).isEqualTo("[1, +, 2, +, 3]");
//
//
//        userNumber.split("");

    }


    @Test
    void validateNumberTest() {

    }
}