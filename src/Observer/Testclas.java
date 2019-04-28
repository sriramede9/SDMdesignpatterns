package Observer;

public class Testclas {
	
	public static void main(String[] args) {
		Subject1 s=new Subject1();
		
		new ConcreteObs1(s).attact();;
		new Concreteobs2(s).attact();;
		
		
		s.setState(10);
	}
}
