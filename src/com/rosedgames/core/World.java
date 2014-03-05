package com.rosedgames.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;

public class World extends GameObject {

	private String name;
	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	private OrthographicCamera camera;
	private Player player;
	private Entity[] entities;
	
	public World(String name) {
		this.name = name;
	}
	
	public void init() {
		addChild(getPlayer());
		renderer = new OrthogonalTiledMapRenderer(getMap());
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);
		camera.translate(new Vector2(getPlayer().getPos().x + getPlayer().getDim().x / 2, getPlayer().getPos().y + getPlayer().getDim().y / 2));
	}
	
	@Override
	public void render() {
		renderer.getSpriteBatch().begin();
			super.render();
		renderer.getSpriteBatch().end();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		map.dispose();
		renderer.dispose();
	}
	
	public String getName() {
		return name;
	}

	public TiledMap getMap() {
		return map;
	}

	public void setMap(TiledMap map) {
		this.map = map;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
}