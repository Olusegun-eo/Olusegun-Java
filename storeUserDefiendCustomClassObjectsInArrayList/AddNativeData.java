package storeUserDefiendCustomClassObjectsInArrayList;

import java.util.ArrayList;

public class AddNativeData {

    ArrayList<Native> nativeMethod(){

// Create three objects of the class Native and pass arguments to the constructor.
        Native native1 = new Native("Java", 101, "semicolon 312 Herbert Macaulay", 20);
        Native native2 = new Native("Java", 101, "semicolon 312 Herbert Macaulay", 20);
        Native native3 = new Native("Java", 101, "semicolon 312 Herbert Macaulay", 20);
        Native native4 = new Native("Java", 101, "semicolon 312 Herbert Macaulay", 20);



// Create the object of ArrayList of generic type 'SNative'.
        ArrayList<Native> nativeArrayList = new ArrayList<Native>();
        nativeArrayList.add(native1);
        nativeArrayList.add(native2);
        nativeArrayList.add(native3);
        nativeArrayList.add(native4);

        return nativeArrayList;
    }
}
