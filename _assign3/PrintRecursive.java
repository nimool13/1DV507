package ns222tv_assign3;


public class PrintRecursive {

	public static void main(String[] args) {
		   String str = "Hello Everyone!";
		   
		   print(str, 0);
		   System.out.println(); // Line break
		   printReverse(str, 0);
		}
	
	
	public static void print(String str, int pos)
	{
		if(pos > str.length() - 1 || pos < 0)
			return;
		
		System.out.println(str.charAt(pos));
		
		print(str, ++pos);

	}
	
	public static void printReverse(String str, int pos)
	{
		if(pos > str.length() - 1 || pos < 0)
			return;
		
		System.out.print(str.charAt(str.length()- 1 - pos));
		
		printReverse(str, ++pos);
	}

}
