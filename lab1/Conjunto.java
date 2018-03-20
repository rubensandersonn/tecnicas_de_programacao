/*
	Laboratório 2: Conjuntos

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2-18.1
*/

import java.util.ArrayList;

public class Conjunto{
	
	private ArrayList <Object> set = new ArrayList<Object>();
	
	public Conjunto(){
	}

	//public Conjunto(ArrayList <Integer> set){
	public Conjunto(ArrayList <Object> set){
		this.set = set;
	}
	
	// (1.2)
	public void addEl(Object el){
		this.set.remove(el);
		this.set.add(el);
	}

	public void addSet(Conjunto subSet){
		this.set.removeAll(subSet.getAll());
	}	

	// (1.3)
	public boolean verifyEl(Object el){
		return this.set.contains(el);
	}

	// (1.4)
	
	public boolean containsSet(Conjunto subSet){
		return this.set.containsAll(subSet.getAll());
	}

	public void show(){
		System.out.println(set.toString());
	}

	public ArrayList <Integer> getAll(){
		return this.set;
	}
}