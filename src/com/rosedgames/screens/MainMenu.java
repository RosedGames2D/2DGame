package com.rosedgames.screens;

import com.badlogic.gdx.Gdx;
import com.rosedgames.Main;
import com.rosedgames.core.Screen;
import com.rosedgames.ui.UIHandler;
import com.rosedgames.uis.UIMainMenu;

public class MainMenu extends Screen {
	
	public MainMenu(Main game) {
		super(game);
	}

	@Override
	public void show() {
		Gdx.gl.glClearColor(1.0f, 1.0f, 0.5f, 1.0f);
		
		UIMainMenu gui = new UIMainMenu("UIMainMenu");
		
		UIHandler.addUI(gui);
		
		getRootObj().addChild(UIHandler.getUI("UIMainMenu"));
	}
	
}