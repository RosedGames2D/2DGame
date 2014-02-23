package com.rosedgames.core;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;

public class World extends GameObject {

	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	private String name;
	private Player player;
	
	public World(TiledMap map, String name) {
		this.map = map;
		this.name = name;
		init();
	}
	
	private void init() {
		this.renderer = new OrthogonalTiledMapRenderer(map);
		this.player = new Player(new Vector2(100, 10)); //Get from save file soon
		
		//Load Map Properties, GameObjects, GameComponents etc...
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);
	}
	
	@Override
	public void render() {
		renderer.getSpriteBatch().begin();
			super.render();
		renderer.getSpriteBatch().end();
	}
	
	@Override
	public void dispose() {
		map.dispose();
		renderer.dispose();
		super.dispose();
	}
	
	public String getName() {
		return this.name;
	}
	
}