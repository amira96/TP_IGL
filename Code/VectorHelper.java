package Code;
/**
 * 
 * @author BOUAYACHE / AIOUEZ
 * <h2>
 * VectorHelper
 * </h2>
 * <p> Classe qui contient des fonctions de traitement des tableaus d'entier
 *
 */
public class VectorHelper {
	
	
	/**
	 * Faire la somme de deux vecteurs
	 * @param vect1 
	 * Le premier tableau
	 * @param vect2 
	 * Le deuxieme tableau
	 * @return 
	 * <p> Un vecteur qui represente la somme des deux vecteurs en entrée</p>
	 * @throws DifferentSizeException 
	 * Si jamais les deux vecteurs n'ont pas une meme taille
	 */
	public int[] somme (int [] vect1 , int [] vect2) throws DifferentSizeException  {
		ArrayList<Integer> vect = new ArrayList<Integer> ();
		
		
			if (vect1.length != vect2.length)
				
					throw new DifferentSizeException();
				
			else {
				if (vect1.length !=0) {
				for (int i=0;i<vect1.length;i++) {
					vect.add(vect1[i]+vect2[i]);
			    	}
				}
			    }
			
		
		
		return vect.stream().mapToInt(Integer::intValue).toArray();
		
	}
	/**
	 * Trier le tableau Vect en ordre croissant
	 * @param Vect
	 * Un tableau
	 * @return 
	 * <p> Un tableau trié</p>
	 */
	public int[] Tri(int Vect[])
	{
		int i=0,j=0,s=0;
		int ind;
		int min;
		
		for (i=0;i<Vect.length;i++)
		{
			//Recherche de min
			min=Vect[i];
			ind=i;
			for (j=i;j<Vect.length;j++)
			{
				if (Vect[j]<min) 
				{
					min=Vect[j];
					ind=j;
				}
			}
			//Permuter avec le min
			s=Vect[i];
			Vect[i]=Vect[ind];
			Vect[ind]=s;	
		}
		
		return Vect;
		
	}
	/**
	 * Inverser les elements d'un tableu
	 * @param Vect Vecteur de n elements
	 * @return Un tableau dont l'ordre des elements sont inversés
	 */
	public int[] Inverser(int Vect[])
	{
		int inf=0;
		int sup=Vect.length-1;
		int s;
		while (inf<sup)
		{
			s=Vect[inf];
			Vect[inf]=Vect[sup];
			Vect[sup]=s;
			inf++;
			sup--;
		}
		return Vect;
		
	}
	/**
	 * Avoir l'element maximum et le minumu d'un tableau
	 * @param vect Un tableau de longueur n
	 * @return Le Max et le Min du tableau
	 */
	public MinMax minEtMax(int [] vect) {
		 if (vect.length!=0) {
		  Tri(vect);
	
		  MinMax ob = new MinMax(vect[0], vect[vect.length-1]);
		  return ob ;
		 }
		 else { return  new MinMax();}
		 
		
			
		}
	/**
	 * Appliquer une fonction au tableau (Multiplier les elements fois 2)
	 * @param Vect Un tableau de taille n
	 * @return Un tableau resultant la multiplication fois 2
	 */
	public int[] Fonction(int Vect[])
	{
		int i=0;
		while (i<Vect.length)
		{
			Vect[i]=Vect[i]*2;
			i++;
		}
		return Vect;
		
	}
	
	

}
