import java.util.*;

public class ReadyGame {

    public static String inputUserNumber() {
        String userNumber;
        Scanner scanner;

        scanner = new Scanner(System.in);
        userNumber = scanner.nextLine();

        return userNumber;
    }

    public static List<Integer> creatRandomNumber() {

        List<Integer> computerNumber = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(10);
            if (!(computerNumber.contains(randomNumber + 1))) {
                computerNumber.add(randomNumber + 1);
                continue;
            }
            i--;
        }
        return computerNumber;
    }

    public static int[] splitNumber(String userNumber) {

        int[] userNumberArray;
        return null;


    }

    public static void validateNumber() {

    }

    public static void main(String[] args) {
        System.out.println(creatRandomNumber());
    }


}
