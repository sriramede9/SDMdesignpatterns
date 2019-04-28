package Decorator;

public class Square implements DecoratorShape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing a square with black border on a white background");
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		System.out.println("I am resizinging");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erasing the sqare you have drawn");
	}

}
