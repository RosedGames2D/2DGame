package com.rosedgames.core.primitives;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.rosedgames.core.GameObject;
import com.rosedgames.core.Vector4;

public class Circle extends GameObject {

	public Vector2 pos;
	public Vector4 color;
	public float radius;
	
	private ShapeRenderer renderer;
	private ShapeType shapeType;
	
	public Circle(Vector2 pos, float radius, Vector4 color) {
		this.pos = pos;
		this.radius = radius;
		this.color = color;
		renderer = new ShapeRenderer();
		shapeType = ShapeType.Filled;
	}
	
	public Circle(int x, int y, float radius, Vector4 color) {
		this(new Vector2(x, y), radius, color);
	}
	
	@Override
	public void render() {
		super.render();
		renderer.begin(shapeType);
		renderer.setColor(color.x, color.y, color.z, color.w);
		renderer.circle(pos.x, pos.y, radius);
		renderer.end();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		renderer.dispose();
	}
	
	public void setRendererType(ShapeType type) {
		if((type != ShapeType.Filled) && (type != ShapeType.Line)) {
			System.err.println("ShapeType." + type.toString() + " is not supported by the Circle class. Use either ShapeType.Filled or ShapeType.Line.\nDefaulting to ShapeType.Filled.");
			type = ShapeType.Filled;
		}
		shapeType = type;
	}
	
}