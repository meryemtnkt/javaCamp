package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void campaingAdd(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adl� yeni kampanya eklendi.");
		
	}

	@Override
	public void campaingDelete(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adl� kampanya silindi.");
		
	}

	@Override
	public void campaingupdate(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adl� kampanyan�n son g�n tarihi de�i�tirildi. Son g�n :" + campaing.getEndDate());

		
	}

}
