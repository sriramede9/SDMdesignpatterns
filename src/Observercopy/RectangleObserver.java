package Observercopy;

import Shapeinteface.Abstractshape;
import Shapeinteface.ObsersverShape;
import Shapeinteface.Observ;

class RectangleObserver extends Abstractshape implements ObsersverShape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle");
	}

	@Override
	public void visit(Observ o) {
		// TODO Auto-generated method stub
		this.addObservers(o);
	}
	
	public	void intrestedmethod() {
		super.intrestedmethod();	
	}

}
