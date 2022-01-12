package stringCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringCalculator {

    public static String[] splitString(String userString) {

        return userString.split(" ");

    }


    public static List<Integer> creatNumberList(String[] values) {
        List<Integer> numberArray = new ArrayList<>();

        for (String s : values) {
            char numberCheck = s.charAt(0);
            if (numberCheck > 48 && numberCheck < 58) {
                numberArray.add(Integer.parseInt(s));
            }
        }
        return numberArray;
    }


    public static List<String> creatOperatorList(String[] values) {
        List<String> operatorArray = new ArrayList<>();

        for (String s : values) {
            char operatorCheck = s.charAt(0);
            if (operatorCheck < 48 || operatorCheck > 58) {
                operatorArray.add(s);
            }
        }
        return operatorArray;
    }


    public static int calculate(List<Integer> numberList, List<String> operatorList) {

        int operatorListIndex = 0;
        int result = 0;

        for (int i = 1; i < numberList.size(); i++) {

            if (i == 1) {
                result = (numberList.get(i - 1));
            }

            if (operatorList.get(operatorListIndex).equals("+")) {
                result = result + (numberList.get(i));
            } else if (operatorList.get(operatorListIndex).equals("-")) {
                result = result - (numberList.get(i));
            } else if (operatorList.get(operatorListIndex).equals("*")) {
                result = result * (numberList.get(i));
            } else if (operatorList.get(operatorListIndex).equals("/")) {
                result = result / (numberList.get(i));
            }
            operatorListIndex++;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(2, 20, 4));
        List<String> operatorList = new ArrayList<String>(Arrays.asList("*", "/"));
        System.out.println(calculate(numberList, operatorList));
    }
}



