package com.rosedgames.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.rosedgames.Main;
import com.rosedgames.core.Screen;
import com.rosedgames.core.Vector4;
import com.rosedgames.core.primitives.Rectangle;

public class MainMenu extends Screen {
	
	public MainMenu(Main game) {
		super(game);
	}

	@Override
	public void show() {
		Gdx.gl.glClearColor(1.0f, 1.0f, 0.5f, 1.0f);
		
		Rectangle rect = new Rectangle(100, 100, 100, 100, new Vector4(1.0f, 0.0f, 0.0f, 1.0f));
		rect.setRendererType(ShapeType.Point);
		
		getRootObj().addChild(rect);
	}
	
}