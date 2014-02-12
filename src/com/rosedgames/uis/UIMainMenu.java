package com.rosedgames.uis;

import com.rosedgames.ui.UI;

public class UIMainMenu extends UI {

	public UIMainMenu(String name) {
		super(name);
	}

	@Override
	public void update(float delta) {
		super.update(delta);
		
		System.out.println(getName());
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