package com.example.OnlineVideoConverter.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public  class DiskSpaceHealthIndicator implements HealthIndicator {
	
	//@Inject
	//private  JustGifItProperties  properties;
	
	@Override
	public Health health(){
		return Health.up().build();
	}
}
