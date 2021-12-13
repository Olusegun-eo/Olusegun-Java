package chapterEleven.MyersBriggs;

import java.util.ArrayList;

public class PlayplayTestingClass {
    public static class Pair<T1, T2> {
        private static Pair<String, Integer>[] l;
        private String string;
        private int i;

        public Pair(String string, int i) {
            this.string = string;
            this.i = i;
        }

        public static Pair<String, Integer> getMaximum(ArrayList<Pair<String, Integer>> arrayList) {
            int max = Integer.MIN_VALUE;
            Pair<String, Integer> ans = new Pair<String, Integer>(" ", 0);
            for (Pair<String, Integer> temp : l) {
                int val = temp.getValue();
                if (val > max) {
                    max = val; // update maximum
                    ans = temp; // update the Pair
                }
            }
            return ans;
        }

        private int getValue() {
            return i;
        }

        private String getKey() {
            return string;
        }

        public static void main(String[] args) {
            //Create an Array List
            ArrayList<Pair<String, Integer>> arrayList = new ArrayList<>();
            arrayList.add(new Pair<String, Integer>("Cricketer A", 76));
            arrayList.add(new Pair<String, Integer>("Cricketer B", 97));
            arrayList.add(new Pair<String, Integer>("Cricketer C", 45));
            arrayList.add(new Pair<String, Integer>("Cricketer D", 65));
//            arrayList.add(new Pair <String,Integer> (“Cricketer E", 110));
//                    Pair <String,Integer> answer = getMaximum(arrayList);
//            System.out.println(answer.getKey() + " is the man of the match " + "with a number of runs: " + answer.getValue());
//        }
        }
    }
}