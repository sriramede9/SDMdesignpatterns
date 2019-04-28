package Decorator;

public class ColoredShape extends AbstractShapeDecorator implements DecoratorShape {

	private String color;
	
	public ColoredShape(DecoratorShape ds,String color) {
		super(ds);
		// TODO Auto-generated constructor stub
		this.color=color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing ths same Rectangle with color \t"+this.color);
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		ds.resize();
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		ds.erase();
	}

}
