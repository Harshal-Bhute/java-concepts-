package day18.abstraction;



public class abstractionEx2 {

	public static void main(String[] args) {
	duty(new JavaTrainer1());	
	duty(new AptiTrainer1());
	duty(new TestingTrainer1());
	}
	static void duty(Trainerr t) {
		t.teach();
	}
}




abstract class Trainerr {
	abstract void teach() ;
}

class JavaTrainer1 extends Trainerr{
	void teach() {
		System.out.println("job is teaching java");
	}
}

	class AptiTrainer1 extends Trainerr{
		void teach() {
			System.out.println("job is teaching Apti");
		}
}
	
	class TestingTrainer1 extends Trainerr{
		void teach() {
			System.out.println("job is testing");
		}
}