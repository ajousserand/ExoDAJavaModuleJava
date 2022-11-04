package echec;

import java.util.Scanner;

public class Executeur {
	public static void main(String[] args) {//rajout du mot clé static qui doit être présent dans la méthode main et changement de character en string
		String nom1=ajoutNom("1");
		String nom2=ajoutNom("2");
		Game g = new Game(nom1,nom2);
		g.lancer(); // changement de Game en g car on faisait reference à une methode statique 
	}
	
	public static String ajoutNom(String nom) {
		Scanner s =new Scanner(System.in);
		System.out.println("Quel est le nom du joueur "+nom);
		String nom1 =s.nextLine();
		return nom1;
	}
}
