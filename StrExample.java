import java.util.*;
import java.util.stream.Collectors;

public class StrExample {
	
	public String str;
	
	public void setString(String s)
	{
		this.str = s;
	}
	
	public void addStringToItself(String s)
	{
		StringBuilder sb = new StringBuilder();
		sb = sb.append(str);
		sb = sb.append(s);
		System.out.println("After Adding String to Itself We Get "+sb+"\n");
	}
	
	public void replacePosition(String s)
	{
		StringBuffer buf = new StringBuffer(s);
		for(int i=0; i<s.length();i++) {
			if(i % 2 == 0)
			{
				buf.setCharAt( i,'#');
			}
		}
		System.out.println("Replacing Odd Position of String with # We Get "+buf+"\n");
	}
	
	public void removeDuplicatesFromString(String s)
	{
		char[] cArray = s.toCharArray();
		List<Character> cList = new ArrayList<Character>();
		for(char c : cArray) {
		    cList.add(c);
		}
	
	    
		List<Character> listWithoutDuplicates = cList.stream().distinct().collect(Collectors.toList());
	    
		
	    StringBuilder sb = new StringBuilder(listWithoutDuplicates.size());
	    for (char c : listWithoutDuplicates)
	        sb.append(c);
	    String result = sb.toString();
	    
	    System.out.println("After Removing Duplicates from String we Get :" +result+"\n");
	}
	
	public void changingOddPositionToUpperCase(String s)
	{
		StringBuffer buf = new StringBuffer(s);
		for(int i=0; i<s.length();i++) {
			if(i%2 == 0)
			{
				buf.setCharAt( i,Character.toUpperCase(s.charAt(i)));
			}
		}
		System.out.println("Changing Odd Position of String to Upper Case We Get "+buf+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrExample obj = new StrExample();
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Adding String to Itself");
			System.out.println("2. Replacing Odd Position of String with #");
			System.out.println("3. Removing Duplicates from String");
			System.out.println("4. Changing Odd Position of String to Upper Case");
			System.out.println("5 Exit");
			System.out.println("Enter Your Choice ");
			choice = sc.nextLine();
			switch(choice)
			{
			case "1": String s;
					System.out.println("Enter String ");
					s = sc.nextLine();
					obj.setString(s);
					obj.addStringToItself(s);
					break;
					
			case "2": String s1;
					System.out.println("Enter String ");
					s1 = sc.nextLine();
					obj.setString(s1);
					obj.replacePosition(s1);
					break;
			
			case "3": String s2;
					System.out.println("Enter String ");
					s2 = sc.nextLine();
					obj.setString(s2);
					obj.removeDuplicatesFromString(s2);
					break;
			
			case "4": String s3;
					System.out.println("Enter String ");
					s3 = sc.nextLine();
					obj.setString(s3);
					obj.changingOddPositionToUpperCase(s3);
					break;
			
			case "5": System.out.println("Bubye ");
					break;
			
			default: System.out.println("Wrong Option \n");
			}
			
		}while(!choice.equals("5"));
		
		sc.close();
	}

}
