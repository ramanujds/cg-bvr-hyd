package com.capg.demo.spring;

import java.lang.annotation.Retention;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.demo.spring")
@PropertySource("app.properties")
public class MobileConfigurations {

//	@Bean(name = "vodafone")
//	public VodafoneSim getVodafoneSim() {
//		VodafoneSim vf=new VodafoneSim();
//		vf.setCallCharges(1.75f);
//		vf.setInternetSpeed(6.8f);
//		Map<String, Long> contacts=new HashMap<>();
//		contacts.put("Rahul", 751548412L);
//		contacts.put("Krishna",841649812L);
//		vf.setContacts(contacts);
//		return vf;
//	}
	
}
