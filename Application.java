import java.io.*;
import java.lang.Thread;


	
public class Application
{	
	/* *****************************************************************************MENU********************************************************************************* */
	
	public static void main(String args[])
	{
		char touche;
		Saisie lire = new Saisie();
		variateurVitesse variateur1 = new variateurVitesse("ATV58"); // Déclaration et création de l'objet 
		variateurVitesse variateur2 = new variateurVitesse("ATV28"); // Déclaration et création de l'objet
		
		do
		{
			// Menu Principal
			System.out.println (" ---------------------------------");
			System.out.println (" Choisir le variateur a controler");
			System.out.println (" ---------------------------------");
			System.out.println (" 1 : Controle du variateur : " + variateur1.getNom());
			System.out.println (" 2 : Controle du variateur : " + variateur2.getNom());
			System.out.println ("'q' ou 'Q' : Quitter le programme");
			System.out.println (" ------------------------------------------------");
			System.out.println ("Etat de " + variateur1.getNom() + " : " + variateur1.getCommandeMarche() + " || " + "Vitesse de " + variateur1.getNom() + " : " + variateur1.getVitesseVariateur());
			System.out.println ("Etat de " + variateur2.getNom() + " : " + variateur2.getCommandeMarche() + " || " + "Vitesse de " + variateur2.getNom() + " : " + variateur2.getVitesseVariateur());
			System.out.println (" ------------------------------------------------");
			
		
			touche = lire.lire_char();
			
			switch (touche)
			{
				case '1': Commande(variateur1);break;
				
				case '2': Commande(variateur2);break;
						
				case 'q': variateur1.setVitesseMin(); variateur1.setArretVariateur(); variateur2.setVitesseMin(); variateur2.setArretVariateur(); // Commande passe à false et vitesse à mini
						  System.exit(1);
				case 'Q': variateur1.setVitesseMin(); variateur1.setArretVariateur(); variateur2.setVitesseMin(); variateur2.setArretVariateur(); // Commande passe à false et vitesse à mini
						  System.exit(1);
						  
				default : System.out.println("Saisie invalide");
			}
		} while (touche != 'q' && touche != 'Q');
	}

	/* ********************************************************************FONCTION COMMANDES VARIATEURS**************************************************************/
	
	public static void Commande(variateurVitesse variateur)
	{
		char touche2;
		Saisie lire = new Saisie();
		
		do
		{			
			boolean marche = variateur.getCommandeMarche();
			byte vitesse = variateur.getVitesseVariateur();
			byte vitesseMin = variateur.getVitesseMin();
			byte vitesseMax = variateur.getVitesseMax();
			int pas = variateur.getPas();
			
			// Menu des commandes du variateur
			System.out.println (" Commande du variateur ");
			System.out.println (" 'm' ou 'M' : Commande de marche");
			System.out.println (" 'a' ou 'A' : Commande d'arret");
			System.out.println (" '+' : Augmentation vitesse");
			System.out.println (" '-' : Diminution vitesse");
			System.out.println (" 'q' ou 'Q' : Retour");
			System.out.println (" --------------------------------------------");
			System.out.println ("Etat du variateur : " + marche + " || " + " Vitesse : " + vitesse);
			System.out.println (" --------------------------------------------");
			
			touche2 = lire.lire_char();
			
			switch (touche2)
			{
				case 'm': variateur.setDemarrageVariateur();break;
				case 'M': variateur.setDemarrageVariateur();break;
				
				case 'a': variateur.setArretVariateur();break;
				case 'A': variateur.setArretVariateur();break;
				
				case '+': variateur.setAugmenterVitesse();break;
				case '-': variateur.setDiminuerVitesse();break;
				
				case 'q': break;
				case 'Q': break;
				default : System.out.println("Saisie invalide");
			}
		} while (touche2 != 'q' && touche2 != 'Q');
	}
}





