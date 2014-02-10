package com.rosedgames.core;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;

public class AABB implements GameComponent {

	public Vector2 pos;
	public Vector2 dim;
	public Vector4 drawingColor;
	
	private ShapeRenderer renderer;
	private boolean draw = false;
	
	public AABB(Vector2 pos, Vector2 dim) {
		this.pos = pos;
		this.dim = dim;
		this.drawingColor = new Vector4(0.0f, 1.0f, 0.0f, 1.0f);
	}
	
	@Override
	public void update(float delta) {
		if(this.draw == true && renderer == null)
			this.renderer = new ShapeRenderer();
	}

	@Override
	public void render() {
		if(this.draw == true && renderer != null) {
			
			this.renderer.begin(ShapeType.Line);
			this.renderer.setColor(drawingColor.x, drawingColor.y, drawingColor.z, drawingColor.w);
			this.renderer.rect(pos.x, pos.y, dim.x, dim.y);
			this.renderer.end();
			
		}
	}

	@Override
	public void dispose() {
		if(this.renderer != null)
			this.renderer.dispose();
	}
	
	public void setDrawingColor(Vector4 color) {
		this.drawingColor = color;
	}
	
	public void setDrawingEnabled(boolean enabled) {
		if(enabled)
			this.draw = true;
		else
			this.draw = false;
	}
	
	public boolean intersects(AABB other) {
		return (pos.x <= other.pos.x + other.dim.x 
				&& other.pos.x <= pos.x + dim.x
				&& pos.y <= other.pos.y + other.dim.y
				&& other.pos.y <= pos.y + dim.y);
	}
	
}