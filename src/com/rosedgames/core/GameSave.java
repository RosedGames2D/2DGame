package com.rosedgames.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import com.google.gson.Gson;
import com.rosedgames.items.Inventory;

//TODO: Implement Base64 encoding/decoding
public class GameSave {

	private SaveData data = null;
	private String filename;
	
	public GameSave(String filename) {
		this.filename = filename;
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
			json = "";
			for(byte c: Base64.getMimeDecoder().decode(json.getBytes())) json += (char)c;
			Gson gson = new Gson();
			this.data = gson.fromJson(json, SaveData.class);
			
		} catch (IOException e) {
			create();
		}
	}
	
	public void create() {
		data = new SaveData();
		data.player = new Player();
		data.inventory = new Inventory();
		data.worldName = "Null";
		
		save();
	}
	
	public void save() {
		try {
			Gson builder = new Gson();
			String json = builder.toJson(data);
			json = Base64.getMimeEncoder().encodeToString(json.getBytes());
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir") + "/resources/saves/" + filename + ".sav")));
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private final class SaveData {
		public Player player;
		public String worldName;
		public Inventory inventory;;
	}
	
}