package Concrete;

import Abstract.NewGamerService;
import Adapter.GamerCheck;
import Entities.NewGamer;

public class NewGamerManager implements NewGamerService {

	@Override
	public void gamerAdd(NewGamer gamer) {
		boolean rest=GamerCheck.userCheck(gamer);
		if(rest) {
			System.out.println(gamer.getFirstName() + " adlý kullanýcý eklendi.");
		}
		else {
			System.out.println(gamer.getFirstName() + " adlý kullanýcý eklenemdi.");

		}
	}

	@Override
	public void gamerDelete(NewGamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý kullanýcý silindi.");
		
	}

	@Override
	public void gamerUpdate(NewGamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý kullanýcý güncellendi.");
		
	}

}
