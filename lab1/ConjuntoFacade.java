public interface ConjuntoFacade {
	ArrayList <Object> set;

	 Conjunto();
	 Conjunto(Conjunto c2);
	 void addEl(int el);
	 boolean verifyEl(int el);
	 boolean containsSet(Conjunto subSet);
	 void addSet(Conjunto subSet);
	 void show();
	 ArrayList <Integer> getAll();
}