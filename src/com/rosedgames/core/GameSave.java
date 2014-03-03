package com.rosedgames.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rosedgames.items.Inventory;

public class GameSave {

	private SaveData data = null;
	private boolean isLoaded = false;
	private boolean isCreated = false;
	private String filename;
	
	public GameSave(String filename) {
		this.filename = filename;
		create();
	}
	
	public void load() {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("user.dir") + "/resources/saves/" + filename + ".sav")));
			String line = "";
			String json = "";
			while((line = reader.readLine()) != null) {
				json += line;
			}
			reader.close();
			byte[] data = Base64.getMimeDecoder().decode(json.getBytes());
			json = "";
			for(byte c: data) json += (char)c;
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			this.data = gson.fromJson(json, SaveData.class);
			isLoaded = true;
			
		} catch (IOException e) {
			create();
		}
	}
	
	private void create() {
		if(Gdx.files.internal("resources/saves/" + filename + ".sav").exists()) isCreated = true;
		if(isCreated) {
			System.out.println("Save: " + filename + " has already been created and therefore can not be recreated unless the file is deleted!");
			return;
		}
		
		data = new SaveData();
		data.player = new Player(new Vector2(32, 32));
		data.inventory = new Inventory();
		data.level = "Root";
		
		save();
	}
	
	public void save() {
		try {
			Gson builder = new GsonBuilder().create();
			String json = builder.toJson(data);
			json = Base64.getMimeEncoder().encodeToString(json.getBytes());
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir") + "/resources/saves/" + filename + ".sav")));
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		if(isCreated)
			Gdx.files.internal("resources/saves/" + filename + ".sav").delete();
		else
			System.out.println("Save: " + filename + " could not be deleted because the file has not been created!");
	}
	
	public boolean getIsLoaded() {
		return isLoaded;
	}
	
	public boolean getIsCreated() {
		return isCreated;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public SaveData getSaveData() {
		return data;
	}
	
	public final class SaveData {
		public Player player;
		public String level;
		public Inventory inventory;
	}
	
}