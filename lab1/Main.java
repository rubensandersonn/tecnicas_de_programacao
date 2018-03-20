/*
	Laboratório 2: Operaçoes com Conjuntos

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2018.1
*/


class Main {
	

	public static void main(String[] args) {
		
		Conjunto c1;
		Conjunto c2;
		Conjunto c3;
		Conjunto c4;

		c1 = new Conjunto <Integer>();
		c2 = new Conjunto <Integer>();
		c3 = new Conjunto <Integer>();
		c4 = new Conjunto <Integer>();

		System.out.println("\n=============== Laboratorio 2 = Tecnicas de programacao! - Rubens Anderson, 362984==================");

		// formando os conjuntos padrao...

		for (int i = 1; i <= 10; i++){
			c1.addEl(i);
			if (i % 2 == 0){
				c2.addEl(i);
			}else{
				c3.addEl(i);				
			}

		}

		// definindo o conjunto de primos...
		c4 = OpConj.primos(10);

		// conjuntos feitos...
		System.out.println("\n\t Conjuntos Formados:\n");
		c1.show();
		c2.show();
		c3.show();
		c4.show();

		// Iniciando chamadas de questoes...
		questao2(c1, c2, c3, c4);
		questao3();
		questao4(c1, c2, c3, c4);
		questao5();
		System.out.println();
		
	}

	private static void questao2(Conjunto c1, Conjunto c2, Conjunto c3, Conjunto c4){
		
		System.out.println("\n===== Questao 2:=======\n");

		System.out.println("a) O conjunto 4 eh subconjunto de si mesmo? " + c4.containsSet(c4));
	
		System.out.println("b) Os conjuntos 2, 3 e 4 sao subconjuntos de 1? " + c1.containsSet(c2) + "," + c1.containsSet(c3) + "," + c1.containsSet(c4));
	
		System.out.println("c) A uniao de 2 e 3: " + OpConj.union(c2, c3).getAll());
		System.out.println("c) O Conjunto 1: " + c1.getAll());
		
	
		System.out.println("d) Os conjuntos 2 e 1 tem interseccao " + OpConj.intersec(c1, c2).getAll());
		System.out.println("e) Os conjuntos 1 e 2 tem diferenca " + OpConj.minus(c1, c2).getAll());

	}
	private static void questao3(){
		
		Conjunto cc1 = new Conjunto <Object>(); // all
		Conjunto cc2 = new Conjunto <Object>(); // impares
		Conjunto cc3 = new Conjunto <Object>(); // pares
		Conjunto cc4 = new Conjunto <Object>(); // vazio para testar se conj vazio eh subconj

		

		cc1.addEl("nome1");
		cc1.addEl("nome2");
		cc1.addEl("nome3");
		cc1.addEl("nome4");

		cc2.addEl("nome1");
		cc2.addEl("nome3");

		cc3.addEl("nome2");
		cc3.addEl("nome4");

		System.out.println("\n\t Conjuntos Formados:\n");
		cc1.show();
		cc2.show();
		cc3.show();
		cc4.show();

		System.out.println("\n===== Questao 3:=======\n");

		System.out.println("a) O conjunto 4 eh subconjunto de si mesmo? " + cc4.containsSet(cc4));
	
		System.out.println("b) Os conjuntos 2, 3 e 4 sao subconjuntos de 1? " + cc1.containsSet(cc2) + "," + cc1.containsSet(cc3) + "," + cc1.containsSet(cc4));
	
		System.out.println("c) A uniao de 2 e 3: " + OpConj.union(cc2, cc3).getAll());
		System.out.println("c) O Conjunto 1: " + cc1.getAll());
	
		System.out.println("d) Os conjuntos 2 e 1 tem interseccao " + OpConj.intersec(cc1, cc2).getAll());
		System.out.println("e) Os conjuntos 1 e 2 tem diferenca " + OpConj.minus(cc1, cc2).getAll());

	}
	
	private static void questao4(Conjunto c1, Conjunto c2, Conjunto c3, Conjunto c4){
		
		System.out.println("\n===== Questao 4:=======\n");

		System.out.println("\n O produto cartesiano de " + c3.getAll() + " e " + c2.getAll());
		Conjunto Cart = OpConj.prodCartesiano(c3, c2);
		Cart.show();
		System.out.println("\n O conjunto potencia de " + c3.getAll());
		Conjunto Cart2 = OpConj.subconjuntos(c3);
		Cart2.show();

	}
	private static void questao5(){
		
		Conjunto U = new Conjunto <Integer>();

		Conjunto cc2 = new Conjunto();

		int maxi = 50; // porem o melhor jeito de visualizar as saidas eh com maxi = 20

		for (int i = 0; i < maxi ; i++) {
			U.addEl(i);
		}

		//==============conjuntos==================
		
		Conjunto cc1 = OpConj.primos(maxi);

		Conjunto aub = OpConj.union(cc1, cc2);
		Conjunto aeb = OpConj.intersec(cc1, cc2);
		Conjunto na = OpConj.complemento(U, cc1);
		Conjunto nb = OpConj.complemento(U, cc2);
		//Conjunto aubc = OpConj.complemento(U,  OpConj.union(cc1, cc2));
		Conjunto aubc = OpConj.complemento(U,  aub);
		Conjunto naenb = OpConj.intersec(na, nb);

		Conjunto aebc = OpConj.complemento(U, aeb);
		Conjunto naunb = OpConj.union(na, nb);

		//=========================================



		System.out.println("\n===== Questao 5:=======\n");

		
		System.out.println("i) U = " + U.getAll());
		System.out.println("i) A = " + cc1.getAll());
		System.out.println("i) B = " + cc2.getAll());

		System.out.println("i) A' = " + na.getAll());
		System.out.println("i) B' = " + nb.getAll());
		
		System.out.println("\n================ i) (A U B)' = (A' ^ B')================\n");
		
		//System.out.println("\ni) (A U B)' = (A' ^ B')");
	
		System.out.println("i) (A U B) = " + aub.getAll());

		System.out.println("i) (A U B)' = " + aubc.getAll());
		System.out.println("i) (A' ^ B') = " + naenb.getAll());

		// ==========================================
		System.out.println("\n================ ii) (A ^ B)' = (A' U B')================\n");

		//System.out.println("\nii) (A ^ B)' = (A' U B')");

		System.out.println("ii) (A ^ B) = " + aeb.getAll());
		System.out.println("ii) (A ^ B)' = " + aebc.getAll());
		
		System.out.println("ii) (A' U B') = " + naunb.getAll());
	}

	

}
