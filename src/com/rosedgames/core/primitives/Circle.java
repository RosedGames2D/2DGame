package com.rosedgames.core.primitives;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.rosedgames.core.GameObject;
import com.rosedgames.core.Vector4;

/**
 * Simple class for rendering a Circle on the screen
 * 
 * @author Liam Potter
 */
public class Circle extends GameObject {

	/**
	 * Stores the Circle's X and Y positions
	 */
	public Vector2 pos;
	/**
	 * Stores the color that the Circle should render as
	 */
	public Vector4 color;
	/**
	 * Stores the radius of the Circle
	 */
	public float radius;
	
	/**
	 * ShapeRenderer instance used for drawing the Circle
	 */
	private ShapeRenderer renderer;
	/**
	 * ShapeType used for deciding how the Circle should be drawn
	 */
	private ShapeType shapeType;
	
	/**
	 * Initialises the Circle properties
	 * @param pos
	 * @param radius
	 * @param color
	 */
	public Circle(Vector2 pos, float radius, Vector4 color) {
		this.pos = pos;
		this.radius = radius;
		this.color = color;
		renderer = new ShapeRenderer();
		shapeType = ShapeType.Filled;
	}
	
	/**
	 * Initialises the Circle properties
	 * @param x
	 * @param y
	 * @param radius
	 * @param color
	 */
	public Circle(int x, int y, float radius, Vector4 color) {
		this(new Vector2(x, y), radius, color);
	}
	
	/**
	 * Calls the superclass' render function then proceeds to draw a Circle using the ShapeRenderer
	 */
	@Override
	public void render() {
		super.render();
		renderer.begin(shapeType);
		renderer.setColor(color.x, color.y, color.z, color.w);
		renderer.circle(pos.x, pos.y, radius);
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
			System.err.println("ShapeType." + type.toString() + " is not supported by the Circle class. Use either ShapeType.Filled or ShapeType.Line.\nDefaulting to ShapeType.Filled.");
			type = ShapeType.Filled;
		}
		shapeType = type;
	}
	
}