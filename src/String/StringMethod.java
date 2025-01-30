package String;

public class StringMethod {

	public static void main(String[] args) {
		
		
		String text = " hello world ";
		String s1 =text.substring(7);
		String s2 = text.substring(5, 8);
		System.out.println(s2);
		System.out.println(s1);
		
		
		int s3 = text.indexOf(" t ");
		System.out.println(s3);
		
		int s4 = text.lastIndexOf("o");
     		System.out.println(s4);
	}

}
