package test;

import java.time.LocalDate;

import metier.Achat;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;
import metier.Salon;


public class Test {

	public static void main(String[] args) {

		
		Console c1 = new Salon("PS5", 500, LocalDate.parse("2015-01-01"));
		
		Boutique b1= new Boutique ("boutique 1", "2 rue du jeu");
		
		
		Jeu j1= new Jeu("prince1", c1,b1);
		Jeu j2= new Jeu("prince2", c1,b1);
		Jeu j3= new Jeu("prince3", c1,b1);
		Jeu j4= new Jeu("prince4", c1,b1);
		Jeu j5= new Jeu("prince5", c1,b1);
		

		Client cl1 = new Client("Boujdaria","Bilel");
		Client cl2 = new Client("Lay","Caroline");

		
		Achat a1 = new Achat(j1, LocalDate.parse("2022-04-21"), 15.5);
		Achat a2 = new Achat(j2, LocalDate.parse("2022-05-11"), 17.3);
		Achat a3 = new Achat(j3, LocalDate.parse("2022-06-21"), 10.15);

		cl1.getAchats().add(a1);
		cl2.getAchats().add(a3);
		cl1.getAchats().add(a2);

		


		
		
		
		
		
	}

}
