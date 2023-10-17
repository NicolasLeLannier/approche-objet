package dr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Date d = new Date(120, 5, 28);
//		System.out.println(d);
		
		// Il faut utiliser la classe java.util.Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getTime());
		
		// Date personnalisée
		cal.set(2020, 9, 12, 10, 57, 28);
		System.out.println(cal.getTime());
		
		// Modifie un paramètre précis
		cal.set(Calendar.YEAR, 2021);
		System.out.println(cal.getTime());
		
		// Conversion des dates avec SimpleDateFormat : Date ==> String ou  String ==> Date
		SimpleDateFormat formateur = new SimpleDateFormat("EEEE dd MMM YYYY à HH'h':mm'm':ss's'", Locale.FRANCE);
		Date d2 = cal.getTime();
		String dateFormatee = formateur.format(d2);
		System.out.println(dateFormatee);
	}

}
