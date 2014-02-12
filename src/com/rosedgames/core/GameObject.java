package com.rosedgames.core;

import java.util.ArrayList;

/**
 * Allows simple architectural game design
 * 
 * @author Liam Potter
 */
public class GameObject {
	
	/**
	 * Contains all the child GameObject instances for the current GameObject
	 */
	private ArrayList<GameObject> children;
	/**
	 * Contains all the child GameComponent instances for the current GameObject
	 */
	private ArrayList<GameComponent> components;
	
	/**
	 * Initialise the GameObject properties
	 */
	public GameObject() {
		children = new ArrayList<GameObject>();
		components = new ArrayList<GameComponent>();
	}

	/**
	 * Add a GameObject to the GameObject ArrayList
	 * @param child
	 */
	public void addChild(GameObject child) {
		children.add(child);
	}
	
	/**
	 * Add a GameComponent to the GameComponent ArrayList
	 * @param component
	 */
	public void addComponent(GameComponent component) {
		components.add(component);
	}

	/**
	 * Loop through the GameObject and GameComponent ArrayLists and call the update function
	 * @param delta
	 */
	public void update(float delta) {
		for(GameComponent component : components)
			component.update(delta);
			
		for (GameObject child : children)
			child.update(delta);
	}

	/**
	 * Loop through the GameObject and GameComponent ArrayLists and call the render function
	 */
	public void render() {
		for(GameComponent component : components)
			component.render();
		
		for (GameObject child : children)
			child.render();
	}

	/**
	 * Loop through the GameObject and GameComponent ArrayLists and call the dispose function
	 */
	public void dispose() {
		for(GameComponent component : components)
			component.dispose();
		
		for (GameObject child : children)
			child.dispose();
	}
	
}