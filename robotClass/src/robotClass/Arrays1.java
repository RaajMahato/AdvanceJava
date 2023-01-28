package robotClass;

import java.util.ArrayList;
import java.util.Collections;


public class Arrays1 {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(60);
		a1.add(5);
		a1.add(10);
		a1.add(1);
		a1.add(30);
		
	Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
	}

}
