package com.cg.absttointerface;
interface In2{
void java();
void python();
void iot();
}
  abstract class Student implements In2{


@Override
public void java() {
	System.out.println("i like java");
	
}

@Override
public void python() {
	System.out.println("i like python");
	
}

@Override
public void iot() {
	System.out.println("i like iot");
	
}
  }
class School extends Student{
	public void C() {
		System.out.println("help me to solve coding");
	}
}
public class Demo {

	public static void main(String[] args) {
		
School s=new School();
s.java();
s.python();
s.iot();
	}

}
  
