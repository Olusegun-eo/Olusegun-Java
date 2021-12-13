package chapterEleven.MyersBriggs;

import java.util.Arrays;
import java.util.Scanner;

public class Questionnaire {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] question;
    private static char [] userResponse;



    public Questionnaire(String[] question) {
        this.question = question;
    }

    public Questionnaire() {

    }

    public static void  setQuestions() {

        question = new String[]{"""
                              question1:
                              A = ["expended energy", "enjoy groups"]
                              B = ["conserve energy", "enjoy-one-on-one"]
                                  """,
                """
                              question2:
                              A = ["expended energy", "enjoy groups"]
                              B = ["conserve energy", "enjoy-one-on-one"]
                              """,
                """
                              question3:
                              A = ["interpret", literally"]
                              B = ["look for meaning" , "possibilities"]
                              """,
                """
                              question3: 
                              A = ["logical", "thinking", "questioning"]
                              B = ["emphatic", "feeling", "accomplishing"]
                              """,
                """
                              question4:
                              A = ["organized", "orderly"]
                              B = ["flexible", "adaptable"]
                              """,
                """
                              question5:
                              A = ["more outgoing", "think loud"]
                              B = ["more reserved, "think to yourself"]  
                               """,
                """
                              question6:
                              A = ["practical", "realistic", "experimental"]
                              B = ["imaginative", "innovative", "theoretical"]  
                               """,
                """
                              question7:
                              A = ["candid", "straight forward", "franks"]
                              B = ["tactful", "kind", "encouraging"]  
                              """,
                """
                              question8:
                              A = ["plan, schedule"]
                              B = ["unplanned", 'spontaneous"]  
                              """,
                """
                              question9:
                              A = ["seek many tasks", "public activities", "interaction with others"]
                              B = ["seek private", "solitary activities", "with quiet to concentrate"]  
                               """,
                """
                              question10:
                              A = ["standard", "usual", "conventional"]
                              B = ["different", "novel", "unique"]  
                               """,
                """
                              question11:
                              A = ["firm, tend to creticize, hold the line"]
                              B = ["gentle, "tend to appreciate', "conciliate"]  
                               """,
                """
                              question12:
                              A = ["regulated", "structured"]
                              B = ["easygoing", "live and let live"]  
                               """,
                """
                              question13:
                              A = ["external", "communicative", "express yourself"]
                              B = ["internal", "reticent", "keep to yourself"]  
                               """,
                """
                              question14:
                              A = ["focus on here-and-now"]
                              B = ["look top the future", "global perspective", "big picture"]  
                               """,
                """
                              question15:
                              A = ["tough minded", "just"]
                              B = ["tender-hearted', "merciful"]  
                               """,
                """
                              question16:
                              A = ["preparation", "plan ahead"]
                              B = ["go with the flow", 'adapt as you go"]  
                              """,
                """
                              question17:
                              A = ["reflective", "deliberate"]
                              B = ["active", "initiate"]  
                              """,
                """
                              question18:
                              A = ["facts, "things", "what is idea"]
                              B = ["dreams", "what could be", "philosophical"]  
                              """,
                """
                              question19:
                              A = ["matter of fact", "issue-oriented"]
                              B = ["sensitive", "people-oriented", "compassionate"]  
                              """,
                """
                              question20:
                              A = ["latitude", freedom"]
                              B = ["control", "govern"]  
                              """
        };
//        return question;
    }

    public String[] getQuestions() {
        setQuestions();
        return question;
    }


    @Override
    public String toString() {
        return "Questionnaire{" +
                "questions=" + Arrays.toString(question) +
                '}';
    }

    public void getUserResponse() {
        System.out.println(question.length);
        int count = 0;
        char userAnswer[];
        userResponse = new char[question.length];
        for (; count <= question.length; count++) {
            System.out.println("Please make a choice");
            userAnswer = new char[scanner.nextLine().toString().charAt(0)];
            userResponse = userAnswer;
            System.out.println(question[count]);
        }

        System.out.println(userResponse[count++]);
    }

/*
* method2
Note===the length of question is stored in new char array UserAnswers;

how the user will answer is by one character

Errors====collecting any input;
storing userAnser inside a character;
collecting user input with string
* */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questionnaire that = (Questionnaire) o;
        return Arrays.equals(question, that.question);
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(question);
    }

}