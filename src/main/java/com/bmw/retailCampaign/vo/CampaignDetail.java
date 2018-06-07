package com.bmw.retailCampaign.vo;

import java.io.Serializable;

public class CampaignDetail implements Serializable{
	private String campaignNumber;
	private String campaignName;
	
	public CampaignDetail(String campaignNumber, String campaignName) {
		super();
		this.campaignNumber = campaignNumber;
		this.campaignName = campaignName;
	}
	
	
	public String getCampaignNumber() {
		return campaignNumber;
	}
	public void setCampaignNumber(String campaignNumber) {
		this.campaignNumber = campaignNumber;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
	
	
}
