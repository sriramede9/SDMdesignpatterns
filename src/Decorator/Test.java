package Decorator;

public class Test {
	public static void main(String[] args) {
		DecoratorShape square=new Square();
		square.draw();
		
		DecoratorShape colorsquare=new ColoredShape(square,"Yellow");
		
		colorsquare.draw();
		colorsquare.resize();
		colorsquare.erase();
	}
}
