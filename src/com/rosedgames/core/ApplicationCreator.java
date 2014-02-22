package com.rosedgames.core;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class ApplicationCreator {

	public static void createLwjglApplication(Game game, LwjglApplicationConfiguration configuration) {
		new LwjglApplication(game, configuration);
	}
	
	public static void createLwjglApplication(Game game) {
		LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
		configuration.width = 1280;
		configuration.height = 608;
		configuration.resizable = false;
		configuration.title = "2D Game";
		configuration.backgroundFPS = 120;
		configuration.foregroundFPS = 120;
		configuration.useGL20 = true;
		
		createLwjglApplication(game, configuration);
	}
	
}