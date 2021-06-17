package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void campaingAdd(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adlý yeni kampanya eklendi.");
		
	}

	@Override
	public void campaingDelete(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adlý kampanya silindi.");
		
	}

	@Override
	public void campaingupdate(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + " adlý kampanyanýn son gün tarihi deðiþtirildi. Son gün :" + campaing.getEndDate());

		
	}

}
