package com.bmw.retailCampaign.config;

import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bmw.retailCampaign.vo.CampaignDetail;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;


@Configuration
public class RetailCampaignConfiguration {
	@Bean
	public HazelcastInstance hazelcastInstance () {
		Config cfg = new Config();
		HazelcastInstance  hazelcastInstance =  Hazelcast.newHazelcastInstance(cfg);
		Map<String,CampaignDetail> campaignDetails = hazelcastInstance.getMap("RetailCampaign") ;
		campaignDetails.put("12345", new CampaignDetail("12345", "Takata Airbag Recall"));
	    return hazelcastInstance ;
	}
}


