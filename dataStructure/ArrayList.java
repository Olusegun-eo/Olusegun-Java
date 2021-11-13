package dataStructure;

public class ArrayList implements List {

    //    private boolean isEmpty();
    private boolean isEmpty = true;
    private int size =0;
    private int element;
    private  int []elements; //To store elements

    public ArrayList(){
        //Capacity is 6 size is 0
        elements = new int[3]; //we initialize to prevent null pointer
    }


    @Override
    public boolean isEmpty() {
//        return isEmpty;
        return size == 0;
    }

    @Override
    public void  add(int element){

        boolean isFull = getCapacity()== size;
        if(isFull){
            //Creating new array
            int [] newArray = new int[elements.length * 2];
            //Copy content of Old array
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            //Swap  Old for new
            elements = newArray;

        }
        //        isEmpty = false
//        elements[size++] = element; OR these other two lines
        elements[size] = element; // i.e element @This size assign each size to it
        size++; //We increment size
    }

    @Override
    public void  add(int element, int index){
        this.element = element;
        elements[index] = element;
//        isEmpty = false
//        size++;

    }

    @Override
    public void remove(int element){
        if(isEmpty()) throw new IllegalArgumentException("Array is Empty");
//        Overwrite it wit values on the right then increments
//        length is the capacity //While size is for the list of the elements present

        // Use this===>This is OverWrite because you can't remove it
//        Delete Mechanism: We write code to overwrite until the element looses position
         int index = getIndexOf(element);//        Find index in elements

        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
//            System.out.println(i);
        }
        size--;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public int get(int index){
//        return index;
        return elements[index];
    }

    @Override
    public int getCapacity() {
        return elements.length;
    }

    @Override
    public int getIndexOf(int element){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element){
                return i;
            }
        }
        return 0;
    }
//    @Override
//    public String toString(){
//        System.out.println(Array.toString(this));
//    }
}
