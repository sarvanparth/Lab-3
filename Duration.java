import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Duration {
	
	public String str;
	
	public void findDuration(String str)
	{
		LocalDate obj = LocalDate.parse(str);
		LocalDate today=LocalDate.now();
		long days = ChronoUnit.DAYS.between(obj,today);
		long months = ChronoUnit.MONTHS.between(obj, today);
		long years = ChronoUnit.YEARS.between(obj, today);
		System.out.println("Total Duration between todays date and entered date is "+years+" years "+months+" months "+days+" days.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duration obj = new Duration();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Date ");
		String str = s.nextLine();
		obj.findDuration(str);
		s.close();

	}

}
