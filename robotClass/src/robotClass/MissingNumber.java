package robotClass;

import java.util.HashSet;

public class MissingNumber {
	public static void main(String[] args) {
		int start=1;
		int end=10;
		int [] arr= {1,2,3,6,8};
		HashSet missingNumber=new HashSet();
		for(int i=start;i<=end;i++) 
		{
			boolean loop=false;
			for(int j=0;j<arr.length;j++) 
			{
	
				if(i==arr[j]) {
					loop=true;
					break;
					
				}
			}
			if(loop==false) 
			{
				missingNumber.add(i);
				
			}
			
		}
		System.out.println(missingNumber);
		
	}

}
