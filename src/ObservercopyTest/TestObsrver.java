package ObservercopyTest;

import Observercopy.ConcreteObserver1;
import Observercopy.FactoryObserver;
import Shapeinteface.Abstractshape;
import Shapeinteface.ObsersverShape;

public class TestObsrver {
	public static void main(String[] args) {
		
		ConcreteObserver1 c1=new ConcreteObserver1();
		
		FactoryObserver fo=new FactoryObserver();
		
		ObsersverShape rectangle=fo.getshape("rectangle");
		
		rectangle.visit(c1);
		
		//((Abstractshape) rectangle).intrestedmethod();
		
		//((Abstractshape) rectangle).intrestedmethod();
		//((Abstractshape) rectangle).intrestedmethod();
		
		// subject should call interestedmethod so we have to downcas in this case. as our subject in abstract
	}
}
