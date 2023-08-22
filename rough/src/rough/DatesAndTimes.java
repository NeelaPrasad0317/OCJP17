package rough;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DatesAndTimes {

	public static void main(String[] args) {
//		ZoneId zoneId = ZoneId.of("America/Los_Angeles");
//		ZoneId zoneId = ZoneId.of("cst");
		ZoneId zoneId = ZoneId.ofOffset("UTC", ZoneOffset.ofHours(-8));
		
		String displayName = zoneId.getDisplayName(TextStyle.FULL, Locale.US);
		String abbreviation = zoneId.getDisplayName(TextStyle.SHORT, Locale.US);
		ZoneOffset offset = zoneId.getRules().getOffset(Instant.now());
		
		System.out.println(displayName);
		System.out.println(abbreviation);
		System.out.println(offset);
		
		ZonedDateTime zdt=ZonedDateTime.now(zoneId);
		System.out.println(zdt.truncatedTo(ChronoUnit.SECONDS));
//		System.out.println(ZoneId.getAvailableZoneIds());
	}
}
