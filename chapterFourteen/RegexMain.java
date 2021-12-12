package chapterFourteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3Schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("I can Visits3Schools any time");
        boolean findMatcher = matcher.find();
        System.out.println(findMatcher);

        if( findMatcher) {
            System.out.println("The Pattern is found");
        }else{
            System.out.println("Th pattern is not found");
        }
    }
}
