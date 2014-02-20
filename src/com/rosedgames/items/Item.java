package com.rosedgames.items;

import com.google.gson.annotations.SerializedName;
import com.rosedgames.core.GameObject;

public class Item extends GameObject {

	@SerializedName("n")
	private String name;
	@SerializedName("id")
	private int id;
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
}