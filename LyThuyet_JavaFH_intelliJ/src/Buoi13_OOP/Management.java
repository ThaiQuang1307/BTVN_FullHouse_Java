package Buoi13_OOP;


public class Management {
	
	private Student[] arr;
	private int count = 0;
	
	public Management(int size) {
		this.arr = new Student[size];
	}
	
	public void add(Student s) {
		if(this.count < this.arr.length) {
			// this.arr = {s, s, s}
			this.arr[this.count] = s;
			this.count++;
		}else{
			System.out.println("Qúa tải!");
		}
	}
	
	public void print() {
		for(int i = 0; i < this.arr.length; i++) {
			this.arr[i].info();
		}
	}

}
