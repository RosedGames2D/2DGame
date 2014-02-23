package com.rosedgames.core;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity extends GameObject {

	public enum EntityType {
		DOCILE, NEUTRAL, HOSTILE
	}
	
	private Vector2 pos;
	private Vector2 dim;
	private Rectangle bounds;
	private Vector2 velocity;
	private float speed = 2.0f;
	private float delta = 0.0f;
	private float health = 100f;
	private float maxHealth = 100f;
	private transient Sprite sprite;
	public static transient SpriteBatch batch;
	private EntityType type;
	
	public Entity(Vector2 pos, Vector2 dim, Sprite sprite) {
		this.pos = pos;
		this.dim = dim;
		this.velocity = new Vector2(0, 0);
		this.sprite = sprite;
		this.sprite.setPosition(pos.x, pos.y);
		this.bounds = new Rectangle(this.pos.x, this.pos.y, this.dim.x, this.dim.y);
		type = EntityType.DOCILE;
	}
	
	@Override
	public void update(float delta) {
		super.update(delta);
		this.delta = delta;
		
		pos.x = pos.x + velocity.x * delta;
		pos.y = pos.y + velocity.y * delta;

		sprite.setPosition(pos.x, pos.y);
		bounds.set(pos.x, pos.y, dim.x, dim.y);
	}

	@Override
	public void render() {
		super.render();
		getSprite().draw(getBatch());
	}
	
	@Override
	public void dispose() {
		super.dispose();
		getSprite().getTexture().dispose();
	}

	public Vector2 getPos() {
		return pos;
	}

	public Vector2 getDim() {
		return dim;
	}

	public Sprite getSprite() {
		return sprite;
	}

	public SpriteBatch getBatch() {
		return batch;
	}
	
	public Vector2 getVelocity() {
		return velocity;
	}
	
	public EntityType getType() {
		return type;
	}
	
	public float getSpeed() {
		return speed;
	}
	
	public float getDelta() {
		return delta;
	}
	
	public void setPos(Vector2 pos) {
		this.pos = pos;
	}

	public void setDim(Vector2 dim) {
		this.dim = dim;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}

	public void setType(EntityType type) {
		this.type = type;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public void damage(float amt) {
		if(this.health - amt < 1) dispose();
		this.health -= amt;
	}
	
	public void heal(float amt) {
		if(this.health + amt > maxHealth) {
			amt = this.maxHealth - health;
		}
		this.health += amt;
	}
	
	public float getHealth() {
		return this.health;
	}
	
	public void setHealth(float health) {
		this.health = health;
	}
	
	public float getMaxHealth() {
		return this.maxHealth;
	}
	
	public void setMaxHealth(float health) {
		this.maxHealth = health;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}
	
}