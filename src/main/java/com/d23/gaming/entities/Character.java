package com.d23.gaming.entities;

import java.util.List;

public class Character extends AbstractObject{
	protected List<Item> items = null;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
