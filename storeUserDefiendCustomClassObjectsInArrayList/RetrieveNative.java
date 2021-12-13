package storeUserDefiendCustomClassObjectsInArrayList;

import java.util.ArrayList;

public class RetrieveNative {

    public static void main(String[] args) {
        // Call AddNativeData class by creating object of that class.
        AddNativeData addNativeData = new AddNativeData();



    // Call studentData() method using reference variable data.
        ArrayList<Native>listOfNative = addNativeData.nativeMethod();

//        for (int count = 0; count < listOfNative.size(); count++) {
//            System.out.println(Arrays.toString(listOfNative));
//        }

        for (Native aNative : listOfNative) {
            System.out.println("\t" + aNative.name + " My ID Number: \t" +aNative.idNumber + " I live at\t" +
                    aNative.address +", And I,m "+
                    aNative.age + " old year"
            );
        }
    }

}






//"======================================================================"

class Subject{
    public String subjectName;
    public String subjectTitle;
    public int subjectNumber;

    public Subject(String subjectName, String subjectTitle, int subjectNumber) {
        this.subjectName =subjectName;
        this.subjectTitle = subjectTitle;
        this.subjectNumber = subjectNumber;
    }

}


class AddSubjectData{

    ArrayList<Subject> subjectMethod(){

        Subject subject = new Subject("Granada Upjill", "The hills",121);
        Subject subject1 = new Subject("The ways od the Wild", "The King's maker", 122);
        Subject subject2 = new Subject("The ways of the King", "The kings",123);


        ArrayList<Subject> subjects = new ArrayList<Subject>();
        subjects.add(subject);
        subjects.add(subject1);
        subjects.add(subject2);

        return subjects;
    }
}


class RetrieveSubject{

    public static void main(String[] args) {
        AddSubjectData addSubjectData = new AddSubjectData();

        ArrayList<Subject> subjectArrayList = addSubjectData.subjectMethod();

//        for (int count = 0; count < subjectArrayList.size(); count++){
//            System.out.println(Subject);
//        }

        for(Subject subject: subjectArrayList){
            System.out.println(subject);
        }
    }
}