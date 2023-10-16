package fr.diginamic.automates;

import java.util.Random;

public class JeuDeLaVie {
	protected int colonnes = 10;
	protected int lignes = 5;
	protected int popultaionDeBase = 10;
	protected boolean[][] cellules = new boolean[colonnes][lignes];
	Random nbAleatoire = new Random();
	
	public JeuDeLaVie() {
		for(int i = 0; i < popultaionDeBase; i++) {
			int colonnesX = 0;
			int lignesY = 0;
			
			do {
				colonnesX = nbAleatoire.nextInt(colonnes);
				lignesY = nbAleatoire.nextInt(lignes);
//				System.out.println("X : " + colonnesX + "  |  Y : " + lignesY);
			} while(cellules[colonnesX][lignesY] == true);
			cellules[colonnesX][lignesY] = true;
		}
	}
	
	public JeuDeLaVie(int[][] plateauJeu) {
//		for(int i = 0; i < plateauJeu[].length; i++) {
//			
//		}
	}
	
	public boolean Survie(int x, int y) {
		if(!cellules[x][y]) {
			return false;
		}
		
		int nbVoisin = NbVoisins(x, y);
		if(nbVoisin > 1 && nbVoisin < 4) {
			return true;
		}
		return false;
	}
	
	public boolean Naissance(int x, int y) {
		return cellules[x][y] == false && NbVoisins(x, y) == 3;
	}
	
	public int NbVoisins(int x, int y) {
		int result = 0;
		for(int i = x - 1; i < x + 2; i++) {
			for(int f = y - 1; f < y + 2; f++) {
				if(estInclus(i, f) && (!(x == i && y == f)) && cellules[i][f]) {
					result ++;
				}
			}
		}
		return result;
	}
	
	public boolean estInclus(int x, int y) {
		return x > -1 && x < colonnes && y > -1 && y < lignes;
	}
	
	public void generationSuivante() {
		boolean[][] genSuivante = new boolean[colonnes][lignes];
		
		for(int i = 0; i < colonnes; i++) {
			for(int f = 0; f < lignes; f++) {
				genSuivante[i][f] = Naissance(i, f) || Survie(i, f);
			}
		}
		cellules = genSuivante;
	}
	
	public String AfficherJeu() {
		String result = "";
		
		for(int i = 0; i < lignes; i++) {
			result += "|";
			for(int f = 0; f < colonnes; f++) {
//				System.out.print("x : " + i + " y : " + f);
				if(cellules[f][i]) {
					result += "X";
				} else {
					result += " ";
				}
				result += "|";
			}
			result += "\n";
		}
		
		return result;
	}	
	
}
