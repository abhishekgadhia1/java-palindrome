
public class StringWithoutReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "nayyan";
		boolean flag=true;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=name.charAt(name.length()-i-1))
			{
				flag=false;
				break;
			}
				
		}
		if(flag==false)
		{System.out.println("no palindrome");
		}
		else
		{
			System.out.println("plaindrom");
		}


	}
}
