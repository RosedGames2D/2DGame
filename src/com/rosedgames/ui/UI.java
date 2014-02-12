package com.rosedgames.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.rosedgames.core.GameObject;

public abstract class UI extends GameObject {
	
	private String name;
	private Stage stage;
	
	public UI(String name) {
		this.name = name;
		this.stage = new Stage();
		Gdx.input.setInputProcessor(getStage());
	}
	
	public String getName() {
		return name;
	}
	
	public Stage getStage() {
		return stage;
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);
		getStage().act(delta);
	}
	
	@Override
	public void render() {
		super.render();
		getStage().draw();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		getStage().dispose();
	}
	
}