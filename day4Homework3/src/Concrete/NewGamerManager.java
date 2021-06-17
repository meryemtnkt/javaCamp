package Concrete;

import Abstract.NewGamerService;
import Adapter.GamerCheck;
import Entities.NewGamer;

public class NewGamerManager implements NewGamerService {

	@Override
	public void gamerAdd(NewGamer gamer) {
		boolean rest=GamerCheck.userCheck(gamer);
		if(rest) {
			System.out.println(gamer.getFirstName() + " adl� kullan�c� eklendi.");
		}
		else {
			System.out.println(gamer.getFirstName() + " adl� kullan�c� eklenemdi.");

		}
	}

	@Override
	public void gamerDelete(NewGamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� kullan�c� silindi.");
		
	}

	@Override
	public void gamerUpdate(NewGamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� kullan�c� g�ncellendi.");
		
	}

}
