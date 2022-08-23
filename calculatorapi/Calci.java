package calculatorapi;

public class Calci {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		Integer result=cal.add(20, 30);
		System.out.println(result);
		
		Integer result1=cal.multiply(20, 20);
				System.out.println(result1);
	}

}
