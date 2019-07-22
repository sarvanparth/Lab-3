import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneTime {
	public String zoneId;
	
	public void dateAndTime(String str) {
		
		LocalDateTime ldt = LocalDateTime.now();
		ZoneId Id = ZoneId.of(str);
	    System.out.println("TimeZone : " + Id);

	    //LocalDateTime + ZoneId = ZonedDateTime
	    ZonedDateTime ZonedDateTime = ldt.atZone(Id);
	    System.out.println("Date and Time of Given Zone : " + ZonedDateTime);
	}
	
	public static void main(String[] args){
		
		ZoneTime obj = new ZoneTime();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Zone Id: ");
		String str = s.nextLine();
		obj.dateAndTime(str);
		s.close();
	}
	
}
