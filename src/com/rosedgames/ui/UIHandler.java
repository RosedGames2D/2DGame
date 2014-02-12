package com.rosedgames.ui;

import java.util.HashMap;

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
	
}