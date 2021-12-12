package chapterFourteen;

public class DecimalFormat {

    public static void main(String[] args) {
        CustomDecimalFormat("###,###.###", 234555.5767);
        CustomDecimalFormat("###,###.#####", 234555.5767);
        CustomDecimalFormat("000.00", 234555.5767);
        CustomDecimalFormat("###,#####.###", 234555.5767);
        CustomDecimalFormat("11111.11", 234555.5767);

    }


    public static void CustomDecimalFormat(String pattern, double value){
        java.text.DecimalFormat myFormat = new java.text.DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(value +  " " + pattern + " " + output);
    }
}
