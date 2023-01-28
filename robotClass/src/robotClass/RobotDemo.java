package robotClass;


public class RobotDemo {
	enum Day{
		sun,mon,tue
		}
	public static void main(String[] args) {
		Day [] constant=Day.values();
		for(Day d:constant)
		{
			System.out.println(d);
		}
	}
	


}
