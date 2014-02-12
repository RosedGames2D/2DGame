package com.rosedgames.core;

/**
 * Allows simple architectural game design
 * 
 * @author Liam Potter
 */
public interface GameComponent {
	public void update(float delta);
	public void render();
	public void dispose();
}