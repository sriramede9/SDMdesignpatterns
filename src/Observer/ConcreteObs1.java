package Observer;

public class ConcreteObs1 implements Obs {

	private Subject1 d;

	public ConcreteObs1(Subject1 d) {
		super();
		this.d = d;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(Integer.toHexString(d.getState()));
	}

	@Override
	public void attact() {
		// TODO Auto-generated method stub
		d.addObserver(this);
	}

}
