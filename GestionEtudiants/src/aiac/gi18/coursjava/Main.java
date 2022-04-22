package aiac.gi18.coursjava;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Créer 3 Etudiants e1(1, ‘’hamid’’ ), e2(2, ‘’driss’’) et e3(1, ‘’youssef’’) .
		Etudiant e1 = new Etudiant(1, "hamid"), 
				e2 = new Etudiant(2, "driss"), 
				e3 = new Etudiant(1, "Youssef");
		e1.setNote(15);
		e2.setNote(12);
		e3.setNote(16);
		
		ListEtudiants mesEtudiants=new ListEtudiants();
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		
		Collections.sort(mesEtudiants);
		System.out.println(mesEtudiants);
	
		List<Etudiant> l=  mesEtudiants.filtrer(e -> e.getNote()>13);
		System.out.println(l);
	}

}
