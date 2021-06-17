package Entities;

import java.time.LocalDate;

public class Campaing {
	
	private int campaingId;
	private String campaingName;
	private LocalDate endDate;
	private float discount;
	public Campaing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Campaing(int campaingId, String campaingName, LocalDate endDate, float discount) {
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.endDate = endDate;
		this.discount = discount;
	}
	public int getCampaingId() {
		return campaingId;
	}
	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	

}
