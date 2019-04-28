package Factoryclient;

import java.util.List;

import Factory.ComponentShape;
import Factory.Shape;
import Factoryimpl.Factory;

public class TestFactory {
	public static void main(String[] args) {
		Factory f = Factory.getInstance();
		Factory ff = Factory.getInstance();

		f.getFactory("square").draw();
		f.getFactory("rectangle").draw();

		Factory t = Factory.threadway();
		Factory tt = Factory.threadway();

		// System.out.println(t.getSimpleShapes());

	//	t.getSimpleShapes().draw();

		// ComponentShape simpleshapelist=(ComponentShape)t.getSimpleShapes();
		// simpleshapelist.getCompoundshapes().remove();

		// this is where Iterator came to existance

		ComponentShape simpleshapelist = (ComponentShape) t.getSimpleShapes();
	//
		//System.out.println(simpleshapelist.getCompoundshapes().next1());
		// ((Shape) simpleshapelist.getCompoundshapes().next1()).draw();

	}
}
