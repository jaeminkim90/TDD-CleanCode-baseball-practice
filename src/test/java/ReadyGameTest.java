import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> computerNumber = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThat(computerNumber.size()).isEqualTo(3);
        for (Integer number : computerNumber) {
            assertThat(number.getClass().getSimpleName()).isEqualTo("Integer");
        }
    }

    @Test
    void splitNumberTest() {

    }


    @Test
    void validateNumberTest() {

    }
}