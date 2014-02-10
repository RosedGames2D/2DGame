package com.rosedgames.core;

import java.util.ArrayList;

public class GameObject {
	
	private ArrayList<GameObject> children;

	public GameObject() {
		children = new ArrayList<GameObject>();
	}

	public void addChild(GameObject child) {
		children.add(child);
	}

	public void update(float delta) {
		for (GameObject child : children)
			child.update(delta);
	}

	public void render() {
		for (GameObject child : children)
			child.render();
	}

	public void dispose() {
		for (GameObject child : children)
			child.dispose();
	}
	
}