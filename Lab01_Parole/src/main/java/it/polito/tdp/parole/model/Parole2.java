package it.polito.tdp.parole.model;


import java.util.ArrayList;
import java.util.List;

public class Parole2 implements Comparable<String>{
	ArrayList parole;
	
	public Parole2() {
		//TODO
		parole = new ArrayList(); 
	}
	
	public void addParola(String p) {
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
