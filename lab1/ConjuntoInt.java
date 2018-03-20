/*
	Laboratório 2: ConjuntoInts

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2-18.1

*/

import java.util.ArrayList;

public class ConjuntoInt{
	
	
	public ConjuntoInt(){
		super.Conjunto();
	}

	public ConjuntoInt(ArrayList <Integer> set){
	
		super.Conjunto(set);
	}
	
	// (1.2)
	public void addEl(int el){
		super.addEl(el);
	}

	// (1.3)
	public boolean verifyEl(int el){
		return super.verifyEl(el);
	}

	// (1.4)
	
	public boolean containsSet(ConjuntoInt subSet){
		return super.containsSet(subSet);
	}

	public void addSet(ConjuntoInt subSet){
		super.addSet(subSet);
	}	

	public void show(){
		super.show();
	}

	public ArrayList <Integer> getAll(){
		return (Integer)super.getAll();
	}
}