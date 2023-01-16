package com.archimedis.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor mobileProcessor;
	
	public MobileProcessor getMobileProcessor() {
		return mobileProcessor;
	}

	public void setMobileProcessor(MobileProcessor mobileProcessor) {
		this.mobileProcessor = mobileProcessor;
	}

	public void config() {
		System.out.println("Octa Core,4 gb Ram,12Mp camera");
		mobileProcessor.process();
	}

}
