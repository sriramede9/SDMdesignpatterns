package Observer;

public class Concreteobs2 implements Obs {
	
	private Subject1 sub;
	
	

	public Concreteobs2(Subject1 sub) {
		super();
		this.sub = sub;
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(Integer.toOctalString(sub.getState()));
	}



	@Override
	public void attact() {
		// TODO Auto-generated method stub
		sub.addObserver(this);
	}

}
