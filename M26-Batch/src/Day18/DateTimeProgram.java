package Day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeProgram {

	public static void main(String[] args) {
		
		String datetime="2022-04-27 18:15";
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(datetime, df);
		System.out.println(l);
	}

}
