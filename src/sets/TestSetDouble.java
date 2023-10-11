package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double min =  999;
		
		HashSet<Double> list = new HashSet<>();
		list.add(1.5);
		list.add(8.25);
		list.add(-7.32);
		list.add(13.3);
		list.add(-12.45);
		list.add(48.5);
		list.add(0.01);
		
		for(double contenu : list) {
			System.out.println(contenu);
		}
		
		System.out.println("Plus grand élément : " + Collections.max(list));
		
		System.out.println("-----------------");
		
		Iterator<Double> iterator = list.iterator();
		while(iterator.hasNext()) {
			Double contenu = iterator.next();
			if(contenu < min) {
				min = contenu;
			}
		}
		
		list.remove(min);
		
		for(double contenu : list) {
			System.out.println(contenu);
		}
	}

}
