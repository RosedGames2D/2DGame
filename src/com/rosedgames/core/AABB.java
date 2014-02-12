package com.rosedgames.core;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

/**
 * Simple AABB class for rectangular collision detection
 * 
 * @author Liam Potter
 */
public class AABB implements GameComponent {

	/**
	 * Stores the AABB's X and Y positions
	 */
	public Vector2 pos;
	/**
	 * Stores the AABB's X2 and Y2 positions
	 */
	public Vector2 dim;
	/**
	 * Stores the color to be used when drawing the AABB(For debugging purposes)
	 */
	public Vector4 drawingColor;
	
	/**
	 * ShapeRenderer instance for drawing the AABB(For debugging purposes)
	 */
	private ShapeRenderer renderer;
	/**
	 * Stores the value of whether or not the AABB should be drawn(For debugging purposes)
	 */
	private boolean draw = false;
	
	/**
	 * Initialises the AABB properties
	 * @param pos
	 * @param dim
	 */
	public AABB(Vector2 pos, Vector2 dim) {
		this.pos = pos;
		this.dim = dim;
		this.drawingColor = new Vector4(0.0f, 1.0f, 0.0f, 1.0f);
	}
	
	/**
	 * Checks if the AABB should be drawn and if it should be it initialises the AABB's ShapeRenderer
	 * @param delta
	 */
	@Override
	public void update(float delta) {
		if(this.draw == true && renderer == null)
			this.renderer = new ShapeRenderer();
	}

	/**
	 * Checks if the AABB should be drawn and if it should be it draws the AABB as a Rectangle
	 */
	@Override
	public void render() {
		if(this.draw == true && renderer != null) {
			
			this.renderer.begin(ShapeType.Line);
			this.renderer.setColor(drawingColor.x, drawingColor.y, drawingColor.z, drawingColor.w);
			this.renderer.rect(pos.x, pos.y, dim.x, dim.y);
			this.renderer.end();
			
		}
	}

	/**
	 * Checks if the AABB ShapeRenderer is initialised and if so it disposes of the ShapeRenderer
	 */
	@Override
	public void dispose() {
		if(this.renderer != null)
			this.renderer.dispose();
	}
	
	/**
	 * Sets the AABB drawing color(For debugging purposes)
	 * @param color
	 */
	public void setDrawingColor(Vector4 color) {
		this.drawingColor = color;
	}
	
	/**
	 * Sets whether the AABB should be drawn or not(For debugging purposes)
	 * @param enabled
	 */
	public void setDrawingEnabled(boolean enabled) {
		if(enabled)
			this.draw = true;
		else
			this.draw = false;
	}
	
	/**
	 * Checks if this AABB is intersecting with another AABB
	 * @param other
	 * @return boolean
	 */
	public boolean intersects(AABB other) {
		return (pos.x <= other.pos.x + other.dim.x 
				&& other.pos.x <= pos.x + dim.x
				&& pos.y <= other.pos.y + other.dim.y
				&& other.pos.y <= pos.y + dim.y);
	}
	
}