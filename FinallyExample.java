
public class FinallyExample {
	
	public static void main( String args[]) {
		try { int num=121/0;
		System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Number should not be divided by zero");
		}
		finally {
			System.out.println("this is finally block");
		}
		System.out.println("out of try catch finally");
		
		
	}
	

}
