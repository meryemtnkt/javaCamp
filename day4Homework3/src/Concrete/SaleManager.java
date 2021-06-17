package Concrete;

import Abstract.SaleService;
import Entities.Game;
import Entities.NewGamer;
import Entities.Sale;

public class SaleManager implements SaleService {


	@Override
	public void saleAdd(Sale sale, NewGamer gamer, Game game) {
		System.out.println("Kullanýcý : "+ gamer.getFirstName()  + " " + game.getGameName()+" adlý oyun sepete eklendi");		
		
	}

	@Override
	public void saleDelete(Sale sale, NewGamer gamer, Game game) {
		System.out.println(sale.getSaleId() +" id'li sipariþiniz silindi");			
		
	}

	@Override
	public void saleUpdate(Sale sale, NewGamer gamer, Game game) {
		System.out.println(sale.getSaleId() +"id'li sipariþiniz güncellendi");	
		
	}

}
