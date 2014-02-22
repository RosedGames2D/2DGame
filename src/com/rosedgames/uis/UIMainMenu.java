package com.rosedgames.uis;

import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.rosedgames.ui.UI;
import com.rosedgames.ui.UIHandler;

/**
 * Stores the contents and instructions for the MainMenu UI
 * 
 * @author Liam Potter
 */
public class UIMainMenu extends UI {

	/**
	 * Calls the superclass' constructor and initialises the UI properties
	 * @param name
	 */
	public UIMainMenu(String name) {
		super(name);
		
		getStage().addActor(new TextButton("Btn", UIHandler.getSkin("Text Buttons")));
	}

	/**
	 * Calls the superclass' update function then proceeds to run any other update code
	 */
	@Override
	public void update(float delta) {
		super.update(delta);
	}

	/**
	 * Calls the superclass' render function then proceeds to run any other rendering code
	 */
	@Override
	public void render() {
		super.render();
	}

	/**
	 * Calls the superclass' dispose function then proceeds to run any other disposal code
	 */
	@Override
	public void dispose() {
		super.dispose();
	}

}