package robotClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class A1 {
public static void main(String[] args) {
	 
    List<Object> A1 = new ArrayList<Object>();
	A1.add(10);
	A1.add("acb");
	A1.add(10);
	A1.add('d');
	System.out.println(A1);
	
	for(Object save:A1)
	{
		System.out.println(save);
	}
	
	System.out.println("=======================================================================");
	
	HashSet H1=new HashSet(A1);
	for(Object sv:H1)
	{
		System.out.println(sv);
	}
	
	
}
}
