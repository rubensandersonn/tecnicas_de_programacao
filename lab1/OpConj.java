/*
	Laboratório 2: Operaçoes com Conjuntos

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2018.1
*/

import java.util.ArrayList;

abstract class OpConj {
	
	// (1.5)
	public static Conjunto union(Conjunto c1, Conjunto c2){
		Conjunto c = new Conjunto();
		c.addSet(c1);
		c.removeSet(c2);
		c.addSet(c2);
		return c;
	}

	// (1.6)
	public static Conjunto intersec(Conjunto c1, Conjunto c2){
		
		ArrayList v = new ArrayList();
		ArrayList v2 = new ArrayList();
		v = c1.getAll();
		v2 = c2.getAll();
		v.retainAll(v2);
		return new Conjunto(v);
	}
	
	// (1.7)
	
	public static Conjunto minus(Conjunto c1, Conjunto c2){
		Conjunto c = new Conjunto();
		c.addSet(c1);

		c.removeSet(c2);

		return c;
		
	}
	
	
	// lista de todos os pares ordenados tal que o primeiro termo pertence a c1 e o segundo a c2.
	public static Conjunto prodCartesiano(Conjunto c1, Conjunto c2){
		
		ArrayList S1 = c1.getAll();
		ArrayList S2 = c2.getAll();
		
		ArrayList S = new ArrayList();
		
		int s1 = S1.size();
		int s2 = S2.size();
		
		
		for (int i = 0; i < s1; i++){
			for (int j = 0; j < s2; j++){
				ArrayList ar = new ArrayList();

				ar.add(S1.get(i));
				ar.add(S2.get(j));
				S.add(new Conjunto( ar ));
			}
		}
		
		return new Conjunto(S);
		
	}
	
	public static Conjunto subconjuntos(Conjunto c1){
		ArrayList S1 = c1.getAll();
		Conjunto S = new Conjunto();

		for (int i = 0; i < S1.size(); i++) {
			for (int j = i+1; j <= S1.size(); j++) {
				ArrayList ar = new ArrayList();

				ar.addAll(S1.subList(i, j));
				S.addEl(new Conjunto(ar));
			}
			
		}

		return S;
	}

	public static Conjunto complemento(Conjunto U, Conjunto c1){
		return OpConj.minus(U, c1);
	}

	public static Conjunto primos(int maxi){
	
	Conjunto c4 = new Conjunto();

	for (int i = 1; i <= maxi; i++){

		if (i > 1){
			boolean primo = true;
			int j = 2;
			for (j = 2; j < i; j++){
				//System.out.println(j/i);
				if (i % j == 0 && j != i){
					primo = false;
					break;
				}
			}
			if (primo){
				c4.addEl(j);
			}
		}
	}

	return c4;
}

}
