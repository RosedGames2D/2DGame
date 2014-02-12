package com.rosedgames.core.primitives;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.rosedgames.core.GameObject;
import com.rosedgames.core.Vector4;

/**
 * Simple class for rendering a Point on the screen
 * 
 * @author Liam Potter
 */
public class Point extends GameObject {

	/**
	 * Stores the Circle's X and Y positions
	 */
	public Vector2 pos;
	/**
	 * Stores the color that the Circle should render as
	 */
	public Vector4 color;
	
	/**
	 * ShapeRenderer instance used for drawing the Circle
	 */
	private ShapeRenderer renderer;
	
	/**
	 * Initialises the Point properties
	 * @param pos
	 * @param color
	 */
	public Point(Vector2 pos, Vector4 color) {
		this.pos = pos;
		this.color = color;
		renderer = new ShapeRenderer();
	}
	
	/**
	 * Initialises the Point properties
	 * @param x
	 * @param y
	 * @param color
	 */
	public Point(int x, int y, Vector4 color) {
		this(new Vector2(x, y), color);
	}
	
	/**
	 * Calls the superclass' render function then proceeds to draw a Circle using the ShapeRenderer
	 */
	@Override
	public void render() {
		super.render();
		renderer.begin(ShapeType.Point);
		renderer.setColor(color.x, color.y, color.z, color.w);
		renderer.point(pos.x, pos.y, 0);
		renderer.end();
	}
	
	/**
	 * Calls the superclass' dispose function then proceeds to dispose of the ShapeRenderer
	 */
	@Override
	public void dispose() {
		super.dispose();
		renderer.dispose();
	}
	
}