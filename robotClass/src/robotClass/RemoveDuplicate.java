package robotClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
	
	
public static void main(String[] args) {
	List i=new ArrayList();
	i.add(10);
	i.add(20);
	i.add(5);
	i.add(1);
	i.add(1);
	i.add(1);
	i.add(40);
Collections.sort(i);
	
	System.out.println(i);
	
	HashSet <Integer> h=new HashSet(i);
	for(int obj: h)
	{
		System.out.println( obj);
	}
	
}   
}
