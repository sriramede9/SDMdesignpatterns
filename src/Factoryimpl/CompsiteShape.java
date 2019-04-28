package Factoryimpl;

import java.util.ArrayList;

import java.util.List;

import Factory.ComponentShape;
import Factory.Iterator1;
import Factory.Shape;

public class CompsiteShape implements ComponentShape , Shape {

	List<Shape> compositelist = new ArrayList();

	public void addComponent(Shape sh) {
		compositelist.add(sh);
	}

	@Override
	public Iterator1 getCompoundshapes() {
		// TODO Auto-generated method stub
		return new Iteratorimpl(compositelist);
	}
	
	public void removeComponent(Shape ss) {
		compositelist.remove(ss);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (Shape s : compositelist) {
			s.draw();
		}
	}

}
