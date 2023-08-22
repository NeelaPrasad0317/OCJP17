package p1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class NumberDateFormatting {

	public static void main(String[] args) {
		NumberFormat n1=new DecimalFormat("#,##,##,###.####");
		NumberFormat n2=new DecimalFormat("0,00,00,000.0000");
//		NumberFormat n3=new DecimalFormat("0,00,##,000.0000");//illegal arg exception
		NumberFormat n3=new DecimalFormat("'Your bal is:'#########.##");
		
		double bal=1635.2872323;
		System.out.println(n1.format(bal));
		System.out.println(n2.format(bal));
		System.out.println(n3.format(bal));
		
		LocalDate d=LocalDate.of(2021,07,05);
		LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.of(d, t);
		ZonedDateTime zdt=ZonedDateTime.of(dt, ZoneId.of("Asia/Kolkata"));
		
		System.out.println(d.format(DateTimeFormatter.ISO_DATE));
		System.out.println(t.format(DateTimeFormatter.ISO_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(zdt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		
		System.out.println(dt.getDayOfYear());
		System.out.println(dt.format(DateTimeFormatter.ofPattern("d/M/yyy, hh:mm:ss")));
		System.out.println(dt.format(DateTimeFormatter.ofPattern("d/MM/yyy, hh:mm:ss")));
		System.out.println(dt.format(DateTimeFormatter.ofPattern("d/MMM/yyy, hh:mm:ss")));
		System.out.println(zdt.format(DateTimeFormatter.ofPattern("dd/MMMM/YYYY, hh:mm:ss Z '['zzzz']'")));
	}
}
