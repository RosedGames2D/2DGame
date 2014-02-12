package com.rosedgames.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Contains all the functions needed to quickly load resources
 * 
 * @author Liam Potter
 */
public class ResourceLoader {

	/**
	 * Returns a Skin instance
	 * @param filename
	 * @param atlas
	 * @return Skin
	 */
	public static Skin getSkin(String filename, TextureAtlas atlas) {
		return new Skin(Gdx.files.internal(System.getProperty("user.dir") + "/resources/ui/skins/" + filename + ".json"), atlas);
	}
	
	/**
	 * Returns a Skin instance
	 * @param filename
	 * @return Skin
	 */
	public static Skin getSkin(String filename) {
		return new Skin(Gdx.files.internal(System.getProperty("user.dir") + "/resources/ui/skins/" + filename + ".json"));
	}
	
	/**
	 * Returns a TextureAtlas instance
	 * @param filename
	 * @return TextureAtlas
	 */
	public static TextureAtlas getTextureAtlas(String filename) {
		return new TextureAtlas(Gdx.files.internal(System.getProperty("user.dir") + "/resources/textures/" + filename + ".pack"));
	}
	
}