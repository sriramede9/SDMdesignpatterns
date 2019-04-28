package Factoryimpl;

import Factory.Shape;

public class Factory {
	
	private Factory() {
		
	}
	
	//inner class style
	
	private  static  class Innerclass{
		
		private static final Factory factobj=new Factory();
	} 
	
	public static Factory getInstance() {
		return Innerclass.factobj;
	}
	
	
	// using thread way
	
	private static volatile Factory facobj;
	
	
	public static Factory threadway() {
		
		if(Factory.facobj==null) {
			
			synchronized(Factory.class) {
				if(Factory.facobj==null) {
					Factory.facobj=new Factory();
				}
				
			}
		}
		return Factory.facobj;
		}
	
	public Shape getFactory(String s) {
		
		if(s.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if(s.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
	
	public Shape getSimpleShapes() {
		
		CompsiteShape simpleShapeobj=new CompsiteShape();
		
		simpleShapeobj.addComponent(new SimpleRectangle());
		
		simpleShapeobj.addComponent(new SimpleSquare());
		
		return simpleShapeobj;
	}
}
