package com.rosedgames;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rosedgames.core.Screen;
import com.rosedgames.screens.MainMenu;

public class Main extends Game {

	public Screen mainMenu = new MainMenu(this);
	
	@Override
	public void create() {
		setScreen(mainMenu);		
	}
	
	@Override
	public void render() {
		super.render();
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
	
	@Override
	public void resume() {
		super.resume();
	}
	
	@Override
	public void pause() {
		super.pause();
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	public static void main(String[] args){
		LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
		configuration.width = 1280;
		configuration.height = 608;
		configuration.resizable = false;
		configuration.title = "2D Game";
		configuration.backgroundFPS = 120;
		configuration.foregroundFPS = 120;
		
		new LwjglApplication(new Main(), configuration);
	}

}
