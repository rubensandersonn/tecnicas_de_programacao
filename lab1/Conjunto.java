/*
	Laboratório 2: Operaçoes com Conjuntos

	Autor: Rubens A. de Sousa Silva, 362984
	Ciencia da computação UFC 2018.1
*/

import java.util.ArrayList;
import java.util.Collections;

public class Conjunto <T>{
	
	private ArrayList <T> set = new ArrayList<T>();
	
	public Conjunto(){
	}

	//public Conjunto(ArrayList <Integer> set){
	public Conjunto(ArrayList <T> set){
		this.set = set;
		
	}
	
	// (1.2)
	public void addEl(T el){
		this.set.remove(el);
		this.set.add(el);
		
	}

	public void addSet(Conjunto subSet){
		this.set.removeAll(subSet.getAll());
		this.set.addAll(subSet.getAll());		
	}

	public void removeSet(Conjunto subSet){
		this.set.removeAll(subSet.getAll());
		
	}

	// (1.3)
	public boolean verifyEl(T el){
		return this.set.contains(el);
	}

	// (1.4)
	
	public boolean containsSet(Conjunto subSet){
		return this.set.containsAll(subSet.getAll());
	}

	/*public void show(){
		System.out.println("	" + set.toString());
	}*/
	
	public void show(){
		System.out.print("\n	[");
		show(set);
		System.out.println("]");
	}
	
	private void show(ArrayList<T> El){

		for (int i = 0; i < El.size(); i++){

			if (El.get(i) instanceof Conjunto){
				System.out.print(" { ");
				
				Conjunto c = (Conjunto) El.get(i);				
				show( c.getAll() );
				
				System.out.print(" } ");
			}else{
				System.out.print(El.get(i).toString() + " ");
			}
		
		}
		
		
	}

	public ArrayList <T> getAll(){
		return new ArrayList<T>(set);
	}
	
}
