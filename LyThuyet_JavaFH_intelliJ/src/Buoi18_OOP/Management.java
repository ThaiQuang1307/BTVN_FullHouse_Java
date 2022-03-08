package Buoi18_OOP;

import java.util.ArrayList;

public class Management<T> {
    private ArrayList<T> al;

    public Management() {
        this.al = new ArrayList<T>();
    }

    public Management(ArrayList<T> al) {
        this.al = al;
    }

    public void add(T student){
        this.al.add(student);
    }

    public void print(){
        for (T s: this.al) {
            System.out.println(s);;
        }
    }
}
