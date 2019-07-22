import java.time.LocalDate;
import java.util.*;

public class ExpiryDate {
	
	public String purchaseDate;
	public int waranteeInYears;
	public int warranteeInMonths;
	
	public void duration(String purchaseDate, int waranteeInYears, int waranteeInMonths)
	{
		//YearMonth yWarrantyPeriod=YearMonth.parse(warrantyPeriod, DateTimeFormatter.ofPattern("yMM"));
		LocalDate obj = LocalDate.parse(purchaseDate);
		LocalDate ans = obj.plusYears(waranteeInYears);
		ans = ans.plusMonths(waranteeInMonths);
		System.out.println("Warantee Expires on "+ans);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpiryDate obj = new ExpiryDate();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Purchase Date ");
		String st = s.nextLine();
		System.out.println("Enter Months of Warrantee ");
		int year = s.nextInt();
		System.out.println("Enter Years of Warantee ");
		int month = s.nextInt();
		obj.duration(st,year,month);
		s.close();

	}

}
