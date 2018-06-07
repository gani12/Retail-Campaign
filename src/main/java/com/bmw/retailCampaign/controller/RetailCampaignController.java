package com.bmw.retailCampaign.controller;



import java.util.Map;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmw.retailCampaign.vo.CampaignDetail;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;


@RestController()
@RequestMapping("/campaign")
public class RetailCampaignController {

	@Inject
	public HazelcastInstance hazelcastInstance;
	
    @RequestMapping("/details")
    public CampaignDetail campaignDetails(@RequestParam(value="dealerCode", defaultValue="00000") String dealerCode) {
    	/* Add the call to get the campaigndetails for the dealer */
        return getCampaignDetail (dealerCode);
    }
    
    private CampaignDetail getCampaignDetail (String dealerCode) {
    	Map<String,CampaignDetail> campaignDetails = hazelcastInstance.getMap("RetailCampaign") ;
    	
    	return campaignDetails.get(dealerCode);
    }
}