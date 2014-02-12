package com.rosedgames.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.rosedgames.core.GameObject;

/**
 * Simple super class for user interfaces
 * 
 * @author Liam Potter
 */
public abstract class UI extends GameObject {
	
	/**
	 * Name of the UI
	 */
	private String name;
	/**
	 * The Scene2D UI Stage
	 */
	private Stage stage;
	
	/**
	 * Initialises the UI properties and sets the program's input processor
	 * @param name
	 */
	public UI(String name) {
		this.name = name;
		this.stage = new Stage();
		Gdx.input.setInputProcessor(getStage());
	}
	
	/**
	 * Returns the name of the UI
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the Scene2D UI Stage object
	 * @return stage
	 */
	public Stage getStage() {
		return stage;
	}
	
	/**
	 * Calls the superclass' update function then proceeds to update the Stage
	 */
	@Override
	public void update(float delta) {
		super.update(delta);
		getStage().act(delta);
	}
	
	/**
	 * Calls the superclass' render function then proceeds to render the Stage
	 */
	@Override
	public void render() {
		super.render();
		getStage().draw();
	}
	
	/**
	 * Calls the superclass' dispose function then proceeds to dispose the Stage
	 */
	@Override
	public void dispose() {
		super.dispose();
		getStage().dispose();
	}
	
}