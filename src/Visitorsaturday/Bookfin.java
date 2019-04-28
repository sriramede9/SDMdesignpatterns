package Visitorsaturday;

public class Bookfin implements Visitable {
	
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Bookfin(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void visit(Visitorfinal v) {
		// TODO Auto-generated method stub
		v.accept(this);
	}

	

}
