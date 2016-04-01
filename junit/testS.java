import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class testS {
Schedule s;
Work w1;
Work w2;
Work w3;
List<Work>l;
List<Work>l2;
List<Work>l3;
List<Double>lf1;
List<Double>ls1;
List<Double>a1;
List<Double>a2;

	@Test
	public void test() {
		s=new Schedule();
		w1=new Work("n1",0,4);
		w2=new Work("n2",1,3);
		w3=new Work("n3",2,2);
		 l = new ArrayList<Work>();
		 l2 = new ArrayList<Work>();
		 l3 = new ArrayList<Work>();
		l.add(w1);
		l.add(w2);
		l.add(w3);
		l2=l;
		lf1=s.FCFS(l);
		ls1=s.SJF(l2);
		s.FCFS(l3);
		s.SJF(l3);
		a1=lf1;
		a2=ls1;
		int k=w1.getPriority();
		assertEquals(a1,lf1);
		assertEquals(a2,ls1);
		assertEquals(k,w1.getPriority());
		
		w1=new Work("n1",0,4);
		w2=new Work("n2",1,2);
		w3=new Work("n3",2,5);
		l3.add(w1);
		l3.add(w2);
		l3.add(w3);
		l2=l3;
		lf1=s.FCFS(l3);
		ls1=s.SJF(l3);
		a1=lf1;
		a2=ls1;
		assertEquals(a1,lf1);
		assertEquals(a2,ls1);
	}

}
