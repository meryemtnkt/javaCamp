package Entities;

import java.time.LocalDate;

public class Game {

	private int gameId;
	private String gameName;
	private LocalDate releaseDate;
	public Game(int gameId, String gameName, LocalDate releaseDate) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.releaseDate = releaseDate;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
