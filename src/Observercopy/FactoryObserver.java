package Observercopy;

import Shapeinteface.ObsersverShape;

public class FactoryObserver {
	// to create Factory
	
	public static ObsersverShape getshape(String s) {
		
		if(s.equalsIgnoreCase("rectangle")) {
			return new RectangleObserver();
		}
		return null;
	}
}
