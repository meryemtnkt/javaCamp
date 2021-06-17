package Concrete;

import Abstract.SaleService;
import Entities.Game;
import Entities.NewGamer;
import Entities.Sale;

public class SaleManager implements SaleService {


	@Override
	public void saleAdd(Sale sale, NewGamer gamer, Game game) {
		System.out.println("Kullan�c� : "+ gamer.getFirstName()  + " " + game.getGameName()+" adl� oyun sepete eklendi");		
		
	}

	@Override
	public void saleDelete(Sale sale, NewGamer gamer, Game game) {
		System.out.println(sale.getSaleId() +" id'li sipari�iniz silindi");			
		
	}

	@Override
	public void saleUpdate(Sale sale, NewGamer gamer, Game game) {
		System.out.println(sale.getSaleId() +"id'li sipari�iniz g�ncellendi");	
		
	}

}
