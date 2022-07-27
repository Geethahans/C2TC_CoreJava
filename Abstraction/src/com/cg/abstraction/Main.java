package com.cg.abstraction;

abstract class Bike{
	abstract void run();
	
}
class Honda extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println(" running successfully");
		
	}
	
	
	
}
public class Main {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
	}

}
