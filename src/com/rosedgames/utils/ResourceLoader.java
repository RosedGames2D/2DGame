package com.rosedgames.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class ResourceLoader {

	public static Skin loadSkin(String filename, TextureAtlas atlas) {
		return new Skin(Gdx.files.internal("resources/ui/skins/" + filename + ".json"), atlas);
	}
	
	public static Skin loadSkin(String filename) {
		return new Skin(Gdx.files.internal("resources/ui/skins/" + filename + ".json"));
	}
	
	public static TextureAtlas loadTextureAtlas(String filename) {
		return new TextureAtlas(Gdx.files.internal("resources/textures/" + filename + ".pack"));
	}
	
	public static Image loadImage(String filename) {
		return new Image(loadTexture(filename));
	}
	
	public static Texture loadTexture(String filename) {
		return new Texture(Gdx.files.internal("resources/textures/" + filename));
	}
	
	public static Sprite loadSprite(String filename) {
		return new Sprite(loadTexture("sprites/" + filename + ".png"));
	}
	
}