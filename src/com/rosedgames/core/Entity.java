package com.rosedgames.core;

import com.badlogic.gdx.math.Vector2;

public abstract class Entity extends GameObject {

	public enum EntityType {
		DOCILE, NEUTRAL, HOSTILE
	}
	
	private Vector2 pos;
	private Vector2 dim;
	private Vector2 velocity = new Vector2(0, 0);
	private float speed = 2.0f;
	private String name;
	private EntityType type;
	
	public Entity(Vector2 pos, Vector2 dim, String name) {
		this.pos = pos;
		this.dim = dim;
		this.name = name;
		this.type = EntityType.DOCILE;
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);
		//Update stuff...
	}
	
	@Override
	public void render() {
		super.render();
		//Render stuff...
	}
	
	@Override
	public void dispose() {
		super.dispose();
		//Disposal stuff...
	}

	public Vector2 getPos() {
		return pos;
	}

	public void setPos(Vector2 pos) {
		this.pos = pos;
	}

	public Vector2 getDim() {
		return dim;
	}

	public void setDim(Vector2 dim) {
		this.dim = dim;
	}

	public Vector2 getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EntityType getType() {
		return type;
	}

	public void setType(EntityType type) {
		this.type = type;
	}
	
}