package com.cg.staticblock;

public class Student {
	int id;
	String name;
	static String college;
	static {
		college="BIT";
		System.out.println("the college name is EWIT");
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	static void change() {
		college="EWIT";
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student st1=new Student(111,"geetha");
		Student st2=new Student(112,"chithra");
		change();
        st1.display();
        st2.display();

	}

}
