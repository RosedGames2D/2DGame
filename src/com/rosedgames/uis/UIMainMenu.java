package com.rosedgames.uis;

import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.rosedgames.ui.UI;
import com.rosedgames.utils.ResourceLoader;

public class UIMainMenu extends UI {

	public UIMainMenu(String name) {
		super(name);
		
		getStage().addActor(new TextButton("Btn", ResourceLoader.getSkin("Btn", ResourceLoader.getTextureAtlas("Btn"))));
	}

	@Override
	public void update(float delta) {
		super.update(delta);
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

}