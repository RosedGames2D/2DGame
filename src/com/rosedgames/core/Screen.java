package com.rosedgames.core;

import org.lwjgl.opengl.GL11;

import com.badlogic.gdx.Gdx;
import com.rosedgames.Main;

/**
 * Base screen class that should be extended when creating a new Screen
 * 
 * @author Liam Potter
 */
public abstract class Screen implements com.badlogic.gdx.Screen {

	/**
	 * The root GameObject of the current Screen
	 */
	private GameObject root;
	/**
	 * An instance of the Main class
	 */
	private Main game;
	
	/**
	 * Initialises the Screen properties
	 * @param game
	 */
	public Screen(Main game) {
		this.game = game;
	}
	
	/**
	 * Calls the root GameObject's update function
	 * @param delta
	 */
	public void update(float delta) {
		getRootObj().update(delta);
	}
	
	/**
	 * Calls update(delta) and renders the root GameObject as well as clearing the screen
	 * @param delta
	 */
	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		update(delta);
		getRootObj().render();
	}
	
	/**
	 * Calls the root GameObject's dispose function
	 */
	@Override
	public void dispose() {
		getRootObj().dispose();
	}
	
	/**
	 * Code to be ran when the current Screen is hidden
	 */
	@Override
	public void hide() {}

	/**
	 * Code to be ran when the current Screen is paused
	 */
	@Override
	public void pause() {}

	/**
	 * Code to be ran when the current Screen is resized
	 * @param arg0
	 * @param arg1
	 */
	@Override
	public void resize(int arg0, int arg1) {}

	/**
	 * Code to be ran when the current Screen is resumed
	 */
	@Override
	public void resume() {}
	
	/**
	 * Returns the root GameObject and initialises it if it is null
	 * @return root
	 */
	public GameObject getRootObj() {
		if(root == null)
			root = new GameObject();
		
		return root;
	}
	
	/**
	 * Returns the game instance
	 * @return game
	 */
	public Main getGame() {
		return game;
	}
	
}