package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void gameAdd(Game game) {
		System.out.println(game.getGameName() + " adl� oyun eklendi.");
		
	}

	@Override
	public void gameDelete(Game game) {
		System.out.println(game.getGameName() + " adl� oyun silindi.");
		
	}

	@Override
	public void gameUpdate(Game game) {
		System.out.println(game.getGameName() + " adl� oyun g�ncellendi.");
		
	}

}
