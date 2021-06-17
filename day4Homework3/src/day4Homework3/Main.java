package day4Homework3;

import java.time.LocalDate;

import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.NewGamerManager;
import Concrete.SaleManager;
import Entities.Campaing;
import Entities.Game;
import Entities.NewGamer;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewGamer gamer=new NewGamer(1, "Tankut", "Meryem", "12345678901");
		Game game1=new Game(101,"GTA",LocalDate.of(2021, 6, 17));
		Campaing campaing1= new Campaing(94, "Babalar Günü Kampanyasý", LocalDate.of(2021, 7, 31), 10);
		Sale sale1=new Sale(55, 1, 101);
		
		
		NewGamerManager gamerManager=new NewGamerManager();
		gamerManager.gamerAdd(gamer);
		
		GameManager gameManager=new GameManager();
		gameManager.gameAdd(game1);
		
		SaleManager saleManager=new SaleManager();
		saleManager.saleAdd(sale1, gamer, game1);
		
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.campaingupdate(campaing1);
		
	}

}
