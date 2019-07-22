import java.util.*;

public class PosNegString {
	public String str;
	
	public void checkString(String str)
	{
		char[] arr = new char[str.length()];
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = str.charAt(i);
		}
		Arrays.sort(arr);
		String newstr = new String(arr);
		if(newstr.equals(str))
		{
			System.out.println("String is Positive");
		}
		else
		{
			System.out.println("String is Negative");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PosNegString obj = new PosNegString();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your String ");
		String str = s.nextLine();
		obj.checkString(str);
		s.close();
	}

}
