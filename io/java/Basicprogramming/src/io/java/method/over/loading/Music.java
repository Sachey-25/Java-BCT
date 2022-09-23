package io.java.method.over.loading;

//parent class
abstract class Guitar{
	//data member.
	int strings=6;
	String name="Wooden Guitar";
	
	//method
	abstract public void sound();
}

class Instrument extends Guitar{

	@Override
	public void sound() {
		System.out.println("A electric guitar is different than a wooden guitar, they are specimen in their own");		
	}
}

public class Music {

	public static void main(String[] args) {
		// We need to create the object.
		Instrument instance=new Instrument();
		System.out.println(instance.name);
		System.out.println(instance.strings);
		instance.sound();

	}

}
