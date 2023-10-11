package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listeEntier = new ArrayList<>();
		listeEntier.add(-1);
		listeEntier.add(5);
		listeEntier.add(7);
		listeEntier.add(3);
		listeEntier.add(-2);
		listeEntier.add(4);
		listeEntier.add(8);
		listeEntier.add(5);
		
		for(int contenuList : listeEntier) {
			System.out.println(contenuList);
		}
		
		System.out.println("Taille de la liste : " + listeEntier.size());
		
		System.out.println("Plus grand élément de la liste : " + Collections.max(listeEntier));
		
		int minimum = listeEntier.get(0); 
		int idMinimum = 0;
        for (int i = 1; i < listeEntier.size(); i++) { 
            if (minimum > listeEntier.get(i)) {
            	minimum = listeEntier.get(i); 
            	idMinimum = i;
            }
        } 
        System.out.println("Plus petit élément de la liste : " + minimum); 
		listeEntier.remove(idMinimum);
		
		for(int contenuList : listeEntier) {
			System.out.println(contenuList);
		}
		
		for(int i = 0; i < listeEntier.size(); i++) {
			if(listeEntier.get(i) < 0) {
				listeEntier.set(i, listeEntier.get(i) * -1);
			}
		}
		
		System.out.println("\n------------------------\n");
		for(int contenuList : listeEntier) {
			System.out.println(contenuList);
		}
	}
}
