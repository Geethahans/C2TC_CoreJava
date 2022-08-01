package com.cg.staticvariable;

public class Stud {
int id;
String name;
static String college="BIT";

	public Stud(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Stud st1=new Stud(111,"geetha");
		Stud st2=new Stud(112,"chithra");
        st1.display();
        st2.display();

	}

}
