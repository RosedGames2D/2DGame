package com.rosedgames.core;

import java.util.HashMap;

public class GameSaveManager {

	private static HashMap<String, GameSave> saves = new HashMap<String, GameSave>();
	
	public static void addSave(String name, GameSave save) {
		saves.put(name, save);
	}
	
	public static void addSave(GameSave save) {
		addSave(save.getFilename(), save);
	}
	
	public static GameSave getSave(String name) {
		return saves.get(name);
	}
	
	public static void load(String name) {
		saves.get(name).load();
	}
	
	public static void save(String name) {
		saves.get(name).save();
	}
	
	public static void saveAll() {
		for(GameSave save: saves.values()) save.save();
	}
	
	public static void deleteSave(String name) {
		saves.get(name).delete();
		saves.remove(name);
	}
	
	public static void deleteSave(GameSave save) {
		saves.get(save).delete();
		saves.remove(save);
	}
	
}