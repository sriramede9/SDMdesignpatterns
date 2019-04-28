package Visitorsaturday;

public class Postage implements Visitorfinal {
	
	private int totalprice;

	@Override
	public void accept(Bookfin bf) {
		// TODO Auto-generated method stub
		totalprice+=bf.getPrice();
	}

	@Override
	public void accept(CDfin cd) {
		// TODO Auto-generated method stub
		totalprice+=cd.getSalary();
	}
	
	public int gettotal() {
		return totalprice;
	}

}
