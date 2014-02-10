package com.rosedgames.core.primitives;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.rosedgames.core.GameObject;
import com.rosedgames.core.Vector4;

public class Rectangle extends GameObject {

	public Vector2 pos;
	public Vector2 dim;
	public Vector4 color;
	
	private ShapeRenderer renderer;
	private ShapeType shapeType;
	
	public Rectangle(Vector2 pos, Vector2 dim, Vector4 color) {
		this.pos = pos;
		this.dim = dim;
		this.color = color;
		renderer = new ShapeRenderer();
		shapeType = ShapeType.Filled;
	}
	
	public Rectangle(int x, int y, int width, int height, Vector4 color) {
		this(new Vector2(x, y), new Vector2(width, height), color);
	}
	
	@Override
	public void render() {
		super.render();
		renderer.begin(shapeType);
		renderer.setColor(color.x, color.y, color.z, color.w);
		renderer.rect(pos.x, pos.y, dim.x, dim.y);
		renderer.end();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		renderer.dispose();
	}
	
	public void setRendererType(ShapeType type) {
		if((type != ShapeType.Filled) && (type != ShapeType.Line)) {
			System.err.println("ShapeType." + type.toString() + " is not supported by the Rectangle class. Use either ShapeType.Filled or ShapeType.Line.\nDefaulting to ShapeType.Filled.");
			type = ShapeType.Filled;
		}
		shapeType = type;
	}
	
}