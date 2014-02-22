package com.rosedgames.screens;

import com.badlogic.gdx.Gdx;
import com.rosedgames.core.Game;
import com.rosedgames.core.Screen;
import com.rosedgames.ui.UIHandler;
import com.rosedgames.uis.UIMainMenu;

public class MainMenu extends Screen {
	
	public MainMenu(Game game, String name) {
		super(game, name);
	}

	@Override
	public void init() {
		Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
		
		UIMainMenu gui = new UIMainMenu("UIMainMenu");
		
		UIHandler.addUI(gui);
		
		getRoot().addChild(UIHandler.getUI("UIMainMenu"));
	}
	
	@Override
	public void render(float delta) {
		super.clear();
		super.render(delta);
	}
	
}