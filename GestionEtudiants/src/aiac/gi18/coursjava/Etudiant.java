package aiac.gi18.coursjava;

public class Etudiant {
	private int id;
	private String nom;
	private double note;
	
	public Etudiant(int id,String nom){
		this.id=id;
		this.nom=nom;
		this.note=10;
	}
	
	@Override
	public String toString() {
		return "("+this.nom+":"+note+")";
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Etudiant)) return false;
		Etudiant etudiant=(Etudiant)obj;
		return this.id==etudiant.id;
	}
	

}
