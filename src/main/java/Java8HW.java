import org.apache.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class Java8HW {
    static Logger LOGGER = Logger.getLogger(Java8HW.class.getName());

    public static void main(String[] args) {
        List<String> strList = Arrays.asList(
                "animal",
                "aan",
                "abn",
                "123",
                "a5!",
                "ban",
                "banana",
                "",
                " ",
                "a",
                "a  ",
                "a~\n",
                " a ",
                "az",
                "mna",
                "aфв",
                "aiв",
                "al$",
                "a@4",
                "a@4 ",
                "фвыыxn");
        Collections.shuffle(strList);
        List<Integer> intList = new ArrayList<>();
        for (int i = -100; i < 101; i += 3) intList.add(i);
        Collections.shuffle(intList);

        LOGGER.info("The list" + strList + "\n is filtered by elements that start with the letter 'a'" +
                " and have exactly 3 letters: \n " +
                "" + filterStartWithAAndThreeLettersInString(strList));
        LOGGER.info("The list" + intList + " is modified with the format to \n" +
                addCommaAndAddcharactersToOddAndEvenNumbers(intList));
        LOGGER.info("The amount of numbers which ON MODULE more than 50 in the list: \n" + intList + "\n is:" + filterAbs50(intList));

    }

    private static List<String> filterStartWithAAndThreeLettersInString(List<String> arr) {
        return arr.stream()
                .filter(str -> str.length() == 3 && str.startsWith("a"))
                .collect(Collectors.toList());
    }

    private static String addCommaAndAddcharactersToOddAndEvenNumbers(List<Integer> arr) {
        return arr.stream()
                .map(num -> (num % 2) == 0 ? "e" + num : "o" + num)
                .collect(Collectors.joining(","));
    }

    private static long filterAbs50(List<Integer> arr) {
        return arr.stream()
                .filter(num -> Math.abs(num) > 50)
                .count();
    }

}
