package Decorator;

public abstract class AbstractShapeDecorator implements DecoratorShape {

	DecoratorShape ds;

	public AbstractShapeDecorator(DecoratorShape ds) {
		super();
		this.ds = ds;
	}
	
	

}
