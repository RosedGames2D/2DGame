package com.rosedgames.core;

/**
 * Simple vector class which contains four values
 * 
 * @author Liam Potter
 */
public class Vector4 {
	
	public float x;
	public float y;
	public float z;
	public float w;
	
	/**
	 * Initialises all vector values to 0.0f
	 */
	public Vector4() {
		this(0.0f, 0.0f, 0.0f, 0.0f);
	}
	
	/**
	 * Initialises all vector values to the passed value
	 * @param value
	 */
	public Vector4(float value) {
		this(value, value, value, value);
	}
	
	/**
	 * Initialises all vector values to their passed independent values
	 * @param x
	 * @param y
	 * @param z
	 * @param w
	 */
	public Vector4(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Initialises all vector values to that of another Vector4
	 * @param vector
	 */
	public Vector4(Vector4 vector) {
		this(vector.x, vector.y, vector.z, vector.w);
	}
	
}