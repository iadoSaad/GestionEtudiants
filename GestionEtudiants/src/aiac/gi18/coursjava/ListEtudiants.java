package aiac.gi18.coursjava;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant> {

	
	@Override
	public boolean add(Etudiant e) {
		int index=this.indexOf(e);
		if(index<0) return super.add(e);
		this.set(index, e);
		return true;
	}
	
	public List<Etudiant> filtrer(Condition c) {
		List<Etudiant> ret=new ListEtudiants();
		for (int i = 0; i < this.size(); i++) {
			Etudiant e=this.get(i);
			if(c.estVrai(e)) ret.add(e);
		}
		return ret;
	}
}
