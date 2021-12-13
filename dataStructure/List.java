package dataStructure;

public interface List {
    boolean isEmpty();

    void add(int element);
    void add(int element, int index);

    void remove(int element);

    int size();

    int get(int index);

    int getIndexOf(int element);

    int getCapacity();

    String toString();
}
