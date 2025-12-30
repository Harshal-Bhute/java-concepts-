package Polymorphism;

//false Polymorphism

public class Polymorphism {

	public static void main(String[] args) {
		JavaTrainer j = new JavaTrainer();
		j.teach();
		AptiTrainer a = new AptiTrainer();
		a.teach();
		TestingTrainer t = new TestingTrainer();
		t.teach();

	}

}
class Trainer {
	void teach() {
		System.out.println("job is teaching");
	}
}

class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("job is teaching java");
	}
}

	class AptiTrainer extends Trainer{
		void teach() {
			System.out.println("job is teaching Apti");
		}
}
	
	class TestingTrainer extends Trainer{
		void teach() {
			System.out.println("job is testing");
		}
}
	//in the above program polymorphism could not be achieved bcz of type coupling 
	// type coupling refers to a process of a child type reference referring to a child type object also
	//three reference variable are calling one teach method each i.e j is calling teach method of javatrainer class,at
	// is calling teach method of apti trainer class and t is calling teach method of testing trainer class hence 3is to 3 1 is to 1 relationship
	//therefore polymorphism does no exist in the above program
	// If polymorphism has to be acheived we must achieve loose coupling
	// loose coupling refers to a process of a parent type reference referring to a child type object