/*
******************************************************
*                     Saisie.java                    *
******************************************************
* Auteur               : Pascal SALAÜN               *
* Version              : V2.0                        *
* Date de création     : 17/10/2003                  *
* Date de modification : 14/10/2014                  *
* Compilé sur          : IDE BlueJ 3.1.1             *
*                        javac 1.6.0_32              *
*                        OpenJDK Runtime Environment *
*                          en version IcedTea6 1.13.4*
*                        Debian Wheezy 7.6           *
* Compatibilité        : -                           *
******************************************************
* Fonctionnalité(s) :                                *
* Fichier source Java créant une Class permettant la *
* saisie au clavier en mode console.                 *
******************************************************
* Historique :                                       *
* - 17/10/2003 (V1.0) : Création.                    *
* - 14/10/2014 (V2.0) : Insertion de commentaires.   *
*                       Suppression des méthodes avec*
*                       questions incorporées selon  *
*                       le type de variable à saisir.*
*                       Suppression de la saisie du  *
*                       type "float".                *
******************************************************
*/

/**
 * <p>La classe <code>Saisie</code> permet la saisie de variable au clavier.</p>
 * <p>Cette classe permet de lire, via les méthodes proposées, une variable de type <i>String</i>, <i>int</i>, <i>double</i> ou <i>char</i>.</p>
 * <p><u>Note:</u> Il peut être possible de remplacer cette classe en utilisant la classe <code>Console</code> ou la classe <code>Scanner</code> des API Java.</p>
 * @author Pascal SALAUN
 * @author pascal.salaun@univ-brest.fr
 * @version 2.0
 */

import java.io.*;

public class Saisie
{
	// Variable d'instance
	private String ligne_lue;
	
	//Constructeur
	/** <p>Ce constructeur positionne la variable d'instance <code>ligne_lue</code> à <code>null</code>. </p>
	*/
	public Saisie()
	{
		ligne_lue=null;
	}
	
	//Observateur
	/** <p>Créer un tampon en mode lecture à partir du flux d'entrée <i>System.in</i> </p>
    * @return Retourne la variable d'instance <i>ligne_lue</i> de type <i>String</i> 
    */
	public String lire_String()
	{		
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			ligne_lue=br.readLine();
		}

		catch (IOException e)
		{
			System.err.println(e);
		}
		return ligne_lue;
	}

	/** <p>Transforme la variable d'instance <i>ligne_lue</i> (récupérée par <i>lire_String()</i>) comme un entier (via la classe wrapping <i>Integer()</i> </p>
    * @return Retourne l'entier lu au clavier  
    */

	public int lire_int()
	{
		return Integer.parseInt(lire_String());
	}

	/** <p>Transforme la variable d'instance <i>ligne_lue</i> (récupérée par <i>lire_String()</i>) comme un réel (double) (via la classe wrapping <i>Double()</i> </p>
    * @return Retourne le réel (double) lu au clavier  
    */
	public double lire_double()
	{
		return Double.parseDouble(lire_String());
	}
 
 	/** <p>Transforme la variable d'instance <i>ligne_lue</i> (récupérée par <i>lire_String()</i>) comme un caractère (Unicode). </p>
    * @return Retourne le caractère lu au clavier  
    */
	public char lire_char()
	{
		String reponse=lire_String();
		return reponse.charAt(0);
	}
}
