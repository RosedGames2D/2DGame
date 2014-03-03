package com.rosedgames;

import com.rosedgames.core.ApplicationCreator;
import com.rosedgames.core.Game;
import com.rosedgames.core.GameSave;
import com.rosedgames.core.GameSaveManager;
import com.rosedgames.screens.MainMenu;
import com.rosedgames.ui.UIHandler;
import com.rosedgames.utils.ResourceLoader;

public class Main extends Game {

	@Override
	public void init() {
		GameSaveManager.addSave(new GameSave("one"));
		
		UIHandler.addSkin("Text Buttons", ResourceLoader.loadSkin("Btn", ResourceLoader.loadTextureAtlas("Btn")));
		
		addScreen(new MainMenu(this, "Main Menu"));
		
		setScreen(getScreen("Main Menu"));
	}
	
	@Override
	public void dispose() {
		GameSaveManager.saveAll();
		
		super.dispose();
	}
	
	public static void main(String[] args){
		ApplicationCreator.createLwjglApplication(new Main());
	}

}