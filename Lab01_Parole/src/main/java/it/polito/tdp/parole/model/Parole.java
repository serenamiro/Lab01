package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;

public class Parole implements Comparable<String> {
	
	List<String> parole;
		
	public Parole() {
		//TODO
		parole = new LinkedList<String>(); 
	}
	
	public void addParola(String p) {
		//TODO
		parole.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		parole.sort(null);
		return parole;
	}
	
	public void reset() {
		// TODO
		parole.clear();
	}
	
	public void cancella(String c) {
		parole.remove(c);
	}

	@Override
	public int compareTo(String other) {
		return this.compareTo(other);
	}

}
