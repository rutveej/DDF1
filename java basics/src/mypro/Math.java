package mypro;

public class Math {
	
	public void deduction(int a, int b) {
		System.out.println(a - b);
	}
	
	public void multiply(int a, int b) {
	     System.out.println(a*b);
	}
	
	public void divide(int a, int b) {
		 System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Math minus = new Math ();
		
		minus.deduction (20, 10);
		minus.multiply(10, 20);
		minus.divide(50, 10);
				
	}

}
