package Entities;

public class Sale {
	private int saleId;
	private int gamerId;
	private int gameId;
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sale(int saleId, int gamerId, int gameId) {
		super();
		this.saleId = saleId;
		this.gamerId = gamerId;
		this.gameId = gameId;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	

}
