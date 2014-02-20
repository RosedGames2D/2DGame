package com.rosedgames.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Player extends Entity {

	private OrthographicCamera camera;
	private World world;
	private InputProcessor inputProcessor;
	private Sprite sprite;
	private boolean canJump = true;
	
	public Player(Vector2 pos) {
		super(pos, new Vector2(32, 32), "Player");
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()); //May change viewport later
		
		inputProcessor = new InputProcessor() {
			
			@Override
			public boolean touchUp(int screenX, int screenY, int pointer, int button) {return false;}
			
			@Override
			public boolean touchDragged(int screenX, int screenY, int pointer) {return false;}
			
			@Override
			public boolean touchDown(int screenX, int screenY, int pointer, int button) {return false;}
			
			@Override
			public boolean scrolled(int amount) {return false;}
			
			@Override
			public boolean mouseMoved(int screenX, int screenY) {return false;}
			
			@Override
			public boolean keyTyped(char character) {return false;}
			
			@Override
			public boolean keyUp(int keycode) {
				switch(keycode) {
					case Keys.A:
					case Keys.D:
						getVelocity().x = 0;
				}
				return true;
			}
			
			@Override
			public boolean keyDown(int keycode) {
				switch(keycode) {
					case Keys.SPACE:
						if(canJump) {
							getVelocity().y = getSpeed() / 1.8f;
							canJump = false;
						}
						break;
					case Keys.A:
						getVelocity().x = -getSpeed();
						break;
					case Keys.D:
						getVelocity().x = getSpeed();
						break;
				}
				return true;
			}
		};
	
		sprite = new Sprite(new Texture(System.getProperty("user.dir") + "/resources/textures/sprites/player.png")); //No animation yet
	}
	
	public Player() {
		this(new Vector2(0, 0));
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);
		
		getVelocity().y -= 20f /* soon to be World.getGravity() */ / delta;
		
		if(getVelocity().y == 0 /* or collision on with ground */) {
			canJump = true;
		}
		
		getPos().x = (getPos().x + getVelocity().x) * delta;
		getPos().y = (getPos().y + getVelocity().y) * delta;
		
		sprite.setX(getPos().x);
		sprite.setY(getPos().y);
	}
	
	@Override
	public void render() {
		super.render();
		//Render stuff...
	}
	
	@Override
	public void dispose() {
		super.dispose();
		//Disposal stuff...
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public InputProcessor getInputProcessor() {
		return inputProcessor;
	}

	public void setInputProcessor(InputProcessor inputProcessor) {
		this.inputProcessor = inputProcessor;
	}
	
}