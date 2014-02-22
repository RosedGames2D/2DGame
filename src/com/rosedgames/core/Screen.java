package com.rosedgames.core;

import org.lwjgl.opengl.GL11;

import com.badlogic.gdx.Gdx;

public abstract class Screen implements com.badlogic.gdx.Screen {

	private Game game;
	private GameObject root;
	private String name;
	
	public Screen(Game game, String name) {
		this.game = game;
		this.name = name;
	}
	
	public abstract void init();
	
	public void clear() {
		Gdx.gl.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	}
	
	@Override
	public void render(float delta) {
		getRoot().update(delta);
		getRoot().render();
	}

	@Override
	public void resize(int width, int height) {}

	@Override
	public void show() { init(); }

	@Override
	public void hide() {}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void dispose() {
		getRoot().dispose();
	}
	
	public Game getGame() {
		return game;
	}
	
	public String getName() {
		return name;
	}
	
	public GameObject getRoot() {
		if(root == null) root = new GameObject();
		return root;
	}
	
}