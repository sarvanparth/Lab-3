import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ModifiedPersonDetails {
	public String fName;
	public String lName;
	public int age;
	
	public void calculateAge(String str)
	{
		LocalDate obj = LocalDate.parse(str);
		LocalDate obj2 = LocalDate.now();
		this.age = (int)ChronoUnit.YEARS.between(obj, obj2);
	}
	
	public StringBuilder getFullName(String f, String l) {
		
		StringBuilder sb = new StringBuilder(f);
		sb.append(" ");
		sb.append(l);
		return sb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifiedPersonDetails obj = new ModifiedPersonDetails();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Name ");
		obj.fName = s.nextLine();
		System.out.println("Enter Last Name ");
		obj.lName = s.nextLine();
		System.out.println("Enter Date of Birth ");
		String str = s.nextLine();
		obj.calculateAge(str);
		StringBuilder sb = obj.getFullName(obj.fName, obj.lName);
		System.out.println("Full Name is "+sb);
		System.out.println("Age is "+obj.age);
		s.close();
	}

}
