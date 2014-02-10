package com.rosedgames.core;

import org.lwjgl.opengl.GL11;

import com.badlogic.gdx.Gdx;
import com.rosedgames.Main;

public abstract class Screen implements com.badlogic.gdx.Screen {

	private GameObject root;
	private Main game;
	
	public Screen(Main game) {
		this.game = game;
	}
	
	public void update(float delta) {
		getRootObj().update(delta);
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		update(delta);
		getRootObj().render();
	}
	
	@Override
	public void dispose() {
		getRootObj().dispose();
	}
	
	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resize(int arg0, int arg1) {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void show() {
		
	}
	
	public GameObject getRootObj() {
		if(root == null)
			root = new GameObject();
		
		return root;
	}
	
	public Main getGame() {
		return game;
	}
	
}