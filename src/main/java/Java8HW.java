import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Java8HW {
    static Logger LOGGER  = Logger.getLogger(Java8HW.class.getName());

    public static void main(String[] args) {
        List<String> strList=Arrays.asList("animal","aan","abn","axn");

    }


    private static List<String> filterStartWithAAndThreeLetters(List<String> arr){
        return arr.stream().filter()
    }
}
