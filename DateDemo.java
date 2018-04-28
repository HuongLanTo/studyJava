import java.util.Date;
import java.util.*;
import java.text.*;

public class DateDemo {
	public static void main(String args[]) {
		//Instantiate a Date object
		Date date = new Date();

		//Display time and date using toString()
		System.out.println(date.toString());

		//Date Formating Using SimpleDateFormat
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(dNow));
	}
}