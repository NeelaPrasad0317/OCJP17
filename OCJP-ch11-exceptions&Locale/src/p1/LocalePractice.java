package p1;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Currency;
import java.util.Locale;
import java.util.Locale.Category;

public class LocalePractice {

	public static void main(String[] args) {

		/*Locale.setDefault(new Locale("hi", "IN"));
		System.out.println(Locale.getDefault());
		
		double att = 1203333.32526;
		
		var n1 = NumberFormat.getInstance();
		System.out.println(n1.format(att));
		
		var n2 = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(n2.format(att));
		var n3 = NumberFormat.getNumberInstance(Locale.GERMANY);
		System.out.println(n3.format(att));
		
		var c1 = NumberFormat.getCurrencyInstance();
		System.out.println(c1.format(att));
		var c2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(c2.format(att));
		var c3 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(c3.format(att));
		var c4 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(c4.format(att));
		
		var com = NumberFormat.getCompactNumberInstance();
		System.out.println(com.format(att));
		var com1 = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
		System.out.println(com1.format(att));
		var com2 = NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG);
		System.out.println(com2.format(att));
		var com3 = NumberFormat.getCompactNumberInstance(Locale.FRANCE, Style.LONG);
		System.out.println(com3.format(att));
		
		System.out.println();
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		System.out.println(zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		System.out.println(zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		System.out.println(zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		
		Locale.setDefault(new Locale("en","US"));
		print(zdt, DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG), new Locale("it", "IT"));
		Locale.setDefault(Category.DISPLAY,new Locale("es","ES"));
		print(zdt, DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG), new Locale("it", "IT"));
		Locale.setDefault(Category.FORMAT,new Locale("es","ES"));
		print(zdt, DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG), new Locale("it", "IT"));
		*/
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//		System.out.println(LocalDateTime.parse("2022-10-29 23:59:50", pattern));
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
//		"yyyy-MM-dd HH:mm:ss[XXX]"
		System.out.println(LocalDateTime.parse("2022-10-29 23:59:50", ofPattern));
//		int x;
//		System.out.println(x);
	}

	private static void print(ZonedDateTime dt, DateTimeFormatter dtf, Locale locale) {
		System.out.println(dtf.format(dt)+"-------"+dtf.withLocale(locale).format(dt));
	}
}
