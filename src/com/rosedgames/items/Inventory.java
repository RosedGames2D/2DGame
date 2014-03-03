package com.rosedgames.items;

public class Inventory {

	private int size = 0;
	public Item[] items;
	
	public Inventory(int size) {
		this.size = size;
		this.items = new Item[this.size];
	}
	
	public Inventory() {
		this(64);
	}
	
	public void addItem(int index, Item item) throws Exception {
		if(items[index] != null) throw new Exception("Tried adding an item to the inventory index: " + index + " but an item already exists in that index!");
		items[index] = item;
	}
	
	public void removeItem(int index) {
		if(items[index] == null) return;
		items[index].dispose();
		items[index] = null;
	}
	
	public Item getItem(int index) {
		return items[index];
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
		Item[] oldItems = items;
		Item[] newItems = new Item[this.size];
		
		for(int i = 0; i < oldItems.length; i++)
			newItems[i] = oldItems[i];
		
		this.items = newItems;
	}
	
}