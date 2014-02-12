package com.rosedgames.ui;

import java.util.HashMap;

public class UIHandler {

	private static HashMap<String, UI> uis = new HashMap<String, UI>();
	
	public static void addUI(UI ui) {
		uis.put(ui.getName(), ui);
	}
	
	public static UI getUI(String name) {
		return uis.get(name);
	}
	
	public static HashMap<String, UI> getUIs() {
		return uis;
	}
	
}