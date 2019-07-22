import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class UpdatedDuration {
	
	public String str1;
	public String str2;
	
	public void findDuration(String str1, String str2)
	{
		LocalDate obj1 = LocalDate.parse(str1);
		LocalDate obj2 = LocalDate.parse(str2);
		//LocalDate today=LocalDate.now();
		long days = ChronoUnit.DAYS.between(obj1,obj2);
		long months = ChronoUnit.MONTHS.between(obj1, obj2);
		long years = ChronoUnit.YEARS.between(obj1, obj2);
		System.out.println("Total Duration between todays date and entered date is "+years+" years "+months+" months "+days+" days.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UpdatedDuration obj = new UpdatedDuration();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Date1 ");
		String str1 = s.nextLine();
		System.out.println("Enter Date2 ");
		String str2 = s.nextLine();
		obj.findDuration(str1,str2);
		s.close();
	}

}
