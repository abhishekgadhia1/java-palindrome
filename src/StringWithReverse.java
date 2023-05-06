
public class StringWithReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ori_name = "nayan";
		String rev_name = "";
		
		for(int i=ori_name.length()-1;i>=0;i--)
		{
			rev_name = rev_name + ori_name.charAt(i);
		}
		
		//the bottom one showed wrong output because The problem with this program 
		//is in the comparison of strings. In Java, when you compare strings 
		//using the == operator, it checks whether the two strings have the same 
		//object reference, which may not be true even if the strings have the same content. 
		//To compare the content of two strings, you should use the equals() 
		//method instead of the == operator.
		
//		if(rev_name==ori_name)
//		{
//			System.out.println("palindrome yes");
//		}
//		else
//			System.out.println("no palindrome");

		if(ori_name.equals(rev_name))
			System.out.println("yes palindrome");
		else
			System.out.println("no palindrome");
	}

}
