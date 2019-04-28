package Factoryimpl;

import java.util.ArrayList;
import java.util.List;

import Factory.Iterator1;
import Factory.Shape;

public class Iteratorimpl implements Iterator1 {
	
	List<Shape> privatelist;
	
	
	int index;
	
	public Iteratorimpl(List<Shape> p) {
		super();
		privatelist=new ArrayList();
		
		this.privatelist.addAll(p);
	}

	@Override
	public boolean hasnext1() {
		// TODO Auto-generated method stub
		return index<privatelist.size()-1;
	}

	@Override
	public Object next1() {
		// TODO Auto-generated method stub
		Shape r=privatelist.get(index);
		index++;
		
		return r;
	}

}
