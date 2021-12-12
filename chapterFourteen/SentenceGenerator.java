package chapterFourteen;

import java.security.SecureRandom;

public class SentenceGenerator {
    private static String article[] = {"the", "a", "one", "some", "any"};
    private static String noun[] = {"boy", "girl", "dog", "town", "car"};
    private static String verb[] = {"drove", "jump", "ran", "walked", "skipped"};
    private static String proposition[] = {"to", "from", "from", "over", "under"};


    public static String createSentence(){
        SecureRandom randomIndex = new SecureRandom();
        int index = randomIndex.nextInt(5);
        StringBuilder sentence = new StringBuilder();


        String firstWord = article[index];
        char firstLetter = firstWord.charAt(0);
        char capitalized = Character.toUpperCase(firstLetter);
        firstWord = firstWord.replace(firstWord.charAt(0), capitalized);

//        sentence.append(article.)


        sentence.append(noun[randomIndex.nextInt(5)]).append(" ");

        return sentence.toString();
    }

}
