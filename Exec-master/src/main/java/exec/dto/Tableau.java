package exec.dto;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau{
	
	private float [] tab;
	private int taille;
	private boolean estTrie;
	String comment;
	long id;

	
	public Tableau(int t) {
		tab= new float[t];
		taille=t;
		estTrie=false;
	}
	
	public float getTable(int i) {
		return this.tab[i];
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public boolean getEstTrie() {
		return this.estTrie;
	}
	
	public float[] GenerateurTableAleatoire() {
		for(int i=0;i<this.taille;i++) {
			this.tab[i]= (float)( Math.random()*(2200)-1100);
		}
		return this.tab;
	}
	
	public void setTable(float chg,int i){
		this.tab[i]=chg;
	}
	
		

	public void setTaille(int t){
		this.taille=t;
	}
	


	
	 public float[] triTable() {
		 
             for (int i=0 ;i<=this.taille;i++) {
                     for (int j=i+1;j<this.taille;j++) {
                             if (this.tab[i] > this.tab[j]) {
                                     float x=this.tab[j];
                                     this.tab[j]=this.tab[i];
                                     this.tab[i]=x;
                             }
                     }
             }
             this.estTrie=true;
             return this.tab;
     	}
	 
		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}


	public String toString() {
		return "Tableau "+Arrays.toString(tab);
	}
	

	
	public void main(String[] args) {
		boolean trie;
		boolean nonTrie;
		int Taille= 10;
		
		Tableau tab=new Tableau(Taille);
		tab.GenerateurTableAleatoire();
		tab.triTable();
		trie = tab.getEstTrie();
		System.out.println(trie);
		System.out.println(tab.toString());
	
		Tableau tab1 = new Tableau(Taille);
		tab1.GenerateurTableAleatoire();
		nonTrie = tab1.getEstTrie();
		System.out.println(tab1.toString());

	}
}

	


