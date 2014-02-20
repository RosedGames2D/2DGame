package com.rosedgames.core;

import java.util.HashMap;

import com.badlogic.gdx.maps.tiled.TmxMapLoader;

public class WorldHandler {

	private static HashMap<String, World> worlds = new HashMap<String, World>();
	
	public static void addWorld(World world) throws Exception {
		if(world == null) {
			throw new Exception("Error @ World.addWorld(world) - Argument is null, cancelling addition!");
		} else worlds.put(world.getName(), world);
	}
	
	public static void addWorld(String name, String filename) throws Exception {
		addWorld(new World(new TmxMapLoader().load(System.getProperty("user.dir") + "/resources/maps/" + filename + ".tmx"), name));
	}
	
	public static void addWorld(String filename) throws Exception {
		addWorld(filename, filename);
	}
	
	public static World getWorld(String name) {
		return worlds.get(name);
	}
	
	public static HashMap<String, World> getWorlds() {
		return worlds;
	}
	
}