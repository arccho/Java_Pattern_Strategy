package chaine.emission;

public class Reportage extends Emission implements TypeReportage {
	
	private String Nom;
	private String Theme;
	private int Duree;
	
	public Reportage(String nom, String theme, int duree)
	{
		super(nom);
		Theme = theme;
		Duree = duree;
	}

	public String getNom() {
		return Nom;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public int getDuree() {
		return Duree;
	}

	public void setDuree(int duree) {
		Duree = duree;
	}
	
}
