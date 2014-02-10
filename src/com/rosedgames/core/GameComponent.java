package com.rosedgames.core;

public interface GameComponent {
	public void update(float delta);
	public void render();
	public void dispose();
}