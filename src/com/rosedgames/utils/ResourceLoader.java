package com.rosedgames.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class ResourceLoader {

	public static Skin getSkin(String filename, TextureAtlas atlas) {
		return new Skin(Gdx.files.internal(System.getProperty("user.dir") + "/resources/ui/skins/" + filename + ".json"), atlas);
	}
	
	public static Skin getSkin(String filename) {
		return new Skin(Gdx.files.internal(System.getProperty("user.dir") + "/resources/ui/skins/" + filename + ".json"));
	}
	
	public static TextureAtlas getTextureAtlas(String filename) {
		return new TextureAtlas(Gdx.files.internal(System.getProperty("user.dir") + "/resources/textures/" + filename + ".pack"));
	}
	
}