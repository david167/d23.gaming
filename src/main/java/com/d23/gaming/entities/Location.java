package com.d23.gaming.entities;

import java.util.List;

public class Location extends AbstractObject{
	protected List<Passage> passages = null;
	protected List<Character> characters = null;
	
	protected List<Item> items = null;
	
	public List<Passage> getPassages() {
		return passages;
	}
	public void setPassages(List<Passage> passages) {
		this.passages = passages;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Character> getCharacters() {
		return characters;
	}
	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}
}
