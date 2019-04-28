package Visitorsaturday;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Postage ps=new Postage();
		
		Bookfin book=new Bookfin("Hill",20);
		CDfin cd=new CDfin("grriffin",80);
		
		List<Visitable> visitableobj =new ArrayList();
		
		visitableobj.add(cd);
		visitableobj.add(book);
		
		for(Visitable t:visitableobj) {
			t.visit(ps);
		}
		
		System.out.println(ps.gettotal());
	}
}
