package com.mohitsabhadiya123.SaleCampaignManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SaleCampaignManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleCampaignManagementSystemApplication.class, args);
	}

}
