package dr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		cal.set(2026, 5, 19, 23, 59, 30);
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/YYYY");
		Date d1 = cal.getTime();
		String dateFormatee = formateur.format(d1);
		System.out.println(dateFormatee);
		
		Calendar cal2 = Calendar.getInstance();
		
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date d2 = cal2.getTime();
		String dateFormatee2 = formateur2.format(d2);
		System.out.println(dateFormatee2);
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMM YYYY à HH'h':mm'm':ss's'", Locale.CHINESE);
		String dateFormatee3 = formateur3.format(d2);
		System.out.println(dateFormatee3);
		
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMM YYYY à HH'h':mm'm':ss's'", Locale.GERMAN);
		String dateFormatee4 = formateur4.format(d2);
		System.out.println(dateFormatee4);
		
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEE dd MMM YYYY à HH'h':mm'm':ss's'", new Locale("ru", "RU"));
		String dateFormatee5 = formateur5.format(d2);
		System.out.println(dateFormatee5);
	}

}
