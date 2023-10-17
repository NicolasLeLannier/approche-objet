package dr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date(20, 5, 26);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/YYYY");
		String dateFormatee = formateur.format(d);
		System.out.println(dateFormatee);
		
		Date d2 = new Date(116, 5, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		String dateFormatee2 = formateur2.format(d2);
		System.out.println(dateFormatee2);
		
		Date d3 = new Date();
		String dateFormatee3 = formateur2.format(d3);
		System.out.println(dateFormatee3);
	}

}
