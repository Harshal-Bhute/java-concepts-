package Polymorphism.Rules;

public class Rule3 {

	public static void main(String[] args) {
		ParentB b = new ParentB();
		//System.out.println(b.a);

	}

}

class ParentB{
	 Animal disp() {
	 Animal a= new Animal();
	 return a;
	 }
}
class ChildB extends ParentB{
	 
	Dog disp() {
		Dog d = new Dog();
		return d;
	}
} 

class Animal{
	
}
class Dog extends Animal{
	
}