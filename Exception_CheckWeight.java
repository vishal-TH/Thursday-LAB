//A Program to check weight//

package ThursdayLab;

public class Exception {
	class MyException extends Exception {
		public MyException(String s)
		{
			super(s);
		}
	 }
	class ProductCheck
	{
		int weight;
		
		public ProductCheck(int weight)
		{
			this.weight=weight;
		}

		void display() {
			System.out.println("product is valid");
		}
	}

	public class Product {

		public static void main(String[] args) {
			try {
			int ProductWeight = 120;
			if(ProductWeight >150)    //check product weight, if it is greater then 100 it will show product weight
			{
				System.out.println("product weight is "+ProductWeight);
			}
			}
			catch (Exception e)		//if pro weight is less then 100  it will show an exception 
			{
				System.out.println(e);
			}
			System.out.println("product weight  is invalid");
			
			
			
			
			
		}

	}
}
