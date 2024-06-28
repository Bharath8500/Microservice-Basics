package com.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean_scope.Address;

@Configuration
public class BeanConfig {
	@Bean("address1")
	public Address getAddressBean1() {
		return new Address();
	}
	public Address getAddressInfo() {
		Address address = new Address();
		address.setCity("Kurnool");
		address.setState("A.P");
		return address;
	}
	@Bean("address2")
	public Address getAddressBean2() {
		return getAddressBean2Info();
	}
	public Address getAddressBean2Info() {
		Address address2 = new Address();
		address2.setCity("HYD");
		address2.setState("Telangana");
		return address2;
	}
	@Bean("address3")
	public Address getAddresssBean3() {
		return new Address();
	}
	

}
