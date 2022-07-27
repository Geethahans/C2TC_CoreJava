package com.cg.Interfacedemo;
interface Bank{
	float rateOfInterest();
}
class SBI implements Bank{

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.15f;
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println("ROI:"+b.rateOfInterest());

	}

}
