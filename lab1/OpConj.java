/*
	Laboratório 2: ConjuntoInts

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2-18.1

*/

abstract class OpConj {
	
	// (1.5)
	public static Conjunto union(Conjunto c1, Conjunto c2){
		c1.addSet(c2);
		return c1;
	}

	// (1.6)
	public static Conjunto intersec(Conjunto c1, Conjunto c2){
		
		return new Conjunto(c1.getAll().retainAll(c2.getAll()));
		
	}
	
	// (1.7)
	
	public static Conjunto minus(Conjunto c1, Conjunto c2){
		
		return new Conjunto(c1.getAll().removeAll(c2.getAll()));
		
	}
}