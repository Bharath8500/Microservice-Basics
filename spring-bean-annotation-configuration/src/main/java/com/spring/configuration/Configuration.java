package com.spring.configuration;

import org.springframework.context.annotation.Bean;

import com.spring.annotation.configuration.Address;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean("address")
	public Address getAddressBean() {
		return getAddressInfo();
	}
	public Address getAddressInfo() {
		Address address = new Address();
		address.setCity("Kurnool");
		address.setPinCode(518002);
		address.setState("A.P");
		return address;
	}

}
