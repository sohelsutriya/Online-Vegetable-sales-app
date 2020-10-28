package com.cg.ovs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cg.ovs.bean.Admin;
import com.cg.ovs.dao.AdminDao;

@SpringBootApplication
public class LoginmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginmicroserviceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
	@Bean
	public Admin addAdmin(AdminDao dao) {
		Admin admin1=new Admin("Sinhgad","admin123");
		Admin admin2=new Admin("Capgemini","admin1234");
		dao.save(admin1);
		dao.save(admin2);
		return admin1;
	}
}
