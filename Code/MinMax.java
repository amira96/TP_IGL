package Code;

/**
 * 
 * @author 	AIOUEZ
 *	<h2>MinLax </h2>
 *<p> Objet MinMax contient deux entiers (min et max)
 */

public class MinMax {
	protected int min ;
	protected int max  ;
	
 public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

public MinMax (int min , int max  ) {
	 this.min = min ;
	 this.max = max;
//
 }
}
