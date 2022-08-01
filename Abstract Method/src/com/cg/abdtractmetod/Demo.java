package com.cg.abdtractmetod;
abstract class Bike{
	Bike(){
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");	}
}
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("running safely");
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
