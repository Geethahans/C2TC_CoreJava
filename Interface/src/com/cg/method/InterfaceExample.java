package com.cg.method;
interface Bike
{
	void getMilage();
}
class R15 implements Bike{



@Override
public void getMilage() {
	System.out.println("milage is 40km/L");
	
}
}
public class InterfaceExample {

	public static void main(String[] args) {
		
R15 bike=new R15();
bike.getMilage();
	}

}