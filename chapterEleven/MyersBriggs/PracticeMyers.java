package chapterEleven.MyersBriggs;

import java.util.Scanner;

public class PracticeMyers {

    private static String[] question;
    private static char[] userResponse;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        question = new String[]{"""
                              question1:
                              A = ["expended energy", "enjoy groups"]
                              B = ["conserve energy", "enjoy-one-on-one"]
                                  """,
                """
                              question2:
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


        System.out.println(question.length);
        int count = 0;
        char userAnswer[];
        userResponse = new char[question.length];
        for (; count <question.length; count++) {
            userAnswer = new char[scanner.nextLine().toString().charAt(0)];
            System.out.println("Please make a choice");
            userResponse = userAnswer;
            System.out.println(userAnswer);
            System.out.println(question[count]);
            System.out.println("Choice: " + userResponse[count]);
        }
        System.out.println("Choice: " + userResponse[count]);
    }
}
