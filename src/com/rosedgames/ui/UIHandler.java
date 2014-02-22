package com.rosedgames.ui;

import java.util.HashMap;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Responsible for storing and retrieving all the UI's created from a central location
 * 
 * @author Liam Potter
 */
public class UIHandler {

	/**
	 * Stores all the UI instances
	 */
	private static HashMap<String, UI> uis = new HashMap<String, UI>();
	/**
	 * Stores all the Scene2D Skin instances
	 */
	private static HashMap<String, Skin> skins = new HashMap<String, Skin>();
	
	/**
	 * Adds a passed instance of UI to the UI HashMap
	 * @param ui
	 */
	public static void addUI(UI ui) {
		uis.put(ui.getName(), ui);
	}
	
	/**
	 * Returns an instance of UI from the UI HashMap which is named after the name argument
	 * @param name
	 * @return UI
	 */
	public static UI getUI(String name) {
		return uis.get(name);
	}
	
	/**
	 * Returns the UI HashMap
	 * @return uis
	 */
	public static HashMap<String, UI> getUIs() {
		return uis;
	}
	
	/**
	 * Adds a passed instance of Skin to the Skin HashMap with the key of Name
	 * @param name
	 * @param skin
	 */
	public static void addSkin(String name, Skin skin) {
		skins.put(name, skin);
	}
	
	/**
	 * Returns an instance of Skin from the Skin HashMap which is named after the name argument
	 * @param name
	 * @return Skin
	 */
	public static Skin getSkin(String name) {
		return skins.get(name);
	}
	
	/**
	 * Returns the Skin HashMap
	 * @return skins
	 */
	public static HashMap<String, Skin> getSkins() {
		return skins;
	}
	
}