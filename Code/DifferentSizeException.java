package Code;

/**
 * 
 * @author AIOUEZ
 *	<p>
 *	Exception levé lors la taille des deux tableaus ne sont pas identiques</p>
 */

public class DifferentSizeException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Les deux vecteurs sont de taille différentes .";
	}
	

}
