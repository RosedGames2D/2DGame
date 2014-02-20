package com.rosedgames.items;

import com.rosedgames.core.GameComponent;

public abstract class Item implements GameComponent {

	private String name;
	private int id;
	
	@Override
	public void update(float delta) {
		//Update stuff...
	}

	@Override
	public void render() {
		//Render stuff...
	}

	@Override
	public void dispose() {
		//Disposal stuff...
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
}