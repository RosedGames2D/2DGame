package com.rosedgames.screens;

import com.badlogic.gdx.Gdx;
import com.rosedgames.Main;
import com.rosedgames.core.Screen;

public class MainMenu extends Screen {
	
	public MainMenu(Main game) {
		super(game);
	}

	@Override
	public void show() {
		
		Gdx.gl.glClearColor(1.0f, 1.0f, 0.5f, 1.0f);
		
	}
	
}