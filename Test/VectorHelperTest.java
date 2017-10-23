package test;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;

import org.junit.Test;

import code.DifferentSizeException;
import code.MinMax;
import code.VectorHelper;

public class VectorHelperTest {

	

	@Test
	public void testTri() {
		VectorHelper v =  new VectorHelper();
		//cas vide  
		int [] tab1 = new int [0] ,tab2 = new int[0];
		sort(tab1);
		v.Tri(tab2);
		assertArrayEquals("tri d'un tableau vide .",tab1, tab2); 
		//cas non vide
		int [] tab3=  {1,6,-4,2,-5,8} , tab4  = {1,6,-4,2,-5,8} ;
		sort(tab3);
		v.Tri(tab4);
		assertArrayEquals("Tri d'un  tableau aleatoire .",tab3, tab4);  
	}

	//____________________________________________________________________
	
	@Test(expected = DifferentSizeException.class) //test de l'exception 
    public void sommeTabDeTailleDiff() throws  DifferentSizeException {
        VectorHelper V = new VectorHelper();
    	int [] tab1=  {1,6,-4,2,-5,8} , tab2  = {1,6} ;
        V.somme(tab1,tab2);
    }
	
	//___________________________________________
	@Test
	public void testMinEtMax() {
		VectorHelper v =  new VectorHelper();
		MinMax ob = new MinMax();
		//cas vide  
		int [] tab1 = new int [0] ;
	    assertTrue(ob.equals(v.minEtMax(tab1)));
	    //cas une seule case 
		int [] tab2 = {3} ;
		MinMax ob2 = new MinMax(3,3);
		assertTrue(ob2.equals(v.minEtMax(tab2)));
		//tableau aleatoire 
		int[] tab3 = {1,6,0,0,-4,2,-5,8,0};
		MinMax ob3 = new MinMax(-5,8);
		assertTrue(ob3.equals(v.minEtMax(tab3)));
		
		//_____________________________________________
	}
	@Test
	public void testInverser() {
		VectorHelper v =  new VectorHelper();
		//cas vide  
		int [] tab1 = new int [0] ;
		assertArrayEquals("Inverser un tableau vide ",tab1, v.Inverser(tab1));
		//cas non vide 
		
		int [] tab2=  {1,6,0,0,-4,2,-5,8,0} , tab3 = {0,8,-5,2,-4,0,0,6,1 };
		assertArrayEquals("Inverser un tableau aleatoire  ",tab3, v.Inverser(tab2));

	}

	
		//__________________________________________________
		
		
	

	@Test
	public void testFonction() {
		VectorHelper v =  new VectorHelper();
		//cas vide  
		int [] tab1 = new int [0] ;
		assertArrayEquals("Tableau vide .", tab1,v.Fonction(tab1));
		//cas non vide
		int[] tab2 = {1,6,0,0,-4,2,-5,8,0}, tab3 = {2,12,0,0,-8,4,-10,16,0};
		assertArrayEquals("tableau aleatoire .",tab3, v.Fonction(tab2));
	}
	
	
//_______________________________________________________________
	@Test
	public void testSomme() throws DifferentSizeException {
		VectorHelper v = new VectorHelper();
		
		//cas vide 
		int [] tab1 = new int [0], tab2 = new int [0];
		assertArrayEquals("Somme de deux tabeaux vides  .", tab1, v.somme(tab1, tab2));
		
		//cas non vide 
		int [] tab3 = {1,6,0,0,-4,2,-5,8,0}, tab4 ={1,1,1,1,1,-1,-1,-1,-1}, tab5 = {2,7,1,1,-3,1,-6,7,-1};
		assertArrayEquals("Somme de deux tabeaux alea  .",tab5 , v.somme(tab3, tab4));
		
		
	
	}
}
