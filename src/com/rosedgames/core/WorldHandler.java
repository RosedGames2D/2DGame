package com.rosedgames.core;

import java.util.HashMap;

public class WorldHandler {

	private static HashMap<String, World> worlds = new HashMap<String, World>();
	
	public void addWorld(World world) {
		worlds.put(world.getName(), world);
	}
	
	public World getWorld(String name) {
		return worlds.get(name);
	}
	
}