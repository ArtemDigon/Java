package lab_3;

import java.util.ArrayList;

public class myVector<T> {

    public ArrayList<T> vector;
    public int sizeVector;
    public int countElementVector;

    public myVector(){
        vector = new ArrayList<T>(10);

    }
    public myVector(int capacity){
        vector = new ArrayList<T>(capacity);
    }
    public myVector(ArrayList<T> vector){

    }
}
