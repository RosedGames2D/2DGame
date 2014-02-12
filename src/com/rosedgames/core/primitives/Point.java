package com.rosedgames.core.primitives;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.rosedgames.core.GameObject;
import com.rosedgames.core.Vector4;

public class Point extends GameObject {

	public Vector2 pos;
	public Vector4 color;
	
	private ShapeRenderer renderer;
	
	public Point(Vector2 pos, Vector4 color) {
		this.pos = pos;
		this.color = color;
		renderer = new ShapeRenderer();
	}
	
	public Point(int x, int y, Vector4 color) {
		this(new Vector2(x, y), color);
	}
	
	@Override
	public void render() {
		super.render();
		renderer.begin(ShapeType.Point);
		renderer.setColor(color.x, color.y, color.z, color.w);
		renderer.point(pos.x, pos.y, 0);
		renderer.end();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		renderer.dispose();
	}
	
}