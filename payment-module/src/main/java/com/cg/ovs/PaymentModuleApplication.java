package com.cg.ovs;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class PaymentModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentModuleApplication.class, args);
	}
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				   .select()
				   .paths(PathSelectors.any())
				   .apis(RequestHandlerSelectors.basePackage("com.cg.ovs"))
				   .build()
				   .apiInfo(myApiInfo());
	}
	
	private ApiInfo myApiInfo() {
		ApiInfo apiInfo=new ApiInfo("Spring With Swagger Api","Api Creation","1.0","Free to use",new Contact("Ravi Kumar","/limits","rk@cg.com"),
				"API licence","/limits",Collections.emptyList());
		return apiInfo;
	}
	@Bean
	public RestTemplate createTemplate() {
		return new RestTemplate();
	}
}
