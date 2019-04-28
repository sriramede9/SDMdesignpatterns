package Shapeinteface;

import java.util.ArrayList;
import java.util.List;

public abstract class Abstractshape implements ObsersverShape{
// abstract class that acts as subject in our case

	List<Observ> obslist = new ArrayList();

	// private int state;

	protected void addObservers(Observ g) {
		obslist.add(g);
	}

	public void intrestedmethod() {

		System.out.println("this is the interested method like set");

		notifyidiots();
	}

	private void notifyidiots() {
		// TODO Auto-generated method stub
		for(Observ g:obslist) {
			g.update();
		}
	}
}
