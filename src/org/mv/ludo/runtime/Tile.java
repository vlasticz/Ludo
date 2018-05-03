package org.mv.ludo.runtime;


public class Tile {
	
	private String name;
	private boolean empty;
	
	public Tile() {
		empty = true;
	}
	
	public Tile(boolean empty) {
		this.empty = empty;
	}
	
	public Tile(String name) {
		this.name = name;
		this.empty = true;
	}
	
	public Tile(String name, boolean empty) {
		this.name = name;
		this.empty = empty;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
