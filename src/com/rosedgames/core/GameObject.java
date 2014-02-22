package com.rosedgames.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Allows simple architectural game design
 * 
 * @author Liam Potter
 */
public class GameObject {
	
	private ArrayList<GameObject> children;
	private ArrayList<GameComponent> components;
	
	public GameObject() {
		children = new ArrayList<GameObject>();
		components = new ArrayList<GameComponent>();
	}
	
	public void addChild(GameObject child) {
		children.add(child);
	}
	
	public void addChildren(GameObject... children) {
		for(GameObject child: children) this.children.add(child);
	}
	
	public void addChildren(List<GameObject> children) {
		for(GameObject child: children) this.children.add(child);
	}
	
	public void addComponent(GameComponent component) {
		components.add(component);
	}
	
	public void addComponents(GameComponent... components) {
		for(GameComponent component: components) this.components.add(component);
	}
	
	public void addComponents(List<GameComponent> components) {
		for(GameComponent component: components) this.components.add(component);
	}
	
	public void removeChild(int index) {
		children.remove(index);
	}
	
	public void removeChild(GameObject child) {
		children.remove(child);
	}
	
	public void removeChildren(int... children) {
		for(int child: children) this.children.remove(child);
	}
	
	public void removeChildren(GameObject... children) {
		for(GameObject child: children) this.children.remove(child);
	}
	
	public void removeComponent(int index) {
		components.remove(index);
	}
	
	public void removeComponent(GameComponent component) {
		components.remove(component);
	}
	
	public void removeComponents(int... components) {
		for(int component: components) this.components.remove(component);
	}
	
	public void removeComponents(GameComponent... components) {
		for(GameComponent component: components) this.components.remove(component);
	}
	
	public ArrayList<GameObject> getChildren() {
		return children;
	}
	
	public Iterator<GameObject> getChildIterator() {
		return children.iterator();
	}
	
	public ArrayList<GameComponent> getComponents() {
		return components;
	}
	
	public Iterator<GameComponent> getComponentIterator() {
		return components.iterator();
	}
	
	public void update(float delta) {
		for(GameObject child: children) child.update(delta);
		for(GameComponent component: components) component.update(delta);
	}
	
	public void render() {
		for(GameObject child: children) child.render();
		for(GameComponent component: components) component.render();
	}
	
	public void dispose() {
		for(GameObject child: children) child.dispose();
		for(GameComponent component: components) component.dispose();
	}
	
}