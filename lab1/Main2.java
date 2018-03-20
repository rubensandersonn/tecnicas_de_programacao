/*
	Laboratório 2: Operaçoes com Conjuntos

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2018.1
*/

class Main2{
	public static void main(String args[]){
	
		Conjunto c1;
		Conjunto c2;
		Conjunto c3;
		Conjunto c4;

		c1 = new Conjunto <Integer>();
		c2 = new Conjunto <Integer>();
		c3 = new Conjunto <Integer>();
		c4 = new Conjunto <Integer>();
		
		Conjunto C = new Conjunto();
		
		for (int i = 1; i <= 10; i++){
			c1.addEl(i);
			if (i % 2 == 0){
				c2.addEl(i);
			}else{
				c3.addEl(i);				
			}

			// primos
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

		// conjuntos feitos...
		System.out.println("\n Conjuntos Formados:\n");
		c1.show();
		c2.show();
		c3.show();
		c4.show();

		C.addEl(c1);
		C.addEl(c2);
		C.addEl(45);
		
		C.show();
		
		Conjunto Cart = OpConj.subconjuntos(c2);
		
		Cart.show();
	}
}
