import java.util.Arrays;
import java.util.Scanner;

public class StringCalculator {


    public static int calculator(String userString) {


        // 1. 입력
        String actual = userString;

        // 2. 분리
        String[] values = actual.split(" ");
        System.out.println("쪼개진 문자 식: " + Arrays.toString(values));


        // 3. 순차적으로 계산
        int surNumber = 0;
        int result = 0;

        for (int i = 2; i < values.length; i++) {
            int tempResult = 0;
            surNumber = (Integer.parseInt(values[i]));


            if (i == 2) {
                result = (Integer.parseInt(values[i - 2]));
            }

            if (values[i - 1].equals("+")) {
                tempResult = (result + surNumber);
            } else if (values[i - 1].equals("-")) {
                tempResult = (result - surNumber);
            } else if (values[i - 1].equals("*")) {
                tempResult = (result * surNumber);
            } else if (values[i - 1].equals("/")) {
                tempResult = (result / surNumber);
            }


            result = tempResult;
            i++; // 연산 기호는 뛰어 넘고 숫자만 다루기 위해 i++
        }

        // 4. 결과 출력
        return result;
    }

    public static void main(String[] args) {
        calculator("1 + 2 + 3");
    }


    public static String[] splitString(String userString) {

        return userString.split(" ");

    }
}
