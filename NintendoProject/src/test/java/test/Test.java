package test;

import java.time.LocalDate;

import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {

		
		Console c1 = new Console("PS5", 500, LocalDate.parse("2015-01-01"));
		
		Jeu j1= new Jeu("prince1", c1);
		Jeu j2= new Jeu("prince2", c1);
		Jeu j3= new Jeu("prince3", c1);
		Jeu j4= new Jeu("prince4", c1);
		Jeu j5= new Jeu("prince5", c1);
		

		Client cl1 = new Client("Boujdaria","Bilel");
		Client cl2 = new Client("Lay","Caroline");

		Boutique b1= new Boutique ("boutique 1", "2 rue du jeu");
		
		


		
		
		
		
		
	}

}
