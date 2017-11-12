package com.d23.gaming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.d23.gaming.entities.Character;
import com.d23.gaming.entities.Location;

public class Engine {
	
	private static Logger logger = LoggerFactory.getLogger(Engine.class);
	
	enum GameStatus
	{
	    RUNNNING, STOPPED;
	}
	
	protected Character character = null;
	protected Location location = null;
	protected GameStatus gameStatus = GameStatus.RUNNNING;
	
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public GameStatus getGameStatus() {
		return gameStatus;
	}
	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}
	public void execute(String command) {
		logger.debug("executing command:".concat(command));
	}
}
