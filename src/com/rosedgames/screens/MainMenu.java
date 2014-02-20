package com.rosedgames.screens;

import com.badlogic.gdx.Gdx;
import com.rosedgames.Main;
import com.rosedgames.core.Screen;
import com.rosedgames.ui.UIHandler;
import com.rosedgames.uis.UIMainMenu;

/**
 * Contains the contents and instructions for rendering and updating the MainMenu
 * 
 * @author Liam Potter
 */
public class MainMenu extends Screen {
	
	/**
	 * Calls the superclass' constructor
	 * @param game
	 */
	public MainMenu(Main game) {
		super(game);
	}

	/**
	 * Code to be ran when this screen is shown
	 */
	@Override
	public void show() {
		Gdx.gl.glClearColor(1.0f, 1.0f, 0.5f, 1.0f);
		
		UIMainMenu gui = new UIMainMenu("UIMainMenu");
		
		UIHandler.addUI(gui);
		
		getRootObj().addChild(UIHandler.getUI("UIMainMenu"));
	}
	
}