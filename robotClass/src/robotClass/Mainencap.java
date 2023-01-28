package robotClass;

public class Mainencap {

	public static void main(String[] args) {
		Encap EN = new Encap();
		
		EN.setBrand("hp");
		EN.setPrize(12000.00);
		System.out.println("======================================");
		
		System.out.println(EN.getBrand());
		System.out.println(EN.getPrize());
		
		
		EN.setPrize(500000.0);
		System.out.println(EN.getPrize());
		

	}

}
