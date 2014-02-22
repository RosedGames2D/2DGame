package com.rosedgames.core;

import java.util.HashMap;

public abstract class Game extends com.badlogic.gdx.Game {
	
	private HashMap<String, Screen> screens;
	
	public Game() {
		screens = new HashMap<String, Screen>();
	}
	
	public abstract void init();
	
	@Override
	public void create() { init(); }
	
	@Override
	public void render() {
		super.render();
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
	
	@Override
	public void pause() {
		super.pause();
	}
	
	@Override
	public void resume() {
		super.resume();
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	public void addScreen(Screen screen) {
		screens.put(screen.getName(), screen);
	}
	
	public Screen getScreen(String name) {
		return screens.get(name);
	}
	
}