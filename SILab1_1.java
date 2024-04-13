import java.util.ArrayList;
import java.util.List;

public class SILab1_1 {
    public static List<String> filterOddLengthStrings(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String el : list) {
            if (el.length() % 2 != 0) { // proverka za neparna dolzina na stringovi
                result.add(el);
            }
        }
        return result;
    }

}
