package Visitorsaturday;

public class CDfin implements Visitable {

	private String name;
	private int salary;
	
	public CDfin(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public void visit(Visitorfinal v) {
		// TODO Auto-generated method stub
		v.accept(this);
	}

}
