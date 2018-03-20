/*
	Laboratório 2: Conjuntos

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2-18.1
*/

class Main {
	
	ConjuntoInt c1 = new ConjuntoInt();
	ConjuntoInt c2 = new ConjuntoInt();
	ConjuntoInt c3 = new ConjuntoInt();
	ConjuntoInt c4 = new ConjuntoInt();

	public static void main(String[] args) {

		System.out.println("Laboratorio 2 - Tecnicas de programacao!");
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
				for (j = 2; j <= i/2; j++){
					if (j % i == 0 && j != i){
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
		System.out.println("Conjuntos Formados:")
		c1.show();
		c2.show();
		c3.show();
		c4.show();

		/*
		// agora, testando as questoes...
		System.out.println(" Questao 2");
		a();
		b();
		c();
		d();
		e();
		*/
	}

	private void a(){
		System.out.println("a) O conjunto 4 eh subconjunto de si mesmo? " + c4.containsSet(c4));
	}

	private void b(){
		System.out.println("b) Os conjuntos 2, 3 e 4 sao subconjuntos de 1? " + c1.containsSet(c2) + "," + c1.containsSet(c3) + "," + c1.containsSet(c4));
	}
	private void c(){
		System.out.println("c) A uniao de 2 e 3: " + OpConj.union(c2, c3).show());
		System.out.println("c) O Conjunto 1: " + c1.show());
	}

	private void d(){
		System.out.println("d) Os conjuntos 2 e 1 tem interseccao " + OpConj.intersec(c1, c2).show());
	}
	private void e(){
		System.out.println("e) Os conjuntos 1 e 2 tem diferenca " + OpConj.minus(c1, c2).show());
	}
	

}