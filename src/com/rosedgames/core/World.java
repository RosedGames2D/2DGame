package com.rosedgames.core;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class World extends GameObject {

	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	private String name;
	
	public World(TiledMap map, String name) {
		this.map = map;
		this.name = name;
		init();
	}
	
	private void init() {
		this.renderer = new OrthogonalTiledMapRenderer(map);

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