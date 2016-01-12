package exec.dto;


import java.util.Scanner;

public class Menu {

	String comment;
	long id;


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

	public static void main(String[] args) {
		
			int Taille=10;
			
			Tableau tab1=new Tableau(Taille);
			tab1.GenerateurTableAleatoire();
			tab1.triTable();
			boolean trie = tab1.getEstTrie();
			System.out.println(tab1.toString());
			System.out.println(trie);
			
			Tableau tab2=new Tableau(Taille);
			tab2.GenerateurTableAleatoire();
			boolean nonTrie = tab2.getEstTrie();
			System.out.println(tab2.toString());
			System.out.println(nonTrie);
				
	}
}