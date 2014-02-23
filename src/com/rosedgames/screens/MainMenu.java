package com.rosedgames.screens;

import com.badlogic.gdx.Gdx;
import com.rosedgames.core.Game;
import com.rosedgames.core.GameSave;
import com.rosedgames.core.GameSaveManager;
import com.rosedgames.core.Screen;

public class MainMenu extends Screen {
	
	public MainMenu(Game game, String name) {
		super(game, name);
	}

	@Override
	public void init() {
		Gdx.gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
		
		GameSaveManager.load("one");
		GameSave save = GameSaveManager.getSave("one");
		
		System.out.println(save.getSaveData());
	}
	
	@Override
	public void render(float delta) {
		super.clear();
		super.render(delta);
	}
	
}