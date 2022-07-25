package com.ch.multiinheritence;

class grandfather{
	void display1() {
		System.out.println("grandfather");
	}
}
class father extends grandfather{
	void display2() {
		System.out.println("father");
	}
}
class grandson extends father{
	void display3() {
		System.out.println("grandson");
	}
}
public class FamTree {
	public static void main(String[] args) {
		grandson js=new grandson();
		js.display1();
		js.display2();
		js.display3();

	}

}
