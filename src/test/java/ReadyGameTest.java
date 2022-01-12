import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
    }

    @Test
    void splitNumberTest() {

    }


    @Test
    void validateNumberTest() {

    }
}