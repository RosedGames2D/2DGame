package com.rosedgames.core;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import com.rosedgames.utils.ResourceLoader;

public class Player extends Entity implements InputProcessor {

	private int facing = 0;
	
	public Player(Vector2 pos) {
		super(pos, new Vector2(24, 24), ResourceLoader.loadSprite("player"));
		setSpeed(150f);
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);
	}
	
	@Override
	public boolean keyDown(int keycode) {
		
		switch(keycode) {
			case Keys.W:
				getVelocity().y = getSpeed();
				if(facing != 0) {
					getSprite().setRotation(0);
					facing = 0;
				}
				break;
			case Keys.S:
				getVelocity().y = -getSpeed();
				if(facing != 1) {
					getSprite().setRotation(180);
					facing = 1;
				}
				break;
			case Keys.A:
				getVelocity().x = -getSpeed();
				if(facing != 2) {
					getSprite().setRotation(90);
					facing = 2;
				}
				break;
			case Keys.D:
				getVelocity().x = getSpeed();
				if(facing != 3) {
					getSprite().setRotation(270);
					facing = 3;
				}
				break;
		}
		
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		switch(keycode) {
			case Keys.W:
			case Keys.S:
				getVelocity().y = 0;
				break;
			case Keys.A:
			case Keys.D:
				getVelocity().x = 0;
				break;
		}
		
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}
	
}