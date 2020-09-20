

public class variateurVitesse
{   
	// Déclaration des variables ainsi que des constantes
	private final byte VITESSE_NULLE = -128;
	private final byte VITESSE_MAX = 127;
	private final int PAS = 20;
	
	
	private byte vitesseVariateur;
	private boolean commandeMarche;
	private String nom;
	
     
     // Constructeurs (méthodes)
	public variateurVitesse(String nom)
	{  
		vitesseVariateur = VITESSE_NULLE;
		this.nom = nom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	
	// Modificateurs
	public void setVitesseMax()
	{
		vitesseVariateur = VITESSE_MAX;
	}

	public void setVitesseMin()
	{
		vitesseVariateur = VITESSE_NULLE;		
	}
	
	public void setDemarrageVariateur()
	{
		commandeMarche = true;
	}
	
	public void setArretVariateur()
	{
		commandeMarche = false;
	}
	
	public void setAugmenterVitesse()
	{
		if (commandeMarche == true)
		{
			if (vitesseVariateur + PAS < VITESSE_MAX)
			{
				vitesseVariateur += PAS;
			}
			else {vitesseVariateur = VITESSE_MAX;}
			
		}
		
	}
	
	public void setDiminuerVitesse()
	{
		if (commandeMarche == true)
		{
			if (vitesseVariateur - PAS > VITESSE_NULLE )
			{
				vitesseVariateur -= PAS;	
			}
			else {vitesseVariateur = VITESSE_NULLE;}
			
		}
		
	}
	
	// Observateurs (accesseurs ou interrogateurs)
	public byte getVitesseVariateur()
	{
	  return vitesseVariateur;
	}
	
	public boolean getCommandeMarche()
	{
		return commandeMarche;
	}
	
	public byte getVitesseMin()
	{
		return VITESSE_NULLE;
	}
	
	public byte getVitesseMax()
	{
		return VITESSE_MAX;
	}
	
	public int getPas()
	{
		return PAS;
	}
}

