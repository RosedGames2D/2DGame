package com.rosedgames.core.primitives;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.rosedgames.core.GameObject;
import com.rosedgames.core.Vector4;

/**
 * Simple class for rendering a Rectangle on the screen
 * 
 * @author Liam Potter
 */
public class Rectangle extends GameObject {

	/**
	 * Stores the Circle's X and Y positions
	 */
	public Vector2 pos;
	/**
	 * Stores the Circle's X2 and Y2 positions
	 */
	public Vector2 dim;
	/**
	 * Stores the color that the Circle should render as
	 */
	public Vector4 color;
	
	/**
	 * ShapeRenderer instance used for drawing the Circle
	 */
	private ShapeRenderer renderer;
	/**
	 * ShapeType used for deciding how the Circle should be drawn
	 */
	private ShapeType shapeType;
	
	/**
	 * Initialises the Rectangle properties
	 * @param pos
	 * @param dim
	 * @param color
	 */
	public Rectangle(Vector2 pos, Vector2 dim, Vector4 color) {
		this.pos = pos;
		this.dim = dim;
		this.color = color;
		renderer = new ShapeRenderer();
		shapeType = ShapeType.Filled;
	}
	
	/**
	 * Initialises the Rectangle properties
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param color
	 */
	public Rectangle(int x, int y, int width, int height, Vector4 color) {
		this(new Vector2(x, y), new Vector2(width, height), color);
	}
	
	/**
	 * Calls the superclass' render function then proceeds to draw a Circle using the ShapeRenderer
	 */
	@Override
	public void render() {
		super.render();
		renderer.begin(shapeType);
		renderer.setColor(color.x, color.y, color.z, color.w);
		renderer.rect(pos.x, pos.y, dim.x, dim.y);
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
	
	/**
	 * Sets the ShapeType to use when rendering the Circle
	 * @param type
	 */
	public void setRendererType(ShapeType type) {
		if((type != ShapeType.Filled) && (type != ShapeType.Line)) {
			System.err.println("ShapeType." + type.toString() + " is not supported by the Rectangle class. Use either ShapeType.Filled or ShapeType.Line.\nDefaulting to ShapeType.Filled.");
			type = ShapeType.Filled;
		}
		shapeType = type;
	}
	
}