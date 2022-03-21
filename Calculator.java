package week1.day2;

public class Calculator {
	

	 int add(int num1, int num2) {
		 return num1 + num2;
		
	}
	 
	 int sub(int num1, int num2) {
		 return num1 - num2;
	} 
	
	 float div(int num1, int num2) {
		 return num1 / num2;
		} 

	 double mul(int num1, int num2) {
		 return num1* num2;
		} 
	
	public static void main (String[] args) 
	{
	Calculator cal = new Calculator();
	System.out.println(cal.add(20 , 30));
	System.out.println(cal.sub(1 , 4));
	System.out.println(cal.div(20 , 2));
	System.out.println(cal.mul(3 , 6));
	
}
	
}
	
