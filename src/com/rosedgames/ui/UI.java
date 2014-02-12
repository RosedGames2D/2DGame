package com.rosedgames.ui;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.rosedgames.core.GameComponent;

public abstract class UI implements GameComponent {
	
	private String name;
	private Stage stage;
	
	public UI(String name) {
		this.name = name;
		this.stage = new Stage();
	}
	
	public String getName() {
		return name;
	}
	
	public Stage getStage() {
		return stage;
	}
	
	@Override
	public void update(float delta) {
		getStage().act(delta);
	}
	
	@Override
	public void render() {
		getStage().draw();
	}
	
	@Override
	public void dispose() {
		getStage().dispose();
	}
	
}