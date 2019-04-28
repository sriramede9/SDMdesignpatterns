package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject1 {

	// I have to maintain list of concrete observers.
	
	//1) create list os objservers
	
	List<Obs> obslist=new ArrayList();
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		
		notify1();
	}
	
	public void addObserver(Obs o) {
		obslist.add(o);
	}

	private void notify1() {
		// TODO Auto-generated method stub
		for(Obs f:obslist) {
			f.update();
		}
	}
	
	
	
}
