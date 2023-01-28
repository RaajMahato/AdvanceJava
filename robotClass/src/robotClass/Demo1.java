package robotClass;

public class Demo1 {
	public String test(String p)
	{
		return "java";
	}
	public int  test(int R)
	{
		return 60;
		
	}
	public void test()
	{
	int a=10;
	int b=30;
	
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Demo1 dr = new Demo1();
		int save = dr.test(20);
		System.out.println(save);
		dr.test();
		
		
		
		
	}
	
	

}








