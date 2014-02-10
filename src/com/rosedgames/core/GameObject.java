package com.rosedgames.core;

import java.util.ArrayList;

public class GameObject {
	
	private ArrayList<GameObject> children;
	private ArrayList<GameComponent> components;
	
	public GameObject() {
		children = new ArrayList<GameObject>();
	}

	public void addChild(GameObject child) {
		children.add(child);
	}
	
	public void addComponent(GameComponent component) {
		components.add(component);
	}

	public void update(float delta) {
		for(GameComponent component : components)
			component.update(delta);
			
		for (GameObject child : children)
			child.update(delta);
	}

	public void render() {
		for(GameComponent component : components)
			component.render();
		
		for (GameObject child : children)
			child.render();
	}

	public void dispose() {
		for(GameComponent component : components)
			component.dispose();
		
		for (GameObject child : children)
			child.dispose();
	}
	
}